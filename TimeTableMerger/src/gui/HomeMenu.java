package gui;

import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import java.awt.Window;
import domain.Day;

/**
 *
 * @author broma609
 */
public class HomeMenu extends javax.swing.JDialog {

	private final TimetableDAO timetableDAO;
	private final UserDAO userDAO;
	private final UserStorageDAO userStorageDAO;
	private Day mondayWeek1;
	private Day tuesdayWeek1;
	private Day wednesdayWeek1;
	private Day thursdayWeek1;
	private Day fridayWeek1;
	private Day saturdayWeek1;
	private Day sundayWeek1;
	private Day mondayWeek2;
	private Day tuesdayWeek2;
	private Day wednesdayWeek2;
	private Day thursdayWeek2;
	private Day fridayWeek2;
	private Day saturdayWeek2;
	private Day sundayWeek2;

	/**
	 * Creates new form Test
	 *
	 * @param parent
	 * @param modal
	 * @param timetableDAO
	 * @param userStorageDAO
	 */
	public HomeMenu(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO) {
		super(parent);
		setModal(modal);
		this.timetableDAO = timetableDAO;
		this.userDAO = userDAO;
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
      newButton = new javax.swing.JButton();
      viewButton = new javax.swing.JButton();
      exitButton = new javax.swing.JButton();
      editButton = new javax.swing.JButton();
      scheduleButton = new javax.swing.JButton();
      contactButton = new javax.swing.JButton();

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      newButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      newButton.setText("New Timesheet");
      newButton.setName("newButton"); // NOI18N
      newButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            newButtonActionPerformed(evt);
         }
      });

      viewButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      viewButton.setText("View");
      viewButton.setName("viewButton"); // NOI18N
      viewButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewButtonActionPerformed(evt);
         }
      });

      exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      exitButton.setText("Exit");
      exitButton.setName("exitButton"); // NOI18N
      exitButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitButtonActionPerformed(evt);
         }
      });

      editButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      editButton.setText("Edit");
      editButton.setName("editButton"); // NOI18N
      editButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            editButtonActionPerformed(evt);
         }
      });

      scheduleButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      scheduleButton.setText("Schedule Meeting");
      scheduleButton.setName("scheduleButton"); // NOI18N
      scheduleButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            scheduleButtonActionPerformed(evt);
         }
      });

      contactButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      contactButton.setText("Add Contacts");
      contactButton.setName("contactButton"); // NOI18N
      contactButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            contactButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(167, 167, 167)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(contactButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(scheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
               .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(171, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31))
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

   private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
		dispose();
		CreateTimetable dialog = new CreateTimetable(this, true, timetableDAO, userDAO, userStorageDAO);
		dialog.pack();
		//set size
		dialog.setSize(715, 677);
		dialog.setLocationRelativeTo(this);
		dialog.setVisible(true);
   }//GEN-LAST:event_newButtonActionPerformed

   private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
		dispose();
		//initialise each day with the users data
		Day mondayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Monday");
		Day tuesdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Tuesday");
		Day wednesdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Wednesday");
		Day thursdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Thursday");
		Day fridayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Friday");
		Day saturdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Saturday");
		Day sundayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Sunday");
		Day mondayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Monday");
		Day tuesdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Tuesday");
		Day wednesdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Wednesday");
		Day thursdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Thursday");
		Day fridayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Friday");
		Day saturdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Saturday");
		Day sundayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Sunday");

		// create the dialog instance
		// the first parameter the parent window, and the second is the modal status
		ViewTimetable dialog = new ViewTimetable(this, true, timetableDAO, userDAO, userStorageDAO, mondayWeek1, tuesdayWeek1, wednesdayWeek1,
				  thursdayWeek1, fridayWeek1, saturdayWeek1, sundayWeek1, mondayWeek2, tuesdayWeek2, wednesdayWeek2, thursdayWeek2, fridayWeek2,
				  saturdayWeek2, sundayWeek2);
		dialog.pack();
		//set size
		dialog.setSize(715, 677);
		// centre the dialog on the parent window
		dialog.setLocationRelativeTo(this);
		// make the dialog visible
		dialog.setVisible(true);
   }//GEN-LAST:event_viewButtonActionPerformed

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
		// TODO add your handling code here:
		System.exit(0);
   }//GEN-LAST:event_exitButtonActionPerformed

   private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
		dispose();
		//initialise each day with the users data
		Day mondayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Monday");
		Day tuesdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Tuesday");
		Day wednesdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Wednesday");
		Day thursdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Thursday");
		Day fridayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Friday");
		Day saturdayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Saturday");
		Day sundayWeek1 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 1 Sunday");
		Day mondayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Monday");
		Day tuesdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Tuesday");
		Day wednesdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Wednesday");
		Day thursdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Thursday");
		Day fridayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Friday");
		Day saturdayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Saturday");
		Day sundayWeek2 = timetableDAO.getTimetable(userStorageDAO.getUserName(), "Week 2 Sunday");

		// create the dialog instance
		// the first parameter the parent window, and the second is the modal status
		EditTimetable dialog = new EditTimetable(this, true, timetableDAO, userDAO, userStorageDAO, mondayWeek1, tuesdayWeek1, wednesdayWeek1,
				  thursdayWeek1, fridayWeek1, saturdayWeek1, sundayWeek1, mondayWeek2, tuesdayWeek2, wednesdayWeek2, thursdayWeek2, fridayWeek2,
				  saturdayWeek2, sundayWeek2);
		dialog.pack();
		//set size
		dialog.setSize(715, 677);
		// centre the dialog on the parent window
		dialog.setLocationRelativeTo(this);
		// make the dialog visible
		dialog.setVisible(true);
		dispose();

   }//GEN-LAST:event_editButtonActionPerformed

   private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
		dispose();
		ScheduleTimetable dialog = new ScheduleTimetable(this, true, timetableDAO, userDAO, userStorageDAO);
		dialog.pack();
		//set size
		dialog.setSize(715, 677);
		dialog.setLocationRelativeTo(this);
		dialog.setVisible(true);
		System.out.println("Sending to ScheduleTimetable");
   }//GEN-LAST:event_scheduleButtonActionPerformed

   private void contactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactButtonActionPerformed
      dispose();
		Contacts dialog = new Contacts(this, true, userDAO);
		dialog.pack();
		//set size
		dialog.setSize(715, 677);
		dialog.setLocationRelativeTo(this);
		dialog.setVisible(true);
   }//GEN-LAST:event_contactButtonActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton contactButton;
   private javax.swing.JButton editButton;
   private javax.swing.JButton exitButton;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JButton newButton;
   private javax.swing.JButton scheduleButton;
   private javax.swing.JButton viewButton;
   // End of variables declaration//GEN-END:variables
}
