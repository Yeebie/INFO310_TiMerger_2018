package gui;

import dao.DAOException;
import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import java.awt.Window;
import domain.Day;
import javax.swing.JOptionPane;

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

      exitButton1 = new javax.swing.JButton();
      jPanel1 = new javax.swing.JPanel();
      exitButton = new javax.swing.JButton();
      timetableButton = new javax.swing.JButton();
      scheduleButton = new javax.swing.JButton();
      contactButton = new javax.swing.JButton();
      jButtonLogOut = new javax.swing.JButton();

      exitButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      exitButton1.setText("Exit");
      exitButton1.setName("exitButton1"); // NOI18N
      exitButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitButton1ActionPerformed(evt);
         }
      });

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      exitButton.setText("Exit");
      exitButton.setName("exitButton"); // NOI18N
      exitButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitButtonActionPerformed(evt);
         }
      });

      timetableButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      timetableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manageTimetable.png"))); // NOI18N
      timetableButton.setText("Manage Timetable");
      timetableButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      timetableButton.setName("timetableButton"); // NOI18N
      timetableButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      timetableButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            timetableButtonActionPerformed(evt);
         }
      });

      scheduleButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      scheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scheduleMeeting.png"))); // NOI18N
      scheduleButton.setText("Compare Timetable");
      scheduleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      scheduleButton.setName("scheduleButton"); // NOI18N
      scheduleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      scheduleButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            scheduleButtonActionPerformed(evt);
         }
      });

      contactButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      contactButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addContacts.png"))); // NOI18N
      contactButton.setText("Add Contacts");
      contactButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      contactButton.setName("contactButton"); // NOI18N
      contactButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      contactButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            contactButtonActionPerformed(evt);
         }
      });

      jButtonLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jButtonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutButton.png"))); // NOI18N
      jButtonLogOut.setText("Log Out");
      jButtonLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jButtonLogOut.setName("jButtonLogOut"); // NOI18N
      jButtonLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonLogOutActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(90, 90, 90)
                  .addComponent(timetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(90, 90, 90)
                  .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(132, 132, 132)
                  .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(105, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(107, 107, 107)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(timetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jButtonLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(scheduleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(41, 41, 41)
            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(100, Short.MAX_VALUE))
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

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       // TODO add your handling code here:
       System.out.println("out");
       System.exit(0);
   }//GEN-LAST:event_exitButtonActionPerformed

   private void timetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetableButtonActionPerformed
       //dispose();
       try {

           //initialise each day with the users data
           Day mondayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Monday");
           Day tuesdayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Tuesday");
           Day wednesdayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Wednesday");
           Day thursdayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Thursday");
           Day fridayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Friday");
           Day saturdayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Saturday");
           Day sundayWeek1 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 1 Sunday");
           Day mondayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Monday");
           Day tuesdayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Tuesday");
           Day wednesdayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Wednesday");
           Day thursdayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Thursday");
           Day fridayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Friday");
           Day saturdayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Saturday");
           Day sundayWeek2 = timetableDAO.getDay(userStorageDAO.getUserName(), "Week 2 Sunday");

           // create the dialog instance
           // the first parameter the parent window, and the second is the modal status
           dispose(); //This dispose needs to be called somewhere? After exception ? 
           EditTimetable dialog = new EditTimetable(this, true, timetableDAO, userDAO, userStorageDAO, mondayWeek1, tuesdayWeek1, wednesdayWeek1,
                   thursdayWeek1, fridayWeek1, saturdayWeek1, sundayWeek1, mondayWeek2, tuesdayWeek2, wednesdayWeek2, thursdayWeek2, fridayWeek2,
                   saturdayWeek2, sundayWeek2);
           dialog.pack();
           //set size 
           dialog.setSize(715, 677);
           // centre thedialog on the parent window
           dialog.setLocationRelativeTo(this);
           //make the dialog visible 
           dialog.setVisible(true); //dispose();

       } catch (NullPointerException ex) {
          
               dispose();
               CreateTimetable dialog = new CreateTimetable(this, true, timetableDAO, userDAO, userStorageDAO);
               dialog.pack();
               //set size
               dialog.setSize(715, 677);
               dialog.setLocationRelativeTo(this);
               dialog.setVisible(true);
       }

   }//GEN-LAST:event_timetableButtonActionPerformed

   private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
       dispose();
       ScheduleMeeting dialog = new ScheduleMeeting(this, true, timetableDAO, userDAO, userStorageDAO);
       dialog.pack();
       //set size
       dialog.setSize(715, 677);
       dialog.setLocationRelativeTo(this);
       dialog.setVisible(true);
       System.out.println("Sending to ScheduleTimetable");
   }//GEN-LAST:event_scheduleButtonActionPerformed

   private void contactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactButtonActionPerformed
       dispose();

       Contacts dialog = new Contacts(this, true, timetableDAO, userDAO, userStorageDAO);

       dialog.pack();
       //set size
       dialog.setSize(715, 677);
       dialog.setLocationRelativeTo(this);
       dialog.setVisible(true);

   }//GEN-LAST:event_contactButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        userStorageDAO.setUserName("");
        dispose();
        Login frame = new Login(userDAO, timetableDAO, userStorageDAO);
        // centre the frame on the screen
        frame.setLocationRelativeTo(null);
        // show the frame
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton contactButton;
   private javax.swing.JButton exitButton;
   private javax.swing.JButton exitButton1;
   private javax.swing.JButton jButtonLogOut;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JButton scheduleButton;
   private javax.swing.JButton timetableButton;
   // End of variables declaration//GEN-END:variables
}
