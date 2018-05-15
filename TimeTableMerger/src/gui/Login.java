package gui;

import dao.DAOException;
import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.User;
import javax.swing.JOptionPane;

/**
 *
 * @author broma609
 */
public class Login extends javax.swing.JFrame {

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
    public Login(UserDAO userDAO, TimetableDAO timetableDAO, UserStorageDAO userStorageDAO) {
        this.userDAO = userDAO;
        this.timetableDAO = timetableDAO;
        this.userStorageDAO = userStorageDAO;
        this.setName("Log In");
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
      usernameLabel = new javax.swing.JLabel();
      usernameField = new javax.swing.JTextField();
      passwordLabel = new javax.swing.JLabel();
      jButtonLogin = new javax.swing.JButton();
      jButtonCreateAccount = new javax.swing.JButton();
      passwordField = new javax.swing.JPasswordField();
      jLabel1 = new javax.swing.JLabel();
      jButtonExit = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
      usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      usernameLabel.setText("Username:");
      usernameLabel.setName("usernameLabel"); // NOI18N

      usernameField.setName("usernameField"); // NOI18N

      passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      passwordLabel.setText("Password:");
      passwordLabel.setName("passwordLabel"); // NOI18N

      jButtonLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      jButtonLogin.setText("Log in");
      jButtonLogin.setName("jButtonLogin"); // NOI18N
      jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonLoginActionPerformed(evt);
         }
      });

      jButtonCreateAccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      jButtonCreateAccount.setText("Create Account");
      jButtonCreateAccount.setName("jButtonCreateAccount"); // NOI18N
      jButtonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCreateAccountActionPerformed(evt);
         }
      });

      passwordField.setName("passwordField"); // NOI18N

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TiMerger.png"))); // NOI18N
      jLabel1.setName("jLabel1"); // NOI18N

      jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      jButtonExit.setText("Exit");
      jButtonExit.setName("jButtonExit"); // NOI18N
      jButtonExit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonExitActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(146, 146, 146)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(usernameLabel)
                     .addComponent(passwordLabel))
                  .addGap(28, 28, 28)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(164, 164, 164)
                  .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jButtonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(262, 262, 262)
                  .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(170, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(77, 77, 77))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addGap(0, 8, Short.MAX_VALUE)
                  .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 3, Short.MAX_VALUE)))
            .addGap(15, 15, 15)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(passwordLabel)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(1, 1, 1)
                  .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(57, 57, 57)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jButtonCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(96, 96, 96))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
       try {
           String userNameString = usernameField.getText();
           String passwordString = passwordField.getText();

           boolean var = userDAO.validateCredentials(userNameString, passwordString);
           if (var) {
               dispose();
               this.user = userDAO.getUser(userNameString);
               System.out.println(this.user);

               userStorageDAO.setUserName(userNameString);

               HomeMenu dialog = new HomeMenu(this, true, timetableDAO, userDAO, userStorageDAO);
               // centre the dialog on the parent window
               dialog.setLocationRelativeTo(this);
               // make the dialog visible
               dialog.setVisible(true);

           } else {
               JOptionPane.showMessageDialog(null, "Either the user does not exist or details were entered incorrectly", "Error", JOptionPane.ERROR_MESSAGE);
           }

       } catch (DAOException ex) {
           // message box 
           JOptionPane.showConfirmDialog(this, ex.getMessage());
       }
   }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAccountActionPerformed
        dispose();

        CreateAccount createAccount = new CreateAccount(userDAO, timetableDAO, userStorageDAO);
        createAccount.setLocationRelativeTo(this);
        createAccount.setVisible(true);
    }//GEN-LAST:event_jButtonCreateAccountActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButtonCreateAccount;
   private javax.swing.JButton jButtonExit;
   private javax.swing.JButton jButtonLogin;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPasswordField passwordField;
   private javax.swing.JLabel passwordLabel;
   private javax.swing.JTextField usernameField;
   private javax.swing.JLabel usernameLabel;
   // End of variables declaration//GEN-END:variables
}
