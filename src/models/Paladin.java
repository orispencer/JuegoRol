
package models;

import java.util.Random;

public class Paladin extends Personaje {

    //probabilidad de guillotina
    static public final int guillotinaProb = 5;
    public static final int ataquePaladinBase=20;

    public Paladin(String nombre) {
        super(Personaje.vidaMax, ataquePaladinBase, nombre);
    }

    public Paladin(int pt_vida, int pt_ataque, String nombre) {
        super(pt_vida, pt_ataque, nombre);
    }
    
    

    @Override
    public void atacar(Personaje objetivo) {
        if (objetivo != null && !objetivo.equals(this) && objetivo instanceof Aldeano) {
            Random rand = new Random();
            int randomNum = rand.nextInt((5 - 1) + 1) + 1;
            //guillotina
            if (randomNum == guillotinaProb) {
                objetivo.setPt_vida(0);
            }else{
                super.atacar(objetivo);
            }
        }
    }

}
