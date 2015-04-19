package UI;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Aldeano;
import models.Mago;
import models.Paladin;
import models.Personaje;

public class Lobby extends javax.swing.JFrame {

    DefaultTableModel modelo;
    List<Personaje> listaPersonajes = new ArrayList<>();
    private int contadorPersonajes=6;
    
    DefaultTableModel modelo1;
    List<Personaje> listaPersonajes1 = new ArrayList<>();
    private int contadorPersonajes1=6;
        
    
    public Lobby(String nombreUsuario) {
        initComponents();
        modelo = (DefaultTableModel) tablaPersonajes.getModel();
        modelo1 = (DefaultTableModel) tablaPersonajes1.getModel();
        this.setTitle("usuario:" + nombreUsuario);
        this.setLocationRelativeTo(null);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        tbpEq = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonajes = new javax.swing.JTable(){
            public Class getColumnClass(int column){
                return getValueAt(0, column).getClass();
            }
        };
        jLabel2 = new javax.swing.JLabel();
        tfEq1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPersonajes1 = new javax.swing.JTable(){
            public Class getColumnClass(int column){
                return getValueAt(0, column).getClass();
            }
        };
        jLabel4 = new javax.swing.JLabel();
        tfEq2 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logo.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("Nombre");

        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNombreKeyReleased(evt);
            }
        });
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
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jjjh)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(cbRol, 0, 177, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btCrear)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jjjh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btCrear)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Personajes", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 280, 350));

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
        tablaPersonajes.setToolTipText("Seleccione un personaje y presione DELETE para eliminar");
        tablaPersonajes.setGridColor(new java.awt.Color(0, 255, 255));
        tablaPersonajes.setRowHeight(130);
        tablaPersonajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaPersonajes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaPersonajesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonajes);

        jLabel2.setText("Nombre de Equipo");

        tfEq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEq1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tfEq1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbpEq.addTab("Equipo 1", jPanel2);

        jScrollPane3.setForeground(new java.awt.Color(255, 51, 204));

        tablaPersonajes1.setBackground(new java.awt.Color(0, 255, 255));
        tablaPersonajes1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        tablaPersonajes1.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPersonajes1.setToolTipText("Seleccione un personaje y presione DELETE para eliminar");
        tablaPersonajes1.setGridColor(new java.awt.Color(0, 255, 255));
        tablaPersonajes1.setRowHeight(130);
        tablaPersonajes1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaPersonajes1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaPersonajes1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablaPersonajes1);

        jLabel4.setText("Nombre de Equipo");

        tfEq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEq2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tfEq2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbpEq.addTab("Equipo 2", jPanel4);

        getContentPane().add(tbpEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 390, 540));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, -1));

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
        
        if (tbpEq.getSelectedIndex() == 0 && contadorPersonajes == 0
                || tbpEq.getSelectedIndex() == 1 && contadorPersonajes1 == 0) {
            JOptionPane.showMessageDialog(this,
                    "Ya posee el numero maximo de muñecos creados en este equipo");
            return;
        } 
        
        if (tfNombre.getText().equals("")){
            tfNombre.requestFocus();
            return;
        }
        Personaje p=null;
        String tipo="";
        
        switch ((String) cbRol.getSelectedItem()) {
            case "Aldeano":
                p = new Aldeano(tfNombre.getText());
                
                tipo= "Aldeano";
                

                break;

            case "Mago":
                p = new Mago(tfNombre.getText());
                
                tipo="Mago";
                break;

            case "Paladin":
                p = new Paladin(tfNombre.getText());
                
                tipo="Paladin";
                break;
        }
        
        switch (tbpEq.getSelectedIndex()) {
            case 0:
                modelo.addRow(new Object[]{
                    p.getNombre(),
                    p.getPt_ataque(),
                    p.getPt_vida(),
                    tipo,
                    new javax.swing.ImageIcon(getClass().getResource("/resources/characters/"+tipo.toLowerCase()+".jpg"))
                        
                });
                listaPersonajes.add(p);
                contadorPersonajes--;
                break;
            case 1:
                
                modelo1.addRow(new Object[]{
                    p.getNombre(),
                    p.getPt_ataque(),
                    p.getPt_vida(),
                    tipo,
                    new javax.swing.ImageIcon(getClass().getResource("/resources/characters/"+tipo.toLowerCase()+".jpg"))
                        
                });
                listaPersonajes1.add(p);
                contadorPersonajes1--;
                break;
            default:
                throw new AssertionError();
        }
        
        
        
        tfNombre.setText("");
        
       
    }//GEN-LAST:event_btCrearMouseClicked

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCrearActionPerformed

    private void tablaPersonajesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPersonajesKeyReleased
        
        if(tablaPersonajes.getSelectedRow()== -1){
        
        }
        
        int fila=tablaPersonajes.getSelectedRow();
        
         if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            modelo.removeRow(fila);
            listaPersonajes.remove(fila);
            contadorPersonajes++;
        }
    }//GEN-LAST:event_tablaPersonajesKeyReleased

    private void tfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyReleased
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btCrearMouseClicked(null);
        }
    }//GEN-LAST:event_tfNombreKeyReleased

    private void tfEq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEq1ActionPerformed

    private void tablaPersonajes1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPersonajes1KeyReleased
        
        if(tablaPersonajes1.getSelectedRow()== -1){
        
        }
        
        int fila=tablaPersonajes1.getSelectedRow();
        
         if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            modelo1.removeRow(fila);
            listaPersonajes1.remove(fila);
            contadorPersonajes1++;
        }
    }//GEN-LAST:event_tablaPersonajes1KeyReleased

    private void tfEq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEq2ActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jjjh;
    private javax.swing.JLabel lbimagen;
    private javax.swing.JTable tablaPersonajes;
    private javax.swing.JTable tablaPersonajes1;
    private javax.swing.JTabbedPane tbpEq;
    private javax.swing.JTextField tfEq1;
    private javax.swing.JTextField tfEq2;
    private javax.swing.JTextPane tfNombre;
    // End of variables declaration//GEN-END:variables
}
