/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author rkhan
 */
public class Setting extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    int r;
    private String got_oldpass;
    private String got_oldpassuser;
    /**
     * Creates new form Setting
     */
    public Setting() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,255));
        setIconImage(new ImageIcon(getClass().getResource("/Images/icon.png")).getImage());
        PromptSupport.setPrompt("Enter your old password", pass_old);
        PromptSupport.setPrompt("Enter new password", pass_new);
        PromptSupport.setPrompt("Enter new username", new_user);
        PromptSupport.setPrompt("Enter a password", new_password);
        String underlinedLabel = "<html><u>Delete all students in a class</u></html>";
        jLabel9.setText(underlinedLabel);
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
        } catch (SQLException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        new_user = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        user_change = new javax.swing.JTextField();
        new_password = new javax.swing.JPasswordField();
        pass_old = new javax.swing.JPasswordField();
        pass_new = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();
        delete_acc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 196, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings_96px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Setting");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 490));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("Delete All Students in a class");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        new_user.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        new_user.setForeground(new java.awt.Color(0, 196, 75));
        new_user.setToolTipText("Please use _ or . only");
        new_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                new_userKeyReleased(evt);
            }
        });
        getContentPane().add(new_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 30));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 70, -1));

        user_change.setEditable(false);
        user_change.setBackground(new java.awt.Color(255, 255, 255));
        user_change.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        user_change.setForeground(new java.awt.Color(0, 196, 75));
        user_change.setBorder(null);
        getContentPane().add(user_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 140, 20));

        new_password.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        new_password.setForeground(new java.awt.Color(0, 196, 75));
        getContentPane().add(new_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 230, 30));

        pass_old.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        pass_old.setForeground(new java.awt.Color(0, 196, 75));
        getContentPane().add(pass_old, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 230, 30));

        pass_new.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        pass_new.setForeground(new java.awt.Color(0, 196, 75));
        getContentPane().add(pass_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 230, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 196, 75));
        jLabel11.setText("Change Password for:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        forgot.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        forgot.setForeground(new java.awt.Color(0, 196, 75));
        forgot.setText("Forgot?");
        forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
        });
        getContentPane().add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        delete_acc.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        delete_acc.setForeground(new java.awt.Color(0, 196, 75));
        delete_acc.setText("Delete My Account");
        delete_acc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_accMouseClicked(evt);
            }
        });
        getContentPane().add(delete_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel2.setToolTipText("Please use _ or . only");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 196, 75));
        jSeparator1.setForeground(new java.awt.Color(0, 196, 75));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 360, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 196, 75));
        jSeparator2.setForeground(new java.awt.Color(0, 196, 75));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 360, 10));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 196, 75));
        jLabel10.setText("Add new user:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        getAccessibleContext().setAccessibleName("form");

        setSize(new java.awt.Dimension(625, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
       StartGUI.displayMessage("Please contact the developer!");
     
    }//GEN-LAST:event_forgotMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String newuser = new_user.getText();
       String newpass = new_password.getText();
       
        try {
            String qry = "INSERT INTO users"
		+ "(username, pass) VALUES"
		+ "(?,?)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
            pst = conn.prepareStatement(qry);
            pst.setString(1, newuser);
            pst.setString(2, newpass);
            int r = pst.executeUpdate();
            
            if(r > 0){
                StartGUI.displayMessage("User added successfully");
                new_user.setText("");
                new_password.setText("");
            }else{
               StartGUI.displayMessage("User not added");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
            int MYSQL_DUPLICATE_PK = 1062;
            if(ex.getErrorCode() == MYSQL_DUPLICATE_PK ){
                StartGUI.displayMessage("Username already taken.");
            }
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String qry = "Select * from users where username='"+user_change.getText()+"'";
            rs = DatabaseConnection.getData(qry);
            
            while(rs.next()){
                got_oldpass = rs.getString("pass");
                System.out.println(got_oldpass);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
        got_oldpassuser = pass_old.getText();
        
        if(got_oldpass.equals(got_oldpassuser)){
            System.out.println("true");
            try {
                String newpass = pass_new.getText();
                String user = user_change.getText();
                String qry1 = "Update users set pass='"+newpass+"' where username='"+user_change.getText()+"'";
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
                Statement st = conn.createStatement();
                int r = st.executeUpdate(qry1);
                
                if(r>0){
                    StartGUI.displayMessage("Passsword changed successfully!");
                }else if( r != 0){
                    StartGUI.displayMessage("Password changing failed.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(!got_oldpass.equals(got_oldpassuser)){
            
            StartGUI.displayMessage("Incorrect old password.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void delete_accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_accMouseClicked
        try {
           
            int choice  = JOptionPane.showConfirmDialog(pass_new, "Are you sure you want to delete your account?");
            
            if(choice == JOptionPane.YES_OPTION){
            String qry = "Delete from users where username=?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
            pst = conn.prepareStatement(qry);
            pst.setString(1, user_change.getText());
            r = pst.executeUpdate();
            
            }else if(choice == JOptionPane.NO_OPTION){
                return;
            }
            
            if(r>0){
                StartGUI.displayMessage("Account deleted successfully");
                this.dispose();
                StartGUI sg = new StartGUI();
                sg.setVisible(false);
                //sg.dispose();
                
                Login lg = new Login();
                lg.setVisible(true);
                lg.setAlwaysOnTop(true);
            }else{
                StartGUI.displayMessage("Account deletion failed.");
                }
        
        } catch (SQLException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_accMouseClicked

    private void new_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_userKeyReleased
        String useer = new_user.getText();
        if(!useer.matches("^[a-zA-Z0-9_.]+$")){
            jLabel2.setIcon(new ImageIcon(getClass().getResource("/Images/Delete.png")));
            
        }else if(useer.matches("^[a-zA-Z0-9_.]+$")){
            jLabel2.setIcon(new ImageIcon(getClass().getResource("/Images/Check.png")));
        }
    }//GEN-LAST:event_new_userKeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        DeleteStudents ds = new DeleteStudents();
        ds.setVisible(true);
        ds.setAlwaysOnTop(true);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel delete_acc;
    private javax.swing.JLabel forgot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField new_password;
    private javax.swing.JTextField new_user;
    private javax.swing.JPasswordField pass_new;
    private javax.swing.JPasswordField pass_old;
    public javax.swing.JTextField user_change;
    // End of variables declaration//GEN-END:variables
}
