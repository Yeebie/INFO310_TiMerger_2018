package gui;

import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import gui.helpers.SimpleListModel;
import java.awt.Window;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author broma609
 */
public class ScheduleMeeting extends javax.swing.JFrame {
	
	private UserDAO userDAO;
	private final TimetableDAO timetableDAO;
	private final UserStorageDAO userStorageDAO;
	private SimpleListModel myModel = new SimpleListModel();
	
	private SimpleListModel displayContactList = new SimpleListModel(); 

//not 100% sure these are needed yet
	private boolean monday;
	private boolean tuesday;
	private boolean wednesday;
	private boolean thursday;
	private boolean friday;
	private boolean saturday;
	private boolean sunday;


	/**
	 * Creates new form ScheduleMeeting
	 */
	public ScheduleMeeting(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO) {
		this.timetableDAO = timetableDAO;
		this.userStorageDAO = userStorageDAO;
		this.setName("Schedule Meeting");
		initComponents();
		
		String currentUser = userStorageDAO.getUserName(); 
		displayContactList.updateItems(userDAO.getContactList(currentUser));
		contactList1.setModel(displayContactList);
		
		//myModel.updateItems(userDAO.getUserList());
		//selectedContacts.setModel(myModel);
		
		//set all days to selected by default
		monCheckBox.setSelected(true);
		tueCheckBox.setSelected(true);
		wedCheckBox.setSelected(true);
		thuCheckBox.setSelected(true);
		friCheckBox.setSelected(true);
		satCheckBox.setSelected(true);
		sunCheckBox.setSelected(true);
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
      durationLabel = new javax.swing.JLabel();
      durationCombo = new javax.swing.JComboBox<>();
      monLabel = new javax.swing.JLabel();
      monCheckBox = new javax.swing.JCheckBox();
      tueLabel = new javax.swing.JLabel();
      tueCheckBox = new javax.swing.JCheckBox();
      wedLabel = new javax.swing.JLabel();
      wedCheckBox = new javax.swing.JCheckBox();
      thuLabel = new javax.swing.JLabel();
      thuCheckBox = new javax.swing.JCheckBox();
      friLabel = new javax.swing.JLabel();
      friCheckBox = new javax.swing.JCheckBox();
      satLabel = new javax.swing.JLabel();
      satCheckBox = new javax.swing.JCheckBox();
      sunLabel = new javax.swing.JLabel();
      sunCheckBox = new javax.swing.JCheckBox();
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

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      mainPanel.setBackground(new java.awt.Color(255, 255, 255));
      mainPanel.setName("mainPanel"); // NOI18N

      durationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      durationLabel.setText("Duration:");
      durationLabel.setName("durationLabel"); // NOI18N

      durationCombo.setName("durationCombo"); // NOI18N
      durationCombo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            durationComboActionPerformed(evt);
         }
      });

      monLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      monLabel.setText("Monday");
      monLabel.setName("monLabel"); // NOI18N

      monCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      monCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      monCheckBox.setName("monCheckBox"); // NOI18N
      monCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      monCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            monCheckBoxActionPerformed(evt);
         }
      });

      tueLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      tueLabel.setText("Tuesday");
      tueLabel.setName("tueLabel"); // NOI18N

      tueCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      tueCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      tueCheckBox.setName("tueCheckBox"); // NOI18N
      tueCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      tueCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tueCheckBoxActionPerformed(evt);
         }
      });

      wedLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      wedLabel.setText("Wednesday");
      wedLabel.setName("wedLabel"); // NOI18N

      wedCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      wedCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      wedCheckBox.setName("wedCheckBox"); // NOI18N
      wedCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      wedCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wedCheckBoxActionPerformed(evt);
         }
      });

      thuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      thuLabel.setText("Thursday");
      thuLabel.setName("thuLabel"); // NOI18N

      thuCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      thuCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      thuCheckBox.setName("thuCheckBox"); // NOI18N
      thuCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      thuCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thuCheckBoxActionPerformed(evt);
         }
      });

      friLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      friLabel.setText("Friday");
      friLabel.setName("friLabel"); // NOI18N

      friCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      friCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      friCheckBox.setName("friCheckBox"); // NOI18N
      friCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      friCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            friCheckBoxActionPerformed(evt);
         }
      });

      satLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      satLabel.setText("Saturday");
      satLabel.setName("satLabel"); // NOI18N

      satCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      satCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      satCheckBox.setName("satCheckBox"); // NOI18N
      satCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      satCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            satCheckBoxActionPerformed(evt);
         }
      });

      sunLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      sunLabel.setText("Sunday");
      sunLabel.setName("sunLabel"); // NOI18N

      sunCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      sunCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      sunCheckBox.setName("sunCheckBox"); // NOI18N
      sunCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N
      sunCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sunCheckBoxActionPerformed(evt);
         }
      });

      searchLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
      searchLabel.setText("Contact List:");
      searchLabel.setName("searchLabel"); // NOI18N

      jScrollPane1.setName("jScrollPane1"); // NOI18N

      selectedContacts.setName("selectedContacts"); // NOI18N
      jScrollPane1.setViewportView(selectedContacts);

      jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 85)); // NOI18N
      jLabel1.setText("Schedule Meeting");
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

      searchLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
      searchLabel2.setText("Merge timetables with:");
      searchLabel2.setName("searchLabel2"); // NOI18N

      AddArrow.setText("Add");
      AddArrow.setName("AddArrow"); // NOI18N
      AddArrow.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddArrowActionPerformed(evt);
         }
      });

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
            .addComponent(durationLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(durationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(191, 191, 191))
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(29, 29, 29)
                  .addComponent(jLabel1))
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(121, 121, 121)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(thuLabel)
                     .addComponent(monLabel)
                     .addComponent(tueLabel)
                     .addComponent(wedLabel))
                  .addGap(18, 18, 18)
                  .addComponent(thuCheckBox))
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(262, 262, 262)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(tueCheckBox)
                     .addComponent(monCheckBox)
                     .addComponent(wedCheckBox))
                  .addGap(67, 67, 67)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(friLabel)
                        .addGap(18, 18, 18)
                        .addComponent(friCheckBox))
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(satLabel)
                           .addComponent(sunLabel))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(satCheckBox)
                           .addComponent(sunCheckBox))))))
            .addGap(0, 43, Short.MAX_VALUE))
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(228, 228, 228)
                  .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(57, 57, 57)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(AddArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(RemoveArrow)))
                     .addComponent(searchLabel))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(searchLabel2)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(78, Short.MAX_VALUE))
      );
      mainPanelLayout.setVerticalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel1)
            .addGap(31, 31, 31)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(durationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(durationLabel))
            .addGap(36, 36, 36)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(10, 10, 10)
                  .addComponent(monLabel)
                  .addGap(35, 35, 35)
                  .addComponent(tueLabel)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(wedLabel)
                        .addGap(42, 42, 42)
                        .addComponent(thuLabel)
                        .addGap(11, 11, 11))
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(wedCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(thuCheckBox))))
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(monCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tueCheckBox))
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(friCheckBox)
                           .addGroup(mainPanelLayout.createSequentialGroup()
                              .addGap(10, 10, 10)
                              .addComponent(friLabel)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(mainPanelLayout.createSequentialGroup()
                              .addGap(18, 18, 18)
                              .addComponent(satCheckBox)
                              .addGap(18, 18, 18)
                              .addComponent(sunCheckBox))
                           .addGroup(mainPanelLayout.createSequentialGroup()
                              .addGap(28, 28, 28)
                              .addComponent(satLabel)
                              .addGap(37, 37, 37)
                              .addComponent(sunLabel)))))
                  .addGap(67, 67, 67)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(searchLabel)
               .addComponent(searchLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(66, 66, 66))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                  .addComponent(AddArrow)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(RemoveArrow)
                  .addGap(100, 100, 100)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(confirmButton)
               .addComponent(cancelButton))
            .addGap(32, 32, 32))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void monCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_monCheckBoxActionPerformed

   private void tueCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tueCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_tueCheckBoxActionPerformed

   private void wedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_wedCheckBoxActionPerformed

   private void thuCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_thuCheckBoxActionPerformed

   private void friCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_friCheckBoxActionPerformed

   private void satCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_satCheckBoxActionPerformed

   private void sunCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_sunCheckBoxActionPerformed

   private void durationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationComboActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_durationComboActionPerformed

   private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
      //set day fields to true/false depending if check box has been unselected (chec kboxes are selected by default
		monday = monCheckBox.isSelected();
		tuesday = tueCheckBox.isSelected();
		wednesday = wedCheckBox.isSelected();
		thursday = thuCheckBox.isSelected();
		friday = friCheckBox.isSelected();
		saturday = satCheckBox.isSelected();
		sunday = sunCheckBox.isSelected();
   }//GEN-LAST:event_confirmButtonActionPerformed

   private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
            int result = JOptionPane.showConfirmDialog(
         this, "Are you sure you want to cancel?","Confirmation Dialog",  JOptionPane.YES_NO_OPTION);
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
      // TODO add your handling code here:
   }//GEN-LAST:event_RemoveArrowActionPerformed

   private void AddArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddArrowActionPerformed
      // TODO add your handling code here:
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
   private javax.swing.JComboBox<String> durationCombo;
   private javax.swing.JLabel durationLabel;
   private javax.swing.JCheckBox friCheckBox;
   private javax.swing.JLabel friLabel;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JPanel mainPanel;
   private javax.swing.JCheckBox monCheckBox;
   private javax.swing.JLabel monLabel;
   private javax.swing.JCheckBox satCheckBox;
   private javax.swing.JLabel satLabel;
   private javax.swing.JLabel searchLabel;
   private javax.swing.JLabel searchLabel2;
   private javax.swing.JList<String> selectedContacts;
   private javax.swing.JCheckBox sunCheckBox;
   private javax.swing.JLabel sunLabel;
   private javax.swing.JCheckBox thuCheckBox;
   private javax.swing.JLabel thuLabel;
   private javax.swing.JCheckBox tueCheckBox;
   private javax.swing.JLabel tueLabel;
   private javax.swing.JCheckBox wedCheckBox;
   private javax.swing.JLabel wedLabel;
   // End of variables declaration//GEN-END:variables
}
