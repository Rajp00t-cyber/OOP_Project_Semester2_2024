/*




                                         Page "1a"
               This page will appear after clicking the Admin login btn in 1 page 




 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;

/**
 *
 * @author 59510
 */
public class AdminLoginPage1 extends javax.swing.JFrame {

    /**
     * Creates new form AdminLoginPage1
     */
    public AdminLoginPage1() {
        initComponents();
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
        LoginPageAdminCMS = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        enterUsernameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        enterPasswordField = new javax.swing.JPasswordField();
        jProgressBar1 = new javax.swing.JProgressBar();
        LoginAsAdminbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPageAdminCMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginPageAdminCMS.setText("\"Cinema Management System\"");
        jPanel2.add(LoginPageAdminCMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UsernameLabel.setText("Username:");
        jPanel2.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        enterUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUsernameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(enterUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, -1));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PasswordLabel.setText("Password :");
        jPanel2.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, -1));
        jPanel2.add(enterPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, -1));

        jProgressBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 10));

        LoginAsAdminbtn.setBackground(new java.awt.Color(0, 255, 102));
        LoginAsAdminbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginAsAdminbtn.setText("Login As Admin");
        LoginAsAdminbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.add(LoginAsAdminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 130, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logging You In...");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\59510\\Downloads\\required2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterUsernameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginPage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginAsAdminbtn;
    private javax.swing.JLabel LoginPageAdminCMS;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPasswordField enterPasswordField;
    private javax.swing.JTextField enterUsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
