/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import java.math.BigInteger;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        wName = new javax.swing.JLabel();
        wSurname = new javax.swing.JLabel();
        wEmail = new javax.swing.JLabel();
        wPass = new javax.swing.JLabel();
        wConfirmPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 750));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("SIGN UP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(333, 88, 157, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 190, 60, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SURNAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 260, 90, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMAIL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 320, 60, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 400, 120, 22);

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(470, 190, 120, 22);

        txtSurname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSurnameFocusLost(evt);
            }
        });
        getContentPane().add(txtSurname);
        txtSurname.setBounds(468, 257, 125, 22);

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(470, 320, 125, 22);

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(280, 570, 130, 45);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(450, 570, 110, 45);
        getContentPane().add(wName);
        wName.setBounds(593, 150, 0, 0);
        getContentPane().add(wSurname);
        wSurname.setBounds(593, 168, 0, 0);
        getContentPane().add(wEmail);
        wEmail.setBounds(593, 186, 0, 0);
        getContentPane().add(wPass);
        wPass.setBounds(593, 226, 0, 0);
        getContentPane().add(wConfirmPass);
        wConfirmPass.setBounds(593, 250, 0, 0);

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(470, 390, 120, 22);

        txtConfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPassFocusLost(evt);
            }
        });
        txtConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfirmPass);
        txtConfirmPass.setBounds(473, 457, 120, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONFIRM PASSWORD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 460, 200, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("BOOK STORE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(28, 13, 238, 65);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 850, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtSurname.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirmPass.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String confirmPass = txtConfirmPass.getText();

        if (name.equals("")) {
            wName.setText("Enter Name!!");
        } else {
            wName.setText("");
        }

        if (surname.equals("")) {
            wSurname.setText("Enter Surame!!");
        } else {
            wSurname.setText("");
        }

        if (email.equals("")) {
            wEmail.setText("Enter Email!!");
        } else {
            wEmail.setText("");
        }

        if (password.equals("")) {
            wPass.setText("Enter Password!!");
        } else {
            wPass.setText("");
        }

        if (confirmPass.equals("")) {
            wConfirmPass.setText("Confirm Password!!");
        } else {
            wConfirmPass.setText("");
        }

        if (!password.equals(confirmPass)) {
            JOptionPane.showMessageDialog(rootPane, "Password Not Matching !!");
        } 
        if((name.equals(""))||(surname.equals(""))||(email.equals(""))||(password.equals(""))||(confirmPass.equals("")))
        {
            JOptionPane.showMessageDialog(rootPane,"PLEASE ENTER DETAILS!");
        }
        else
        {
            //connect to database
            Session regSession = new Book().CassandraHelper();

            //create keyspace
            //regSession.execute("CREATE KEYSPACE adb WITH replication "+ "= {'class':'SimpleStrategy','replication_factor':1};");
            //regSession.execute("USE adb");
            //System.out.println("KeySpace created");
            //create table
            /*String query = "CREATE TABLE user(user_id int PRIMARY KEY, "
             + "name text, "
             + "surname text, "
             + "email text, "
             + "password text );";
             regSession.execute(query);
             System.out.println("table created");*/
            String countQuery="SELECT count(*) as count from user";
            ResultSet rs = regSession.execute(countQuery);
            Iterator<Row> rows=rs.iterator();
            long count=0;
            while(rows.hasNext())
            {
               count =rows.next().getLong("count");
                System.out.println(count);

            }
            
            long id = count+1;
            
            
            
            String query1 ="INSERT INTO user (user_id,name,surname,email,password)VALUES("+id+",'"+name+"', '"+surname+"','"+email+"','"+password+"');" ;
            regSession.execute(query1);
            System.out.println("QueryInserted");
            
            JOptionPane.showMessageDialog(rootPane,"REGISTRATION SUCCESSFULL!");
            this.setVisible(false);
            new login().setVisible(true);
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPassActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().equals("")) {
            wName.setText("Enter Name!!");
        } else {
            wName.setText("");
        }

    }//GEN-LAST:event_txtNameFocusLost

    private void txtSurnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSurnameFocusLost

        if (txtSurname.getText().equals("")) {
            wSurname.setText("Enter Surname!!");
        } else {
            wSurname.setText("");
        }

    }//GEN-LAST:event_txtSurnameFocusLost

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:

        if (txtEmail.getText().equals("")) {
            wEmail.setText("Enter Email!!");
        } else {
            wEmail.setText("");
        }


    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:

        if (txtPassword.getText().equals("")) {
            wPass.setText("Enter Password!!");
        } else {
            wPass.setText("");
        }


    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtConfirmPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPassFocusLost
        // TODO add your handling code here:

        if (txtConfirmPass.getText().equals("")) {
            wConfirmPass.setText("Confirm Password!!");
        } else {
            wConfirmPass.setText("");
        }


    }//GEN-LAST:event_txtConfirmPassFocusLost

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JLabel wConfirmPass;
    private javax.swing.JLabel wEmail;
    private javax.swing.JLabel wName;
    private javax.swing.JLabel wPass;
    private javax.swing.JLabel wSurname;
    // End of variables declaration//GEN-END:variables
}