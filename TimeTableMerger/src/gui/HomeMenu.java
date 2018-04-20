package gui;

import dao.TimetableDAO;
import dao.UserStorageDAO;
import java.awt.Window;

import domain.Day;
import domain.User;
import java.awt.CardLayout;
//import gui.helpers.SimpleListModel;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author broma609
 */
public class HomeMenu extends javax.swing.JDialog {

	private final TimetableDAO timetableDAO;
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
	 */
	public HomeMenu(Window parent, boolean modal, TimetableDAO timetableDAO, UserStorageDAO userStorageDAO) {
		super(parent);
		setModal(modal);
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
      newButton = new javax.swing.JButton();
      viewButton = new javax.swing.JButton();
      exitButton = new javax.swing.JButton();
      editButton = new javax.swing.JButton();
      scheduleButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(167, 167, 167)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(171, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(65, Short.MAX_VALUE)
            .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(50, 50, 50))
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
		EnterTimetable dialog = new EnterTimetable(this, true, timetableDAO, userStorageDAO);
		dialog.setLocationRelativeTo(this);
		dialog.setVisible(true);
   }//GEN-LAST:event_newButtonActionPerformed

   private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
		// create the dialog instance
		// the first parameter the parent window, and the second is the modal status
		dispose();
		
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
		
		EnterTimetable dialog = new EnterTimetable(this, true, timetableDAO, userStorageDAO, mondayWeek1, tuesdayWeek1, wednesdayWeek1,
		thursdayWeek1, fridayWeek1, saturdayWeek1, sundayWeek1, mondayWeek2, tuesdayWeek2, wednesdayWeek2, thursdayWeek2, fridayWeek2, 
		saturdayWeek2, sundayWeek2);

	// centre the dialog on the parent window
	dialog.setLocationRelativeTo (this);

		// make the dialog visible
	dialog.setVisible (true);
   }//GEN-LAST:event_viewButtonActionPerformed

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
		// TODO add your handling code here:
		System.exit(0);
   }//GEN-LAST:event_exitButtonActionPerformed

   private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
		// create the dialog instance
		// the first parameter the parent window, and the second is the modal status
		
		EnterTimetable dialog = new EnterTimetable(this, true, timetableDAO, userStorageDAO);

		// centre the dialog on the parent window
		dialog.setLocationRelativeTo(this);

		// make the dialog visible
		dialog.setVisible(true);
   }//GEN-LAST:event_editButtonActionPerformed

   private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_scheduleButtonActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton editButton;
   private javax.swing.JButton exitButton;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JButton newButton;
   private javax.swing.JButton scheduleButton;
   private javax.swing.JButton viewButton;
   // End of variables declaration//GEN-END:variables
}
