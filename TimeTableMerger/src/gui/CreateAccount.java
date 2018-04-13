package gui;

/**
 *
 * @author broma609
 */
public class CreateAccount extends javax.swing.JFrame {

	/**
	 * Creates new form Test
	 */
	public CreateAccount() {
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
      passwordField = new javax.swing.JTextField();
      reenterLabel = new javax.swing.JLabel();
      reenterfield = new javax.swing.JTextField();
      loginButton = new javax.swing.JButton();
      cancelButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
      titleLabel.setText("Create Account");
      titleLabel.setName("titleLabel"); // NOI18N

      usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      usernameLabel.setText("Username:");
      usernameLabel.setName("usernameLabel"); // NOI18N

      usernameField.setMinimumSize(new java.awt.Dimension(12, 40));
      usernameField.setName("usernameField"); // NOI18N

      firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      firstNameLabel.setText("First Name:");
      firstNameLabel.setName("firstNameLabel"); // NOI18N

      firstNameField.setMinimumSize(new java.awt.Dimension(12, 40));
      firstNameField.setName("firstNameField"); // NOI18N
      firstNameField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            firstNameFieldActionPerformed(evt);
         }
      });

      lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      lastNameLabel.setText("Last Name:");
      lastNameLabel.setName("lastNameLabel"); // NOI18N

      lastNameField.setMinimumSize(new java.awt.Dimension(12, 40));
      lastNameField.setName("lastNameField"); // NOI18N

      passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      passwordLabel.setText("Password:");
      passwordLabel.setName("passwordLabel"); // NOI18N

      passwordField.setMinimumSize(new java.awt.Dimension(12, 40));
      passwordField.setName("passwordField"); // NOI18N

      reenterLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      reenterLabel.setText("Re-enter Password:");
      reenterLabel.setName("reenterLabel"); // NOI18N

      reenterfield.setMinimumSize(new java.awt.Dimension(12, 40));
      reenterfield.setName("reenterfield"); // NOI18N

      loginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      loginButton.setText("Submit");
      loginButton.setName("loginButton"); // NOI18N

      cancelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      cancelButton.setText("Cancel");
      cancelButton.setName("cancelButton"); // NOI18N
      cancelButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cancelButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(119, 119, 119)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(69, 69, 69)
                     .addComponent(titleLabel))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(reenterLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                     .addGap(18, 18, 18)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reenterfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(69, 69, 69)
                  .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(180, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(69, 69, 69)
            .addComponent(titleLabel)
            .addGap(64, 64, 64)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(usernameLabel)
               .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(firstNameLabel)
               .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(lastNameLabel)
               .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(passwordLabel)
               .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(reenterLabel)
               .addComponent(reenterfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(42, 42, 42)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(139, Short.MAX_VALUE))
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
      // TODO add your handling code here:
   }//GEN-LAST:event_cancelButtonActionPerformed

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
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CreateAccount().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton cancelButton;
   private javax.swing.JTextField firstNameField;
   private javax.swing.JLabel firstNameLabel;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField lastNameField;
   private javax.swing.JLabel lastNameLabel;
   private javax.swing.JButton loginButton;
   private javax.swing.JTextField passwordField;
   private javax.swing.JLabel passwordLabel;
   private javax.swing.JLabel reenterLabel;
   private javax.swing.JTextField reenterfield;
   private javax.swing.JLabel titleLabel;
   private javax.swing.JTextField usernameField;
   private javax.swing.JLabel usernameLabel;
   // End of variables declaration//GEN-END:variables
}