/*



                    This page will appear after clicking the Adimn>ManageMovies Btn





 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;

/**
 *
 * @author 59510
 */
public class aUpdateTicketPrices extends javax.swing.JFrame {

    /**
     * Creates new form aUpdateTicketPrices
     */
    public aUpdateTicketPrices() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelSelectMovieNameToUpdatePrice = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        NewPriceLabel = new javax.swing.JLabel();
        txtFieldEnterNewPrice = new javax.swing.JTextField();
        OkBtn = new javax.swing.JButton();
        SuccessfulORnot = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        MoveToAdminTaskPagebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelSelectMovieNameToUpdatePrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelSelectMovieNameToUpdatePrice.setForeground(new java.awt.Color(255, 255, 255));
        LabelSelectMovieNameToUpdatePrice.setText("Select the movie whose price you want to update. ");
        LabelSelectMovieNameToUpdatePrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(LabelSelectMovieNameToUpdatePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6 ", "Movie 7 ", "Movie 8 ", "Movie 9", "Movie 10", "Movie 11", "Movie 12", "Movies 13", "Movie 14", "Movie 15" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 340, -1));

        NewPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewPriceLabel.setText("Enter the new price in Pkr");
        NewPriceLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(NewPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, -1));
        jPanel1.add(txtFieldEnterNewPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, -1));

        OkBtn.setBackground(new java.awt.Color(0, 255, 102));
        OkBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OkBtn.setText("Ok");
        OkBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(OkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 70, -1));

        SuccessfulORnot.setForeground(new java.awt.Color(255, 255, 255));
        SuccessfulORnot.setText("Result");
        jPanel1.add(SuccessfulORnot, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 10));

        MoveToAdminTaskPagebtn.setBackground(new java.awt.Color(51, 51, 51));
        MoveToAdminTaskPagebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MoveToAdminTaskPagebtn.setForeground(new java.awt.Color(255, 255, 255));
        MoveToAdminTaskPagebtn.setText("Back");
        jPanel1.add(MoveToAdminTaskPagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\59510\\Downloads\\required3.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(aUpdateTicketPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aUpdateTicketPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aUpdateTicketPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aUpdateTicketPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aUpdateTicketPrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSelectMovieNameToUpdatePrice;
    private javax.swing.JButton MoveToAdminTaskPagebtn;
    private javax.swing.JLabel NewPriceLabel;
    private javax.swing.JButton OkBtn;
    private javax.swing.JLabel SuccessfulORnot;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField txtFieldEnterNewPrice;
    // End of variables declaration//GEN-END:variables
}