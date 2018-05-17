package gui;

import dao.UserDAO;
import dao.TimetableDAO;
import dao.UserStorageDAO;
import domain.User;
import gui.helpers.SimpleListModel;
import java.awt.Window;
import javax.swing.JOptionPane;

/**
 *
 * @author broma609
 */
public class Contacts extends javax.swing.JFrame {
	
	private final TimetableDAO timetableDAO;
	private final UserDAO userDAO = new UserDAO();
	private final UserStorageDAO userStorageDAO;
	
	SimpleListModel displaySelectedUser = new SimpleListModel();
	SimpleListModel displayContacts = new SimpleListModel();
	
	/**
	 * Creates new form Contacts
	 * @param parent
	 * @param modal
	 * @param timetableDAO
	 * @param userDAO
	 * @param userStorageDAO
	 */
	public Contacts(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO) {
		this.timetableDAO = timetableDAO;
		this.userStorageDAO = userStorageDAO;
		
		initComponents();
		
		String currentUser = userStorageDAO.getUserName(); 
		
		displayContacts.updateItems(userDAO.getContactList(currentUser));
		contactsList.setModel(displayContacts);
	
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      mainPanel = new javax.swing.JPanel();
      titleLabel = new javax.swing.JLabel();
      searchText = new javax.swing.JTextField();
      searchButton = new javax.swing.JButton();
      addButton = new javax.swing.JButton();
      exitButton = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      usersList = new javax.swing.JList<>();
      jScrollPane2 = new javax.swing.JScrollPane();
      contactsList = new javax.swing.JList<>();
      ContactList = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      mainPanel.setBackground(new java.awt.Color(255, 255, 255));
      mainPanel.setName("mainPanel"); // NOI18N

      titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 85)); // NOI18N
      titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addContact.png"))); // NOI18N
      titleLabel.setName("titleLabel"); // NOI18N

      searchText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      searchText.setText("Search");
      searchText.setName("searchText"); // NOI18N

      searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchIcon.png"))); // NOI18N
      searchButton.setBorderPainted(false);
      searchButton.setContentAreaFilled(false);
      searchButton.setName("searchButton"); // NOI18N
      searchButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchButtonActionPerformed(evt);
         }
      });

      addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      addButton.setText("Add");
      addButton.setName("addButton"); // NOI18N
      addButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            addButtonActionPerformed(evt);
         }
      });

      exitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      exitButton.setText("Done");
      exitButton.setName("exitButton"); // NOI18N
      exitButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitButtonActionPerformed(evt);
         }
      });

      jScrollPane1.setName("jScrollPane1"); // NOI18N

      usersList.setName("usersList"); // NOI18N
      jScrollPane1.setViewportView(usersList);

      jScrollPane2.setName("jScrollPane2"); // NOI18N

      contactsList.setName("contactsList"); // NOI18N
      jScrollPane2.setViewportView(contactsList);

      ContactList.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
      ContactList.setText("Contact List: ");
      ContactList.setName("ContactList"); // NOI18N

      javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
      mainPanel.setLayout(mainPanelLayout);
      mainPanelLayout.setHorizontalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
            .addContainerGap(101, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(ContactList, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                  .addComponent(jScrollPane1))
               .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(exitButton))
            .addGap(129, 129, 129))
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(157, 157, 157)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(titleLabel)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 132, Short.MAX_VALUE))
      );
      mainPanelLayout.setVerticalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(titleLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(searchButton))
            .addGap(31, 31, 31)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addComponent(ContactList)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(exitButton)
            .addGap(26, 26, 26))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
      // TODO add your handling code here:
		dispose();
		HomeMenu dialog = new HomeMenu(this, true, timetableDAO, userDAO, userStorageDAO);
		// centre the dialog on the parent window
		dialog.setLocationRelativeTo(this);
		// make the dialog visible
		dialog.setVisible(true);
   }//GEN-LAST:event_exitButtonActionPerformed

   private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
      // TODO add your handling code here:
		/*String stringUserName = searchText.getText(); 
		
		if(stringUserName.equals("")){
			displaySelectedUser.updateItems(userDAO.getUserList());
			usersList.setModel(displaySelectedUser);
		}else{
			String userName = stringUserName; 		
			displaySelectedUser.updateItems(userDAO.searchByUserName(userName));
			usersList.setModel(displaySelectedUser);
		}*/
		
		String stringFirstName = searchText.getText(); 
		
		if(stringFirstName.equals("")){
			displaySelectedUser.updateItems(userDAO.getUserList());
			usersList.setModel(displaySelectedUser);
		}else{
			String firstName = stringFirstName; 		
			displaySelectedUser.updateItems(userDAO.searchByUserName(firstName));
			usersList.setModel(displaySelectedUser);
		}
   }//GEN-LAST:event_searchButtonActionPerformed

	
   private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

		try{
		//getting the username and the contact name
		String userName = userStorageDAO.getUserName();
		System.out.println("Add Button - User active = " + userName);
		String contactName = searchText.getText();
		
		User contact = userDAO.getUser(contactName);
		String contactFirstName = contact.getFirstName();
		String contactLastName = contact.getLastName(); 
	   
		userDAO.addContact(userName, contactName, contactFirstName, contactLastName);
		
		displayContacts.updateItems(userDAO.getContactList(userName));
		contactsList.setModel(displayContacts); 
		}catch(NullPointerException ex){
			JOptionPane.showOptionDialog(null, "There is no contact with that username. Please retry.", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		}
   }//GEN-LAST:event_addButtonActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel ContactList;
   private javax.swing.JButton addButton;
   private javax.swing.JList<String> contactsList;
   private javax.swing.JButton exitButton;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JPanel mainPanel;
   private javax.swing.JButton searchButton;
   private javax.swing.JTextField searchText;
   private javax.swing.JLabel titleLabel;
   private javax.swing.JList<String> usersList;
   // End of variables declaration//GEN-END:variables
}
