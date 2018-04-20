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
	 * @param userDAO
	 * @param timetableDAO
	 * @param userStorageDAO
	 */
	public Login(UserDAO userDAO, TimetableDAO timetableDAO, UserStorageDAO userStorageDAO) {
		this.userDAO = userDAO;
		this.timetableDAO = timetableDAO;
		this.userStorageDAO = userStorageDAO;
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
      passwordLabel = new javax.swing.JLabel();
      jButtonLogin = new javax.swing.JButton();
      jButtonCreateAccount = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      passwordField = new javax.swing.JTextField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
      titleLabel.setText("Timetable Merger");
      titleLabel.setName("titleLabel"); // NOI18N

      usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
      usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      usernameLabel.setText("Username:");
      usernameLabel.setName("usernameLabel"); // NOI18N

      usernameField.setName("usernameField"); // NOI18N

      passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      passwordLabel.setText("Password:");
      passwordLabel.setName("passwordLabel"); // NOI18N

      jButtonLogin.setText("Log in");
      jButtonLogin.setName("jButtonLogin"); // NOI18N
      jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonLoginActionPerformed(evt);
         }
      });

      jButtonCreateAccount.setText("Create Account");
      jButtonCreateAccount.setName("jButtonCreateAccount"); // NOI18N
      jButtonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCreateAccountActionPerformed(evt);
         }
      });

      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniTimetableLogo.png"))); // NOI18N
      jLabel2.setName("jLabel2"); // NOI18N

      passwordField.setName("passwordField"); // NOI18N
      passwordField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            passwordFieldActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(163, 163, 163)
                  .addComponent(titleLabel))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(194, 194, 194)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(usernameLabel)
                           .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                           .addComponent(passwordField)))
                     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGap(165, 165, 165))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(57, 57, 57)
            .addComponent(titleLabel)
            .addGap(18, 18, 18)
            .addComponent(jLabel2)
            .addGap(34, 34, 34)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
               .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(passwordField))
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(38, 38, 38))
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

   private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

		try {
			String userNameString = usernameField.getText();
			String passwordString = passwordField.getText();

			boolean var = userDAO.validateCredentials(userNameString, passwordString);
			if (var) {
				this.user = userDAO.getUser(userNameString);
				System.out.println(this.user);
				
				userStorageDAO.setUserName(userNameString);

				HomeMenu dialog = new HomeMenu(this, true, timetableDAO, userStorageDAO);
				// centre the dialog on the parent window
				dialog.setLocationRelativeTo(this);
				// make the dialog visible
				dialog.setVisible(true);

			} else {
				JOptionPane.showConfirmDialog(this, "user not found");
			}
			//System.out.println(dao.getProducts());
			//dispose();

		} catch (DAOException ex) {
			// message box 
			//	throw new DAOException(ex.getMessage(), ex);
			JOptionPane.showConfirmDialog(this, ex.getMessage());
		}
   }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAccountActionPerformed
		dispose();
		 
		 CreateAccount createAccount = new CreateAccount(userDAO, timetableDAO, userStorageDAO);
		 createAccount.setLocationRelativeTo(this);
		 createAccount.setVisible(true);
    }//GEN-LAST:event_jButtonCreateAccountActionPerformed

   private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_passwordFieldActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButtonCreateAccount;
   private javax.swing.JButton jButtonLogin;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField passwordField;
   private javax.swing.JLabel passwordLabel;
   private javax.swing.JLabel titleLabel;
   private javax.swing.JTextField usernameField;
   private javax.swing.JLabel usernameLabel;
   // End of variables declaration//GEN-END:variables
}
