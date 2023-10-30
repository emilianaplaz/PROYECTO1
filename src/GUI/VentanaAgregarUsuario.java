/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import proyecto.pkg1.FuncionesGrafo;
import static proyecto.pkg1.FuncionesGrafo.usuarioExistente;
import proyecto.pkg1.MatrizAdyacencia;


/**
 *
 * @author emilianaplaz
 */
public class VentanaAgregarUsuario extends javax.swing.JFrame {
    public static VentanaModificarLista v3;

    /**
     * Creates new form VentanaAgregarUsuario
     */
    public VentanaAgregarUsuario(VentanaModificarLista v3) {
        this.v3=v3;       
        initComponents();
        this.setLocationRelativeTo(null);
        lbl_usuario_agg.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        lbl_usuario_elim = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        agregar_usuario = new javax.swing.JButton();
        entry_usuario_nuevo = new javax.swing.JTextField();
        lbl_ingrese_usuario = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_usuario_agg = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        lbl_usuario_elim.setBackground(new java.awt.Color(255, 255, 255));
        lbl_usuario_elim.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbl_usuario_elim.setForeground(new java.awt.Color(0, 51, 102));
        lbl_usuario_elim.setText("Usuario Eliminado!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar_usuario.setBackground(new java.awt.Color(0, 51, 102));
        agregar_usuario.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        agregar_usuario.setText("Agregar");
        agregar_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(agregar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, -1));

        entry_usuario_nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        entry_usuario_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_usuario_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(entry_usuario_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, -1));

        lbl_ingrese_usuario.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        lbl_ingrese_usuario.setForeground(new java.awt.Color(0, 51, 102));
        lbl_ingrese_usuario.setText("Ingrese el usuario que desea agregar");
        jPanel1.add(lbl_ingrese_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        atras.setBackground(new java.awt.Color(0, 51, 102));
        atras.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        atras.setText("<Atrás");
        atras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuario_agg.setBackground(new java.awt.Color(255, 255, 255));
        lbl_usuario_agg.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        lbl_usuario_agg.setForeground(new java.awt.Color(0, 51, 102));
        lbl_usuario_agg.setText("Usuario agregado!");
        jPanel2.add(lbl_usuario_agg, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 69, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_usuarioActionPerformed
        // TODO add your handling code here:       
        String nuevo_usuario = entry_usuario_nuevo.getText();
        
        //Validación
        //Caso 1: input vacio
        if (entry_usuario_nuevo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese un usuario");
        }else {
            boolean isAlphanumeric = true;
            
            for (int i = 0; i < nuevo_usuario.length(); i++) {
                if (!Character.isLetterOrDigit(nuevo_usuario.charAt(i))) {
                    isAlphanumeric = false;
                    break;
                }
            }
            
        if (!isAlphanumeric) {
            JOptionPane.showMessageDialog(this, "El usuario sólo debe contener letras y/o números");
        } else {
            MatrizAdyacencia matriz = new MatrizAdyacencia();
            FuncionesGrafo fu = new FuncionesGrafo();
            fu.agregar_usuario(nuevo_usuario);

            //Caso 2: usuario existente
            if (usuarioExistente) {
                JOptionPane.showMessageDialog(this, "Este usuario ya existe");
            //Caso 3: usuario válido
            } else {
                agregar_usuario.setVisible(false);
                entry_usuario_nuevo.setVisible(false);
                lbl_ingrese_usuario.setVisible(false);
                lbl_usuario_agg.setVisible(true);
            }
        }
    }
        
        
        
        
        
        
        
        
        
    
        
 
        
       
        
       
        
        
        
        
        
        
        
       
        
    }//GEN-LAST:event_agregar_usuarioActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void entry_usuario_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_usuario_nuevoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_entry_usuario_nuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarUsuario(v3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_usuario;
    private javax.swing.JButton atras;
    private javax.swing.JTextField entry_usuario_nuevo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_ingrese_usuario;
    private javax.swing.JLabel lbl_usuario_agg;
    private javax.swing.JLabel lbl_usuario_elim;
    // End of variables declaration//GEN-END:variables
}
