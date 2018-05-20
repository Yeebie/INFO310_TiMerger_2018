package gui;

import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.Day;
import domain.MergedDay;
import domain.User;
import gui.helpers.SimpleListModel;
import java.awt.Window;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author broma609
 */
public class ScheduleMeeting extends javax.swing.JDialog {

    private final TimetableDAO timetableDAO;
    private final UserDAO userDAO;
    private final UserStorageDAO userStorageDAO;

    private SimpleListModel displayContactList = new SimpleListModel();
    DefaultListModel<String> usersToCompare = new DefaultListModel<>();

    //private SimpleListModel contactsToCompare = new SimpleListModel();
    //not 100% sure these are needed yet
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;

    /**
     * Keeps track of users that have been iterated over, if a null timetable
     * appears, the last user in this list would have caused it
     */
    private List<String> iteratedUsers = new ArrayList<>();

    /**
     * Creates new form ScheduleMeeting
     */
    public ScheduleMeeting(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO) {

        super(parent);
        super.setModal(modal);
        this.timetableDAO = timetableDAO;
        this.userDAO = userDAO;
        this.userStorageDAO = userStorageDAO;
        this.setName("Schedule Meeting");
        initComponents();

        String currentUser = userStorageDAO.getUserName();
        displayContactList.updateItems(userDAO.getContactList(currentUser));
        contactList1.setModel(displayContactList);

        //set all days to selected by default
       // monCheckBox.setSelected(true);
       // tueCheckBox.setSelected(true);
       // wedCheckBox.setSelected(true);
       // thuCheckBox.setSelected(true);
       // friCheckBox.setSelected(true);
       // satCheckBox.setSelected(true);
       // sunCheckBox.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPasswordField1 = new javax.swing.JPasswordField();
      mainPanel = new javax.swing.JPanel();
      searchLabel = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      selectedContacts = new javax.swing.JList<>();
      jLabel1 = new javax.swing.JLabel();
      confirmButton = new javax.swing.JButton();
      cancelButton = new javax.swing.JButton();
      jScrollPane2 = new javax.swing.JScrollPane();
      contactList1 = new javax.swing.JList<>();
      searchLabel2 = new javax.swing.JLabel();
      AddArrow = new javax.swing.JButton();
      RemoveArrow = new javax.swing.JButton();

      jPasswordField1.setText("jPasswordField1");
      jPasswordField1.setName("jPasswordField1"); // NOI18N

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      mainPanel.setBackground(new java.awt.Color(255, 255, 255));
      mainPanel.setName("mainPanel"); // NOI18N

      searchLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      searchLabel.setText("Contact List:");
      searchLabel.setName("searchLabel"); // NOI18N

      jScrollPane1.setName("jScrollPane1"); // NOI18N

      selectedContacts.setName("selectedContacts"); // NOI18N
      jScrollPane1.setViewportView(selectedContacts);

      jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 85)); // NOI18N
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ScheduleMeeting2.png"))); // NOI18N
      jLabel1.setName("jLabel1"); // NOI18N

      confirmButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      confirmButton.setText("Confirm");
      confirmButton.setName("confirmButton"); // NOI18N
      confirmButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            confirmButtonActionPerformed(evt);
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

      jScrollPane2.setName("jScrollPane2"); // NOI18N

      contactList1.setName("contactList1"); // NOI18N
      jScrollPane2.setViewportView(contactList1);

      searchLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      searchLabel2.setText("Merge timetables with:");
      searchLabel2.setName("searchLabel2"); // NOI18N

      AddArrow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      AddArrow.setText("Add");
      AddArrow.setName("AddArrow"); // NOI18N
      AddArrow.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddArrowActionPerformed(evt);
         }
      });

      RemoveArrow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      RemoveArrow.setText("Remove");
      RemoveArrow.setName("RemoveArrow"); // NOI18N
      RemoveArrow.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            RemoveArrowActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
      mainPanel.setLayout(mainPanelLayout);
      mainPanelLayout.setHorizontalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(87, 87, 87))
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(26, 26, 26)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(AddArrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(RemoveArrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addComponent(searchLabel))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(searchLabel2)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(218, 218, 218)
                  .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(27, Short.MAX_VALUE))
      );
      mainPanelLayout.setVerticalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(searchLabel)
               .addComponent(searchLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(AddArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(28, 28, 28)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(confirmButton)
               .addComponent(cancelButton))
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
         .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
//       Set<User> users = new HashSet<>();
//       users = userDAO.getUserList();

//set day fields to true/false depending if check box has been unselected (chec kboxes are selected by default
      // monday = monCheckBox.isSelected();
      // tuesday = tueCheckBox.isSelected();
      // wednesday = wedCheckBox.isSelected();
      // thursday = thuCheckBox.isSelected();
      // friday = friCheckBox.isSelected();
      // saturday = satCheckBox.isSelected();
      // sunday = sunCheckBox.isSelected();

      // String storeDuration = String.valueOf(durationCombo.getSelectedItem());

      /// System.out.println("Selected Duration: " + storeDuration);

       //Compare a user's day with the master timetable's day
       try {
           /**
            * Rust Experimental.
            *
            * This will eventually turn into the mergeTimetables method, not
            * sure how, but it will. This is temporary code, contact list &
            * schedule meeting haven't been completed yet, using getUserList()
            * instead of retrieved User List from associated pages. Does this
            * need to be a sorted collection? What happens if it's all jumbled
            * up when we compare timetables? Probably need to maintain traversal
            * order.
            */

           //mergeTimetables method
           /**
            * Grabbing ALL the users and adding them to a list, this will change
            * from all users to an allocated list of users later on
            */
           Set<User> users = new HashSet<>();
           String user;
           Integer userNameStart;
           List<String> userNames = new ArrayList<>();
           userNames.add(userStorageDAO.getUserName());
           System.out.println();

           /**
            * Gets input from selectedContacts and Substrings it, assumes that
            * the user won't use ":" in their name, do we need to add input
            * validation?
            */
           for (int i = 0; i < selectedContacts.getModel().getSize(); i++) {
               user = (selectedContacts.getModel().getElementAt(i));
               userNameStart = (user.indexOf(58)) + 2;
               userNames.add(user.substring(userNameStart));
           }

           /**
            * Gets all usernames, turns them into basic users
            */
           for (String userCheck : userNames) {
               User retrievedUser = new User();
               retrievedUser.setUserName(userCheck);
               users.add(retrievedUser);
           }

           /**
            * Making sure all users appear in the HashSet
            */
           System.out.println("Checking final User Loop");
           for (User aUser : users) {
               System.out.println(aUser.getUserName());
           }

           System.out.println();

           /**
            * Specifying day names for handy loop
            */
           ArrayList<String> timetableDays = new ArrayList<>();

           //Week 1
           timetableDays.add("Week 1 Monday");
           timetableDays.add("Week 1 Tuesday");
           timetableDays.add("Week 1 Wednesday");
           timetableDays.add("Week 1 Thursday");
           timetableDays.add("Week 1 Friday");
           timetableDays.add("Week 1 Saturday");
           timetableDays.add("Week 1 Sunday");

           //Week 2
           timetableDays.add("Week 2 Monday");
           timetableDays.add("Week 2 Tuesday");
           timetableDays.add("Week 2 Wednesday");
           timetableDays.add("Week 2 Thursday");
           timetableDays.add("Week 2 Friday");
           timetableDays.add("Week 2 Saturday");
           timetableDays.add("Week 2 Sunday");

           /**
            * Setting up the mergedTimetableDays collection so it has 14 days
            * with all data set to false
            */
           Map<String, MergedDay> mergedTimetableDays = new HashMap<>();
           for (String aTimetableDay : timetableDays) {
               MergedDay aUsersDay = new MergedDay("&e0", aTimetableDay);
               mergedTimetableDays.put(aTimetableDay, aUsersDay);
           }

           /**
            * Retrieves every user's timetable and adds the true values to the
            * master timetable
            */
           for (User aUser : users) {
               //Compile a user's timetable into a local collection
               Set<Day> usersTimetableDays = new HashSet<>();
               iteratedUsers.add(aUser.getUserName());
               for (String aTimetableDay : timetableDays) {
                   Day aUsersDay = new Day();
                   aUsersDay = timetableDAO.getDay(aUser.getUserName(), aTimetableDay);
                   //Add the day to usersTimetableDays
                   usersTimetableDays.add(aUsersDay);
               }
               //Compare a user's day with the master timetable's day
               for (Day aDay : usersTimetableDays) {
                   String dayName = aDay.getDayName();
                   MergedDay compareMergedDay = mergedTimetableDays.get(dayName); //Use old or new?
                   //Iterate over each hour in a timetable day
                   if (aDay.getEightAM() == true || compareMergedDay.getEightAM() == true) {
                       compareMergedDay.setEightAM(true);
                   } else {
                       compareMergedDay.setEightAM(false);
                   }

                   if (aDay.getNineAM() == true || compareMergedDay.getNineAM() == true) {
                       compareMergedDay.setNineAM(true);
                   } else {
                       compareMergedDay.setNineAM(false);
                   }

                   if (aDay.getTenAM() == true || compareMergedDay.getTenAM() == true) {
                       compareMergedDay.setTenAM(true);
                   } else {
                       compareMergedDay.setTenAM(false);
                   }

                   if (aDay.getElevenAM() == true || compareMergedDay.getElevenAM() == true) {
                       compareMergedDay.setElevenAM(true);
                   } else {
                       compareMergedDay.setElevenAM(false);
                   }

                   if (aDay.getTwelvePM() == true || compareMergedDay.getTwelvePM() == true) {
                       compareMergedDay.setTwelvePM(true);
                   } else {
                       compareMergedDay.setTwelvePM(false);
                   }

                   if (aDay.getOnePM() == true || compareMergedDay.getOnePM() == true) {
                       compareMergedDay.setOnePM(true);
                   } else {
                       compareMergedDay.setOnePM(false);
                   }

                   if (aDay.getTwoPM() == true || compareMergedDay.getTwoPM() == true) {
                       compareMergedDay.setTwoPM(true);
                   } else {
                       compareMergedDay.setTwoPM(false);
                   }

                   if (aDay.getThreePM() == true || compareMergedDay.getThreePM() == true) {
                       compareMergedDay.setThreePM(true);
                   } else {
                       compareMergedDay.setThreePM(false);
                   }

                   if (aDay.getFourPM() == true || compareMergedDay.getFourPM() == true) {
                       compareMergedDay.setFourPM(true);
                   } else {
                       compareMergedDay.setFourPM(false);
                   }

                   if (aDay.getFivePM() == true || compareMergedDay.getFivePM() == true) {
                       compareMergedDay.setFivePM(true);
                   } else {
                       compareMergedDay.setFivePM(false);
                   }

                   if (aDay.getSixPM() == true || compareMergedDay.getSixPM() == true) {
                       compareMergedDay.setSixPM(true);
                   } else {
                       compareMergedDay.setSixPM(false);
                   }

                   if (aDay.getSevenPM() == true || compareMergedDay.getSevenPM() == true) {
                       compareMergedDay.setSevenPM(true);
                   } else {
                       compareMergedDay.setSevenPM(false);
                   }

                   if (aDay.getEightPM() == true || compareMergedDay.getEightPM() == true) {
                       compareMergedDay.setEightPM(true);
                   } else {
                       compareMergedDay.setEightPM(false);
                   }

                   if (aDay.getNinePM() == true || compareMergedDay.getNinePM() == true) {
                       compareMergedDay.setNinePM(true);
                   } else {
                       compareMergedDay.setNinePM(false);
                   }
                   mergedTimetableDays.put("&e0", compareMergedDay);
               }
           }

           //initialise each day with the users data
           MergedDay mondayWeek1 = mergedTimetableDays.get("Week 1 Monday");
           MergedDay tuesdayWeek1 = mergedTimetableDays.get("Week 1 Tuesday");
           MergedDay wednesdayWeek1 = mergedTimetableDays.get("Week 1 Wednesday");
           MergedDay thursdayWeek1 = mergedTimetableDays.get("Week 1 Thursday");
           MergedDay fridayWeek1 = mergedTimetableDays.get("Week 1 Friday");
           MergedDay saturdayWeek1 = mergedTimetableDays.get("Week 1 Saturday");
           MergedDay sundayWeek1 = mergedTimetableDays.get("Week 1 Sunday");
           MergedDay mondayWeek2 = mergedTimetableDays.get("Week 2 Monday");
           MergedDay tuesdayWeek2 = mergedTimetableDays.get("Week 2 Tuesday");
           MergedDay wednesdayWeek2 = mergedTimetableDays.get("Week 2 Wednesday");
           MergedDay thursdayWeek2 = mergedTimetableDays.get("Week 2 Thursday");
           MergedDay fridayWeek2 = mergedTimetableDays.get("Week 2 Friday");
           MergedDay saturdayWeek2 = mergedTimetableDays.get("Week 2 Saturday");
           MergedDay sundayWeek2 = mergedTimetableDays.get("Week 2 Sunday");
           /**
            * End mergeTimetables
            */

           /**
            * Rust Experimental.
            *
            * This will eventually turn into the calculateMeetingTimes method
            */
           //calculateMeetingTimes
           /**
            * Load the Merged Timetable into local variables
            */
           mondayWeek1 = mergedTimetableDays.get("Week 1 Monday");
           tuesdayWeek1 = mergedTimetableDays.get("Week 1 Tuesday");
           wednesdayWeek1 = mergedTimetableDays.get("Week 1 Wednesday");
           thursdayWeek1 = mergedTimetableDays.get("Week 1 Thursday");
           fridayWeek1 = mergedTimetableDays.get("Week 1 Friday");
           saturdayWeek1 = mergedTimetableDays.get("Week 1 Saturday");
           sundayWeek1 = mergedTimetableDays.get("Week 1 Sunday");
           mondayWeek2 = mergedTimetableDays.get("Week 2 Monday");
           tuesdayWeek2 = mergedTimetableDays.get("Week 2 Tuesday");
           wednesdayWeek2 = mergedTimetableDays.get("Week 2 Wednesday");
           thursdayWeek2 = mergedTimetableDays.get("Week 2 Thursday");
           fridayWeek2 = mergedTimetableDays.get("Week 2 Friday");
           saturdayWeek2 = mergedTimetableDays.get("Week 2 Saturday");
           sundayWeek2 = mergedTimetableDays.get("Week 2 Sunday");

           /**
            * Add the days into a local collection for iterating over
            */
           Collection<MergedDay> mergedTimetable = new ArrayList<>();
           //Week 1
           mergedTimetable.add(mondayWeek1);
           mergedTimetable.add(tuesdayWeek1);
           mergedTimetable.add(wednesdayWeek1);
           mergedTimetable.add(thursdayWeek1);
           mergedTimetable.add(fridayWeek1);
           mergedTimetable.add(saturdayWeek1);
           mergedTimetable.add(sundayWeek1);
           //Week 2
           mergedTimetable.add(mondayWeek2);
           mergedTimetable.add(tuesdayWeek2);
           mergedTimetable.add(wednesdayWeek2);
           mergedTimetable.add(thursdayWeek2);
           mergedTimetable.add(fridayWeek2);
           mergedTimetable.add(saturdayWeek2);
           mergedTimetable.add(sundayWeek2);

           /**
            * For each day in a timetable
            */
           ArrayList<Boolean> day = new ArrayList<>();
           ArrayList<Integer> gapDurations = new ArrayList<>();
           for (MergedDay aMergedDay : mergedTimetable) {
               /**
                * Load the day's times into a temporary array
                */
               day.clear();
               day.add(aMergedDay.getEightAM());
               day.add(aMergedDay.getNineAM());
               day.add(aMergedDay.getTenAM());
               day.add(aMergedDay.getElevenAM());
               day.add(aMergedDay.getTwelvePM());
               day.add(aMergedDay.getOnePM());
               day.add(aMergedDay.getTwoPM());
               day.add(aMergedDay.getThreePM());
               day.add(aMergedDay.getFourPM());
               day.add(aMergedDay.getFivePM());
               day.add(aMergedDay.getSixPM());
               day.add(aMergedDay.getSevenPM());
               day.add(aMergedDay.getEightPM());
               day.add(aMergedDay.getNinePM());

               /**
                * Load the day's gapDurations into a temporary array
                */
               gapDurations.clear();
               gapDurations.add(aMergedDay.getEightAMDuration());
               gapDurations.add(aMergedDay.getNineAMDuration());
               gapDurations.add(aMergedDay.getTenAMDuration());
               gapDurations.add(aMergedDay.getElevenAMDuration());
               gapDurations.add(aMergedDay.getTwelvePMDuration());
               gapDurations.add(aMergedDay.getOnePMDuration());
               gapDurations.add(aMergedDay.getTwoPMDuration());
               gapDurations.add(aMergedDay.getThreePMDuration());
               gapDurations.add(aMergedDay.getFourPMDuration());
               gapDurations.add(aMergedDay.getFivePMDuration());
               gapDurations.add(aMergedDay.getSixPMDuration());
               gapDurations.add(aMergedDay.getSevenPMDuration());
               gapDurations.add(aMergedDay.getEightPMDuration());
               gapDurations.add(aMergedDay.getNinePMDuration());

               /**
                * Start iterating over the two arrays
                */
               //Make a Duration Array with all setDurations?
               for (int i = 0; i < day.size(); i++) {
                   if (day.get(i) == true) {
                       gapDurations.set(i, 0);
                   }

                   if (day.get(i) == false) {
                       gapDurations.set(i, 1);
                   }

                   if ((i + 1) < day.size()) {
                       if (day.get(i) == false && day.get((i + 1)) == false) {
                           gapDurations.set(i, 2);
                       }
                   }

                   if ((i + 2) < day.size()) {
                       if (day.get(i) == false && day.get((i + 1)) == false && day.get((i + 2)) == false) {
                           gapDurations.set(i, 3);
                       }
                   }
               }
               System.out.println("Day: " + day);
               System.out.println("Gap Durations in Day: " + gapDurations);
               System.out.println("Day Array Size: " + day.size());
               System.out.println("Gap Duration Array Size: " + gapDurations.size());
               System.out.println();

               aMergedDay.setEightAMDuration(gapDurations.get(0));
               aMergedDay.setNineAMDuration(gapDurations.get(1));
               aMergedDay.setTenAMDuration(gapDurations.get(2));
               aMergedDay.setElevenAMDuration(gapDurations.get(3));
               aMergedDay.setTwelvePMDuration(gapDurations.get(4));
               aMergedDay.setOnePMDuration(gapDurations.get(5));
               aMergedDay.setTwoPMDuration(gapDurations.get(6));
               aMergedDay.setThreePMDuration(gapDurations.get(7));
               aMergedDay.setFourPMDuration(gapDurations.get(8));
               aMergedDay.setFivePMDuration(gapDurations.get(9));
               aMergedDay.setSixPMDuration(gapDurations.get(10));
               aMergedDay.setSevenPMDuration(gapDurations.get(11));
               aMergedDay.setEightPMDuration(gapDurations.get(12));
               aMergedDay.setNinePMDuration(gapDurations.get(13));

               /**
                * Sanity Check
                */
               ArrayList<Integer> check = new ArrayList<>();
               check.add(aMergedDay.getEightAMDuration());
               check.add(aMergedDay.getNineAMDuration());
               check.add(aMergedDay.getTenAMDuration());
               check.add(aMergedDay.getElevenAMDuration());
               check.add(aMergedDay.getTwelvePMDuration());
               check.add(aMergedDay.getOnePMDuration());
               check.add(aMergedDay.getTwoPMDuration());
               check.add(aMergedDay.getThreePMDuration());
               check.add(aMergedDay.getFourPMDuration());
               check.add(aMergedDay.getFivePMDuration());
               check.add(aMergedDay.getSixPMDuration());
               check.add(aMergedDay.getSevenPMDuration());
               check.add(aMergedDay.getEightPMDuration());
               check.add(aMergedDay.getNinePMDuration());

               System.out.println("Sanity Check Start");
               for (Integer inte : check) {
                   System.out.println(inte);
               }
               System.out.println("Sanity Check End");
               System.out.println();
               System.out.println();
           }
           /**
            * End caculateMeetingTimes
            */
           /**
            * Load up an instance of the View Timetable page to visualize
            * timetable merge
            */
           dispose();
           CheckTimetable dialog = new CheckTimetable(this, true, timetableDAO, userDAO, userStorageDAO, mondayWeek1, tuesdayWeek1, wednesdayWeek1,
                   thursdayWeek1, fridayWeek1, saturdayWeek1, sundayWeek1, mondayWeek2, tuesdayWeek2, wednesdayWeek2, thursdayWeek2, fridayWeek2,
                   saturdayWeek2, sundayWeek2);

           dialog.pack();
           //set size

           dialog.setSize(715, 677);
           // centre the dialog on the parent window
           dialog.setLocationRelativeTo(this);
           // make the dialog visible
           dialog.setVisible(true);

       } catch (NullPointerException ex) {
           // If Null values are found, prevent the program from crashing
           JOptionPane.showMessageDialog(null, "''" + iteratedUsers.get(iteratedUsers.size() - 1) + "'' has not set their timetable up.", "Error", JOptionPane.ERROR_MESSAGE);
           dispose();
           ScheduleMeeting dialog = new ScheduleMeeting(this, true, timetableDAO, userDAO, userStorageDAO);
           dialog.pack();
           //set size
           dialog.setSize(715, 677);
           dialog.setLocationRelativeTo(this);
           dialog.setVisible(true);
       }
   }//GEN-LAST:event_confirmButtonActionPerformed

   private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       int result = JOptionPane.showConfirmDialog(
               this, "Are you sure you want to cancel?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
       // did the user click the yes button?
       if (result == JOptionPane.YES_OPTION) {

           dispose();
           HomeMenu dialog = new HomeMenu(this, true, timetableDAO, userDAO, userStorageDAO);
           // centre the dialog on the parent window
           dialog.setLocationRelativeTo(this);
           // make the dialog visible
           dialog.setVisible(true);
       }
   }//GEN-LAST:event_cancelButtonActionPerformed

   private void RemoveArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveArrowActionPerformed
       String selectedUserToDelete = selectedContacts.getSelectedValue();
       usersToCompare.removeElement(selectedUserToDelete);
       selectedContacts.setModel(usersToCompare);
   }//GEN-LAST:event_RemoveArrowActionPerformed

   private void AddArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddArrowActionPerformed

       String selectedUser = contactList1.getSelectedValue();

       if (usersToCompare.contains(selectedUser)) {
           JOptionPane.showMessageDialog(null, "You have already added this user.");
       } else {
           usersToCompare.addElement(selectedUser);
           selectedContacts.setModel(usersToCompare);
       }
   }//GEN-LAST:event_AddArrowActionPerformed

    /**
     * @param args the command line arguments
     */

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton AddArrow;
   private javax.swing.JButton RemoveArrow;
   private javax.swing.JButton cancelButton;
   private javax.swing.JButton confirmButton;
   private javax.swing.JList<String> contactList1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPasswordField jPasswordField1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JPanel mainPanel;
   private javax.swing.JLabel searchLabel;
   private javax.swing.JLabel searchLabel2;
   private javax.swing.JList<String> selectedContacts;
   // End of variables declaration//GEN-END:variables
}
