/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import proyecto.pkg1.FuncionesGrafo;
import proyecto.pkg1.MatrizAdyacencia;

/**
 *
 * @author emilianaplaz
 */
public class VentanaEliminarUsuario extends javax.swing.JFrame {
    public static VentanaModificarLista v3;
    /**
     * Creates new form VentanaEliminarUsuario
     */
    public VentanaEliminarUsuario(VentanaModificarLista v3) {
        this.v3=v3;
        initComponents();
        this.setLocationRelativeTo(null);
        lbl_usuario_elim.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_usuario_agg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        eliminar_usuario = new javax.swing.JButton();
        lbl_ingrese_usuario_elim = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_usuario_elim = new javax.swing.JLabel();
        usuario_eliminar = new javax.swing.JComboBox<>();

        lbl_usuario_agg.setBackground(new java.awt.Color(255, 255, 255));
        lbl_usuario_agg.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbl_usuario_agg.setForeground(new java.awt.Color(0, 51, 102));
        lbl_usuario_agg.setText("Usuario Agregado!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminar_usuario.setBackground(new java.awt.Color(0, 51, 102));
        eliminar_usuario.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        eliminar_usuario.setText("Eliminar ");
        eliminar_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 250, -1));

        lbl_ingrese_usuario_elim.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        lbl_ingrese_usuario_elim.setForeground(new java.awt.Color(0, 51, 102));
        lbl_ingrese_usuario_elim.setText("Ingrese el usuario que desea eliminar");
        jPanel1.add(lbl_ingrese_usuario_elim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jButton1.setText("<Atrás");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        lbl_usuario_elim.setBackground(new java.awt.Color(255, 255, 255));
        lbl_usuario_elim.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbl_usuario_elim.setForeground(new java.awt.Color(0, 51, 102));
        lbl_usuario_elim.setText("Usuario Eliminado!");

        usuario_eliminar.setFont(new java.awt.Font("Kohinoor Bangla", 0, 14)); // NOI18N
        usuario_eliminar.setModel(new javax.swing.DefaultComboBoxModel(MatrizAdyacencia.getUsuarios()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbl_usuario_elim))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(usuario_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(usuario_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_usuario_elim)
                .addGap(53, 53, 53))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_usuarioActionPerformed
        // TODO add your handling code here:
        MatrizAdyacencia matriz=new MatrizAdyacencia();
        matriz.crear_matriz();
        String usuario_eliminado=usuario_eliminar.getSelectedItem().toString();
        FuncionesGrafo fu = new FuncionesGrafo();
        fu.eliminar_usuario(usuario_eliminado);
        eliminar_usuario.setVisible(false);
        usuario_eliminar.setVisible(false);
        lbl_ingrese_usuario_elim.setVisible(false);
        lbl_usuario_elim.setVisible(true);
        
      
    }//GEN-LAST:event_eliminar_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        v3.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarUsuario(v3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_ingrese_usuario_elim;
    private javax.swing.JLabel lbl_usuario_agg;
    private javax.swing.JLabel lbl_usuario_elim;
    private javax.swing.JComboBox<String> usuario_eliminar;
    // End of variables declaration//GEN-END:variables
}
