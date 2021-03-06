/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author JayJomJohn
 */
public class Account extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public Account() {
        super("Create Account");
        initComponents();
        conn=JavaConnector.ConnectDb();
        RandomAcc();
        RandomMICR();
        RandomPin();
    }

public void RandomAcc(){
    Random ra = new Random();
    a1.setText(""+ra.nextInt(10000+1));
}

public void RandomMICR(){
    Random ra = new Random();
    a2.setText(""+ra.nextInt(10000+1));
}  

   public void RandomPin(){
    Random ra = new Random();
    a3.setText(""+ra.nextInt(10000+1));
}    
   
public void Bal(){
    try {
        String sql = "INSERT INTO balance(name,account,MICR_no,balances)"
                + "VALUES(?,?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setString(1,a6.getText());
                pst.setString(2,a1.getText());
                pst.setString(3,a2.getText());
                pst.setString(4,a11.getText());
                pst.execute();
                JOptionPane.showMessageDialog(rootPane,"Saved Success");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        a10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        a6 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        a5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1_female = new javax.swing.JRadioButton();
        jRadioButton2_male = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        a11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(677, 510));
        setPreferredSize(new java.awt.Dimension(677, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(677, 510));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "New Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("NAME:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ACCOUNT TYPE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("MICR NO.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("ACCOUNT NO.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("PIN:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("GENDER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        a1.setEditable(false);
        a1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, 30));

        a2.setEditable(false);
        a2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, 30));

        a3.setEditable(false);
        a3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, 30));

        a4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 90, 30));

        a10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 150, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("ANSWER:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 100, 30));

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("ADDRESS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Filipino", "American", "German", "Chinese", "Korean", "Japanese", "Australian" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("NATIONALITY");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 120, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("CASTE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 120, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("MOBILE:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 120, 30));

        a6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 150, 30));

        a7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 150, 30));

        a8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 150, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("SECURITY Q.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 120, 30));

        a5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 170, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 120, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("CREATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 120, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 120, 40));

        buttonGroup1.add(jRadioButton1_female);
        jRadioButton1_female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1_female.setText("FEMALE");
        jPanel1.add(jRadioButton1_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        buttonGroup1.add(jRadioButton2_male);
        jRadioButton2_male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2_male.setText("MALE");
        jPanel1.add(jRadioButton2_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 80, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("AMOUNT");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 30));

        a11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 170, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your Nick name?", "What is your mother maden name?", " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 246, 150, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a1.setText("");
        a2.setText("");
        a3.setText("");
        a4.setText("");
        a5.setText("");
        a6.setText("");
        a7.setText("");
        a8.setText("");
        jComboBox2.setSelectedIndex(0);
        a10.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        Authentication a = new Authentication();
        a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String query = "INSERT INTO `accounts`(`Account_no`, `Name`, `Date_of_Birth`, `Pin`, `Account_type`, `Nationality`, `Caste`, `MICR_no`, `Gender`, `Mobile`, `Address`, `Sec_Q`, `Sec_A`, `Balance`) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            pst.setString(1,a1.getText());
            pst.setString(2,a6.getText());
            pst.setString(3,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.setString(4,a3.getText());
            pst.setString(5,a4.getText());
            pst.setString(6,(String)jComboBox1.getSelectedItem());
            pst.setString(7,a7.getText());
            pst.setString(8,a2.getText());
            
            jRadioButton2_male.setActionCommand("Male");
            jRadioButton1_female.setActionCommand("Female");
            
            pst.setString(9,buttonGroup1.getSelection().getActionCommand());
            pst.setString(10,a8.getText());
            pst.setString(11,a5.getText());
            pst.setString(12,jComboBox2.getSelectedItem().toString());
            pst.setString(13,a10.getText());
            pst.setString(14,a11.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Account has been Created");
            Bal();
            
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
                /*if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_female;
    private javax.swing.JRadioButton jRadioButton2_male;
    // End of variables declaration//GEN-END:variables
}
