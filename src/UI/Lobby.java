package UI;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Aldeano;
import models.Mago;
import models.Paladin;
import models.Personaje;

public class Lobby extends javax.swing.JFrame {

    DefaultTableModel modelo;
    List<Personaje> listaPersonajes = new ArrayList<>();

    public Lobby(String nombreUsuario) {
        initComponents();
        modelo = (DefaultTableModel) tablaPersonajes.getModel();
        this.setTitle("usuario:" + nombreUsuario);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonajes = new javax.swing.JTable(){
            public Class getColumnClass(int column){
                return getValueAt(0, column).getClass();
            }
        };
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfNombre = new javax.swing.JTextPane();
        jjjh = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lbimagen = new javax.swing.JLabel();
        btCrear = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logo.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(255, 51, 204));

        tablaPersonajes.setBackground(new java.awt.Color(0, 255, 255));
        tablaPersonajes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        tablaPersonajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ataque", "Vida", "Tipo", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPersonajes.setGridColor(new java.awt.Color(0, 255, 255));
        tablaPersonajes.setRowHeight(130);
        jScrollPane1.setViewportView(tablaPersonajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 380, 480));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("Nombre");

        jScrollPane2.setViewportView(tfNombre);

        jjjh.setText("Rol");

        cbRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aldeano", "Mago", "Paladin" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        jLabel3.setText("Imagen");

        lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/aldeano.jpg"))); // NOI18N

        btCrear.setText("Crear");
        btCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jjjh)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(cbRol, 0, 128, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrear)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jjjh)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btCrear)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personajes", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 280, 340));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        switch ((String) cbRol.getSelectedItem()) {
            case "Aldeano":
                lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/aldeano.jpg")));
                break;

            case "Mago":
                lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/mago.jpg")));
                break;

            case "Paladin":
                lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/paladin.jpg")));
                break;
        }
    }//GEN-LAST:event_cbRolActionPerformed

    private void btCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearMouseClicked
        switch ((String) cbRol.getSelectedItem()) {
            case "Aldeano":
                Aldeano aldeano = new Aldeano(tfNombre.getText());
                listaPersonajes.add(aldeano);
                modelo.addRow(new Object[]{
                    aldeano.getNombre(),
                    aldeano.getPt_ataque(),
                    aldeano.getPt_vida(),
                    "Aldeano",
                    new javax.swing.ImageIcon(getClass().getResource("/resources/characters/aldeano.jpg"))
                        
                });

                break;

            case "Mago":
                Mago mago = new Mago(tfNombre.getText());
                listaPersonajes.add(mago);
                modelo.addRow(new Object[]{
                    mago.getNombre(),
                    mago.getPt_ataque(),
                    mago.getPt_vida(),
                    "Mago",
                    new javax.swing.ImageIcon(getClass().getResource("/resources/characters/mago.jpg"))
                       
                });
                break;

            case "Paladin":
                Paladin paladin = new Paladin(tfNombre.getText());
                listaPersonajes.add(paladin);
                modelo.addRow(new Object[]{
                    paladin.getNombre(),
                    paladin.getPt_ataque(),
                    paladin.getPt_vida(),
                    "paladin",
                    new javax.swing.ImageIcon(getClass().getResource("/resources/characters/paladin.jpg"))
                        
                });
                break;
        }
    }//GEN-LAST:event_btCrearMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btCrear;
    private javax.swing.JComboBox cbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jjjh;
    private javax.swing.JLabel lbimagen;
    private javax.swing.JTable tablaPersonajes;
    private javax.swing.JTextPane tfNombre;
    // End of variables declaration//GEN-END:variables
}
