/*




                     This page will appear after clicking the UserWork>Ticket Btn

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;

/**
 *
 * @author 59510
 */
public class uTickets extends javax.swing.JFrame {

    /**
     * Creates new form uTickets
     */
    public uTickets() {
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
        LabelCostomerName = new javax.swing.JLabel();
        TextFieldCostomerName = new javax.swing.JTextField();
        LabelMovieName = new javax.swing.JLabel();
        LabelMovieShowTime = new javax.swing.JLabel();
        TextFieldMovieShowTime = new javax.swing.JTextField();
        LabelMovieReleaseDate = new javax.swing.JLabel();
        TextFieldMovieReleaseDate = new javax.swing.JTextField();
        ComboBoxMovieName = new javax.swing.JComboBox<>();
        LabelPaymentMethod = new javax.swing.JLabel();
        RadioButtonCash = new javax.swing.JRadioButton();
        RadioButtonCard = new javax.swing.JRadioButton();
        MoveToUserTaskPageBTn = new javax.swing.JButton();
        GenerateTicketBtn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        SuccessfulORnotSHOW = new javax.swing.JLabel();
        SelectAvailableSeat = new javax.swing.JLabel();
        TextFieldSeatNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCostomerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelCostomerName.setForeground(new java.awt.Color(255, 255, 255));
        LabelCostomerName.setText("Customer's Full Name :");
        LabelCostomerName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(LabelCostomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        TextFieldCostomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCostomerNameActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldCostomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        LabelMovieName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMovieName.setForeground(new java.awt.Color(255, 255, 255));
        LabelMovieName.setText("Movie Name :");
        LabelMovieName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(LabelMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        LabelMovieShowTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMovieShowTime.setForeground(new java.awt.Color(255, 255, 255));
        LabelMovieShowTime.setText("Show Time :");
        LabelMovieShowTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(LabelMovieShowTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));
        jPanel1.add(TextFieldMovieShowTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        LabelMovieReleaseDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMovieReleaseDate.setForeground(new java.awt.Color(255, 255, 255));
        LabelMovieReleaseDate.setText("Release Date :");
        LabelMovieReleaseDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(LabelMovieReleaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));
        jPanel1.add(TextFieldMovieReleaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 130, -1));

        ComboBoxMovieName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10", "Movie 11", "Movie 12", "Movie 13", "Movie 14", "Movie 15" }));
        jPanel1.add(ComboBoxMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, -1));

        LabelPaymentMethod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelPaymentMethod.setForeground(new java.awt.Color(255, 255, 255));
        LabelPaymentMethod.setText("Payment Method ");
        LabelPaymentMethod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(LabelPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        RadioButtonCash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RadioButtonCash.setForeground(new java.awt.Color(255, 255, 255));
        RadioButtonCash.setText("Cash");
        RadioButtonCash.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(RadioButtonCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        RadioButtonCard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RadioButtonCard.setForeground(new java.awt.Color(255, 255, 255));
        RadioButtonCard.setText("Card");
        RadioButtonCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(RadioButtonCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        MoveToUserTaskPageBTn.setBackground(new java.awt.Color(0, 0, 0));
        MoveToUserTaskPageBTn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MoveToUserTaskPageBTn.setForeground(new java.awt.Color(255, 255, 255));
        MoveToUserTaskPageBTn.setText("Back");
        jPanel1.add(MoveToUserTaskPageBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        GenerateTicketBtn.setBackground(new java.awt.Color(0, 255, 102));
        GenerateTicketBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GenerateTicketBtn.setText("Generate Ticket");
        jPanel1.add(GenerateTicketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 300, 180, 10));

        SuccessfulORnotSHOW.setBackground(new java.awt.Color(255, 255, 255));
        SuccessfulORnotSHOW.setForeground(new java.awt.Color(255, 255, 255));
        SuccessfulORnotSHOW.setText("Result");
        jPanel1.add(SuccessfulORnotSHOW, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        SelectAvailableSeat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SelectAvailableSeat.setForeground(new java.awt.Color(255, 255, 255));
        SelectAvailableSeat.setText("Seat Number");
        SelectAvailableSeat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(SelectAvailableSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));
        jPanel1.add(TextFieldSeatNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\59510\\Downloads\\required3.jpg")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCostomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCostomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCostomerNameActionPerformed

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
            java.util.logging.Logger.getLogger(uTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMovieName;
    private javax.swing.JButton GenerateTicketBtn;
    private javax.swing.JLabel LabelCostomerName;
    private javax.swing.JLabel LabelMovieName;
    private javax.swing.JLabel LabelMovieReleaseDate;
    private javax.swing.JLabel LabelMovieShowTime;
    private javax.swing.JLabel LabelPaymentMethod;
    private javax.swing.JButton MoveToUserTaskPageBTn;
    private javax.swing.JRadioButton RadioButtonCard;
    private javax.swing.JRadioButton RadioButtonCash;
    private javax.swing.JLabel SelectAvailableSeat;
    private javax.swing.JLabel SuccessfulORnotSHOW;
    private javax.swing.JTextField TextFieldCostomerName;
    private javax.swing.JTextField TextFieldMovieReleaseDate;
    private javax.swing.JTextField TextFieldMovieShowTime;
    private javax.swing.JTextField TextFieldSeatNumber;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
