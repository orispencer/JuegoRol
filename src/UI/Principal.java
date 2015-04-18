
package UI;

import java.awt.event.KeyEvent;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        
        initComponents();
        setLocationRelativeTo(null);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdlogin = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextPane();
        btEntrar = new javax.swing.JButton();
        inicio = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jdlogin.setModal(true);
        jdlogin.setResizable(false);

        jLabel1.setText("Usuario");

        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyReleased(evt);
            }
        });

        btEntrar.setText("Enviar");
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jdloginLayout = new javax.swing.GroupLayout(jdlogin.getContentPane());
        jdlogin.getContentPane().setLayout(jdloginLayout);
        jdloginLayout.setHorizontalGroup(
            jdloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdloginLayout.createSequentialGroup()
                .addGroup(jdloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdloginLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdloginLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btEntrar)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jdloginLayout.setVerticalGroup(
            jdloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdloginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jdloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btEntrar)
                .addGap(45, 45, 45))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Rol :)");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logo.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logo.png"))); // NOI18N
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 100, 100));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        this.jdlogin.setLocationRelativeTo(this);
        this.jdlogin.pack();
        this.jdlogin.setVisible(true);
    }//GEN-LAST:event_inicioMouseClicked

    private void btEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseClicked
        this.dispose();
        this.jdlogin.dispose();
        new Lobby(tfUsuario.getText()).setVisible(true);
    }//GEN-LAST:event_btEntrarMouseClicked

    private void tfUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btEntrarMouseClicked(null);
        }
    }//GEN-LAST:event_tfUsuarioKeyReleased

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDialog jdlogin;
    private javax.swing.JTextPane tfUsuario;
    // End of variables declaration//GEN-END:variables
}
