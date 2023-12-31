/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author emilianaplaz
 */
public class VentanaModificarLista extends javax.swing.JFrame {
    public static VentanaFuncionesLista v2;
    /**
     * Creates new form VentanaModificarLista
     */
    public VentanaModificarLista(VentanaFuncionesLista v2) {
        this.v2=v2;
        initComponents();
        this.setLocationRelativeTo(null);
        
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_agg_usuario = new javax.swing.JButton();
        btn_eliminar_us = new javax.swing.JButton();
        btn_agg_rel = new javax.swing.JButton();
        btn_elim_rel = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setBackground(new java.awt.Color(0, 51, 102));
        atras.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        atras.setText("<Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agg_usuario.setBackground(new java.awt.Color(0, 51, 102));
        btn_agg_usuario.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        btn_agg_usuario.setText("Agregar Usuario");
        btn_agg_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_agg_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agg_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agg_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        btn_eliminar_us.setBackground(new java.awt.Color(0, 51, 102));
        btn_eliminar_us.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        btn_eliminar_us.setText("Eliminar Usuario");
        btn_eliminar_us.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_usActionPerformed(evt);
            }
        });
        jPanel2.add(btn_eliminar_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        btn_agg_rel.setBackground(new java.awt.Color(0, 51, 102));
        btn_agg_rel.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        btn_agg_rel.setText("Agregar Relación");
        btn_agg_rel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_agg_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agg_relActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agg_rel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, -1));

        btn_elim_rel.setBackground(new java.awt.Color(0, 51, 102));
        btn_elim_rel.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        btn_elim_rel.setText("Eliminar relación");
        btn_elim_rel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_elim_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elim_relActionPerformed(evt);
            }
        });
        jPanel2.add(btn_elim_rel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agg_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agg_usuarioActionPerformed
        // TODO add your handling code here:
        VentanaAgregarUsuario agregar_usuario= new VentanaAgregarUsuario (this);
        agregar_usuario.setVisible(true); 
    }//GEN-LAST:event_btn_agg_usuarioActionPerformed

    private void btn_eliminar_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_usActionPerformed
        // TODO add your handling code here:
        VentanaEliminarUsuario eliminar_usuario= new VentanaEliminarUsuario (this);
        eliminar_usuario.setVisible(true);
    }//GEN-LAST:event_btn_eliminar_usActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        v2.setVisible(true);
        
    }//GEN-LAST:event_atrasActionPerformed

    private void btn_agg_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agg_relActionPerformed
        // TODO add your handling code here:
        VentanaAgregarConexion conexion = new VentanaAgregarConexion(this);
        conexion.setVisible(true);
    }//GEN-LAST:event_btn_agg_relActionPerformed

    private void btn_elim_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elim_relActionPerformed
        // TODO add your handling code here:
        VentanaEliminarConexion elim_conexion = new VentanaEliminarConexion(this);
        elim_conexion.setVisible(true);
    }//GEN-LAST:event_btn_elim_relActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarLista(v2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton btn_agg_rel;
    private javax.swing.JButton btn_agg_usuario;
    private javax.swing.JButton btn_elim_rel;
    private javax.swing.JButton btn_eliminar_us;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
