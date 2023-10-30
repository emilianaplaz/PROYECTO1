/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import proyecto.pkg1.FuncionesGrafo;
import static proyecto.pkg1.FuncionesGrafo.relacionExistente;
import proyecto.pkg1.MatrizAdyacencia;

/**
 *
 * @author emilianaplaz
 */
public class VentanaEliminarConexion extends javax.swing.JFrame {
    
    public static VentanaModificarLista v3;

    /**
     * Creates new form VentanaEliminarConexion
     */
    public VentanaEliminarConexion(VentanaModificarLista v3) {
        initComponents();
        this.v3=v3;
        this.setLocationRelativeTo(null);
        lbl_rel_elim.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        entry_relacion_elim_1 = new javax.swing.JComboBox<>();
        entry_relacion_elim_2 = new javax.swing.JComboBox<>();
        elim_rel_btn = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl_rel_elim = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 51, 102));
        lbl1.setText("Ingrese la relación que desea eliminar");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        entry_relacion_elim_1.setModel(new javax.swing.DefaultComboBoxModel(MatrizAdyacencia.getUsuarios()));
        jPanel1.add(entry_relacion_elim_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, -1));

        entry_relacion_elim_2.setModel(new javax.swing.DefaultComboBoxModel(MatrizAdyacencia.getUsuarios()));
        jPanel1.add(entry_relacion_elim_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, -1));

        elim_rel_btn.setBackground(new java.awt.Color(0, 51, 102));
        elim_rel_btn.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        elim_rel_btn.setText("Eliminar relación");
        elim_rel_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        elim_rel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elim_rel_btnActionPerformed(evt);
            }
        });
        jPanel1.add(elim_rel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lbl2.setFont(new java.awt.Font("Kohinoor Bangla", 0, 14)); // NOI18N
        lbl2.setText("El orden de los usuarios es importante");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        lbl4.setFont(new java.awt.Font("Kohinoor Bangla", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(102, 102, 102));
        lbl4.setText("Usuario 2");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        lbl3.setFont(new java.awt.Font("Kohinoor Bangla", 0, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(102, 102, 102));
        lbl3.setText("Usuario 1");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_rel_elim.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        lbl_rel_elim.setForeground(new java.awt.Color(0, 51, 102));
        lbl_rel_elim.setText("Relación eliminada!");
        jPanel1.add(lbl_rel_elim, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 230));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jButton1.setText("<Atrás");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void elim_rel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elim_rel_btnActionPerformed
        // TODO add your handling code here:
        if (entry_relacion_elim_1.getSelectedItem()==entry_relacion_elim_2.getSelectedItem()){
            JOptionPane.showMessageDialog(this,"Ingrese una relación válida");
        }else{
            MatrizAdyacencia matriz=new MatrizAdyacencia();
            String relacion1=entry_relacion_elim_1.getSelectedItem().toString();
            String relacion2=entry_relacion_elim_2.getSelectedItem().toString();
            FuncionesGrafo fu = new FuncionesGrafo();
            fu.eliminar_relacion(relacion1, relacion2);
            if (relacionExistente==false){
                JOptionPane.showMessageDialog(this,"Esta relación no existe");
            }else{
                lbl1.setVisible(false);
                lbl2.setVisible(false);
                lbl3.setVisible(false);
                lbl4.setVisible(false);
                entry_relacion_elim_1.setVisible(false);
                entry_relacion_elim_2.setVisible(false);
                elim_rel_btn.setVisible(false);
                lbl_rel_elim.setVisible(true);
            }
        }  
    }//GEN-LAST:event_elim_rel_btnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEliminarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarConexion(v3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton elim_rel_btn;
    private javax.swing.JComboBox<String> entry_relacion_elim_1;
    private javax.swing.JComboBox<String> entry_relacion_elim_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl_rel_elim;
    // End of variables declaration//GEN-END:variables
}
