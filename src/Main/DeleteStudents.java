/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author rkhan
 */
public class DeleteStudents extends javax.swing.JFrame {

    /**
     * Creates new form DeleteStudents
     */
    public DeleteStudents() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,255));
        setIconImage(new ImageIcon(getClass().getResource("/Images/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 196, 75));
        jLabel1.setText("Name of Class:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 40));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 196, 75));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 196, 75), 2));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Champagne & Limousines", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 196, 75));
        jLabel3.setText("Delete");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, 40));

        setSize(new java.awt.Dimension(431, 205));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       String clss = jTextField1.getText();
       String qry = "DELETE FROM main where std_class= '"+clss+"'";
       //qry = qry.replace("xxx", clss);
        System.out.println(qry);
       Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
            Statement st = conn.createStatement();
            int r = st.executeUpdate(qry);
            
            if(r > 0){
                this.dispose();
                StartGUI.displayMessage("Records Deleted Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, null, ex);
            StartGUI.displayMessage("Table by that name does not exist!");
        }
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String clss = jTextField1.getText();
       String qry = "DELETE FROM main where std_class= '"+clss+"'";
       //qry = qry.replace("xxx", clss);
        System.out.println(qry);
       Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
            Statement st = conn.createStatement();
            int r = st.executeUpdate(qry);
            
            if(r == 0){
                this.dispose();
                StartGUI.displayMessage("Records Deleted Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, null, ex);
            StartGUI.displayMessage("Table by that name does not exist!");
        }
      
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
