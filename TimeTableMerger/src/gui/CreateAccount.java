package gui;

import dao.DAOException;
import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author broma609
 */
public class CreateAccount extends javax.swing.JFrame {

    private final UserDAO userDAO;
    private final TimetableDAO timetableDAO;
    private final UserStorageDAO userStorageDAO;
    User user = new User();

    /**
     * Creates new form Test
     *
     * @param userDAO
     * @param timetableDAO
     * @param userStorageDAO
     */
    public CreateAccount(UserDAO userDAO, TimetableDAO timetableDAO, UserStorageDAO userStorageDAO) {
        this.userDAO = userDAO;
        this.timetableDAO = timetableDAO;
        this.userStorageDAO = userStorageDAO;
        this.setName("Create Account");
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
      titleLabel = new javax.swing.JLabel();
      usernameLabel = new javax.swing.JLabel();
      usernameField = new javax.swing.JTextField();
      firstNameLabel = new javax.swing.JLabel();
      firstNameField = new javax.swing.JTextField();
      lastNameLabel = new javax.swing.JLabel();
      lastNameField = new javax.swing.JTextField();
      passwordLabel = new javax.swing.JLabel();
      reenterLabel = new javax.swing.JLabel();
      loginButton = new javax.swing.JButton();
      cancelButton = new javax.swing.JButton();
      emailLabel = new javax.swing.JLabel();
      emailField = new javax.swing.JTextField();
      passwordField = new javax.swing.JPasswordField();
      reenterfield = new javax.swing.JPasswordField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 85)); // NOI18N
      titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CreateAccount.png"))); // NOI18N
      titleLabel.setName("titleLabel"); // NOI18N

      usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      usernameLabel.setText("Username:");
      usernameLabel.setName("usernameLabel"); // NOI18N

      usernameField.setMinimumSize(new java.awt.Dimension(12, 40));
      usernameField.setName("usernameField"); // NOI18N

      firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      firstNameLabel.setText("First Name:");
      firstNameLabel.setName("firstNameLabel"); // NOI18N

      firstNameField.setMinimumSize(new java.awt.Dimension(12, 40));
      firstNameField.setName("firstNameField"); // NOI18N
      firstNameField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            firstNameFieldActionPerformed(evt);
         }
      });

      lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      lastNameLabel.setText("Last Name:");
      lastNameLabel.setName("lastNameLabel"); // NOI18N

      lastNameField.setMinimumSize(new java.awt.Dimension(12, 40));
      lastNameField.setName("lastNameField"); // NOI18N

      passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      passwordLabel.setText("Password:");
      passwordLabel.setName("passwordLabel"); // NOI18N

      reenterLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      reenterLabel.setText("Re-enter Password:");
      reenterLabel.setName("reenterLabel"); // NOI18N

      loginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      loginButton.setText("Submit");
      loginButton.setName("loginButton"); // NOI18N
      loginButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            loginButtonActionPerformed(evt);
         }
      });

      cancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      cancelButton.setText("Cancel");
      cancelButton.setName("cancelButton"); // NOI18N
      cancelButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cancelButtonActionPerformed(evt);
         }
      });

      emailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      emailLabel.setText("E-mail:");
      emailLabel.setName("emailLabel"); // NOI18N

      emailField.setMinimumSize(new java.awt.Dimension(12, 40));
      emailField.setName("emailField"); // NOI18N

      passwordField.setName("passwordField"); // NOI18N

      reenterfield.setName("reenterfield"); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(75, 75, 75)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(reenterLabel)
                        .addGap(18, 18, 18)
                        .addComponent(reenterfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(188, 188, 188)
                  .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(161, 161, 161)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 110, Short.MAX_VALUE)
            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(96, 96, 96))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addComponent(titleLabel)
            .addGap(39, 39, 39)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(usernameLabel)
               .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(firstNameLabel)
               .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(lastNameLabel)
               .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(emailLabel)
               .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(passwordLabel))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(reenterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(reenterfield, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(41, 41, 41))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_firstNameFieldActionPerformed

   private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       dispose();
       Login frame = new Login(userDAO, timetableDAO, userStorageDAO);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
   }//GEN-LAST:event_cancelButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            String idString = usernameField.getText();
            String fnameString = firstNameField.getText();
            String lnameString = lastNameField.getText();
            String passwordString = passwordField.getText();
            String passwordString2 = reenterfield.getText();
            String email = emailField.getText();

            Set<User> users = new HashSet<>();
            users = userDAO.getUserList();
            Boolean userNameUsed = false;
            Boolean userNameEmpty = false;
            Boolean passwordEmpty = false;

            for (User aUser : users) {
                System.out.println("New User: " + idString);
                System.out.println("Current Users: " + aUser.getUserName());

                if (idString.equals(aUser.getUserName()) == true || userNameUsed == true) {
                    userNameUsed = true;
                    System.out.println("Caught conflicting username!");
                } else {
                    userNameUsed = false;
                }

                if (idString.equals("")) {
                    userNameEmpty = true;
                    System.out.println("Caught empty username!");
                } else {
                    userNameEmpty = false;
                }

                if (passwordString.equals("")) {
                    passwordEmpty = true;
                    System.out.println("Caught empty password!");
                } else {
                    passwordEmpty = false;
                }
            }
            if (userNameUsed == false) {
                if (userNameEmpty == false) {
                    if (passwordEmpty == false) {
                        if (passwordString.equals(passwordString2)) {
                            this.user.setUserName(idString);
                            this.user.setFirstName(fnameString);
                            this.user.setLastName(lnameString);
                            this.user.setPassword(passwordString);
                            this.user.setEmail(email);
                            userDAO.saveUser(this.user);

                            dispose();
                            Login frame = new Login(userDAO, timetableDAO, userStorageDAO);
                            // centre the frame on the screen
                            frame.setLocationRelativeTo(null);
                            // show the frame
                            frame.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter the same password as above.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a password.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a username.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Username is already being used.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (DAOException ex) {
            // message box 
            int result = JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton cancelButton;
   private javax.swing.JTextField emailField;
   private javax.swing.JLabel emailLabel;
   private javax.swing.JTextField firstNameField;
   private javax.swing.JLabel firstNameLabel;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField lastNameField;
   private javax.swing.JLabel lastNameLabel;
   private javax.swing.JButton loginButton;
   private javax.swing.JPasswordField passwordField;
   private javax.swing.JLabel passwordLabel;
   private javax.swing.JLabel reenterLabel;
   private javax.swing.JPasswordField reenterfield;
   private javax.swing.JLabel titleLabel;
   private javax.swing.JTextField usernameField;
   private javax.swing.JLabel usernameLabel;
   // End of variables declaration//GEN-END:variables
}
