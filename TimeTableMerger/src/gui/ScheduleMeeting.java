package gui;

/**
 *
 * @author broma609
 */
public class ScheduleMeeting extends javax.swing.JFrame {

	/**
	 * Creates new form ScheduleMeeting
	 */
	public ScheduleMeeting() {
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

      mainPanel = new javax.swing.JPanel();
      titleLabel = new javax.swing.JLabel();
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
      searchField = new javax.swing.JTextField();
      searchButton = new javax.swing.JButton();
      searchLabel = new javax.swing.JLabel();
      searchResultsPane = new javax.swing.JScrollPane();
      searchTextArea = new javax.swing.JTextArea();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      mainPanel.setBackground(new java.awt.Color(255, 255, 255));
      mainPanel.setName("mainPanel"); // NOI18N

      titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 60)); // NOI18N
      titleLabel.setText("Schedule a Meeting");
      titleLabel.setName("titleLabel"); // NOI18N

      durationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      durationLabel.setText("Duration:");
      durationLabel.setName("durationLabel"); // NOI18N

      durationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      durationCombo.setName("durationCombo"); // NOI18N

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

      wedLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      wedLabel.setText("Wednesday");
      wedLabel.setName("wedLabel"); // NOI18N

      wedCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      wedCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      wedCheckBox.setName("wedCheckBox"); // NOI18N
      wedCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N

      thuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      thuLabel.setText("Thursday");
      thuLabel.setName("thuLabel"); // NOI18N

      thuCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      thuCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      thuCheckBox.setName("thuCheckBox"); // NOI18N
      thuCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N

      friLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      friLabel.setText("Friday");
      friLabel.setName("friLabel"); // NOI18N

      friCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      friCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      friCheckBox.setName("friCheckBox"); // NOI18N
      friCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N

      satLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      satLabel.setText("Saturday");
      satLabel.setName("satLabel"); // NOI18N

      satCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      satCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      satCheckBox.setName("satCheckBox"); // NOI18N
      satCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N

      sunLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      sunLabel.setText("Sunday");
      sunLabel.setName("sunLabel"); // NOI18N

      sunCheckBox.setBackground(new java.awt.Color(255, 255, 255));
      sunCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unselectedCheckBox.png"))); // NOI18N
      sunCheckBox.setName("sunCheckBox"); // NOI18N
      sunCheckBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectedCheckBox.png"))); // NOI18N

      searchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      searchField.setText("Search");
      searchField.setName("searchField"); // NOI18N

      searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchIcon.png"))); // NOI18N
      searchButton.setBorderPainted(false);
      searchButton.setContentAreaFilled(false);
      searchButton.setName("searchButton"); // NOI18N

      searchLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      searchLabel.setText("People:");
      searchLabel.setName("searchLabel"); // NOI18N

      searchResultsPane.setName("searchResultsPane"); // NOI18N

      searchTextArea.setColumns(20);
      searchTextArea.setRows(5);
      searchTextArea.setName("searchTextArea"); // NOI18N
      searchResultsPane.setViewportView(searchTextArea);

      javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
      mainPanel.setLayout(mainPanelLayout);
      mainPanelLayout.setHorizontalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(181, 181, 181)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(searchResultsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(thuLabel)
                     .addComponent(monLabel)
                     .addComponent(tueLabel)
                     .addComponent(wedLabel))
                  .addGap(18, 18, 18)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(thuCheckBox)
                     .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(tueCheckBox)
                           .addComponent(monCheckBox)
                           .addComponent(wedCheckBox))
                        .addGap(59, 59, 59)
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
                                 .addComponent(sunCheckBox))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
            .addContainerGap(165, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                  .addComponent(durationLabel)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(durationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(248, 248, 248))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                  .addComponent(titleLabel)
                  .addGap(146, 146, 146))))
      );
      mainPanelLayout.setVerticalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(titleLabel)
            .addGap(26, 26, 26)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(durationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(durationLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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
            .addGap(30, 30, 30)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addGap(9, 9, 9)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(searchLabel))
                  .addGap(18, 18, 18))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                  .addComponent(searchButton)
                  .addGap(9, 9, 9)))
            .addComponent(searchResultsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(21, 21, 21))
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

   private void monCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monCheckBoxActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_monCheckBoxActionPerformed

	/**
	 * @param args the command line arguments
	 */


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<String> durationCombo;
   private javax.swing.JLabel durationLabel;
   private javax.swing.JCheckBox friCheckBox;
   private javax.swing.JLabel friLabel;
   private javax.swing.JPanel mainPanel;
   private javax.swing.JCheckBox monCheckBox;
   private javax.swing.JLabel monLabel;
   private javax.swing.JCheckBox satCheckBox;
   private javax.swing.JLabel satLabel;
   private javax.swing.JButton searchButton;
   private javax.swing.JTextField searchField;
   private javax.swing.JLabel searchLabel;
   private javax.swing.JScrollPane searchResultsPane;
   private javax.swing.JTextArea searchTextArea;
   private javax.swing.JCheckBox sunCheckBox;
   private javax.swing.JLabel sunLabel;
   private javax.swing.JCheckBox thuCheckBox;
   private javax.swing.JLabel thuLabel;
   private javax.swing.JLabel titleLabel;
   private javax.swing.JCheckBox tueCheckBox;
   private javax.swing.JLabel tueLabel;
   private javax.swing.JCheckBox wedCheckBox;
   private javax.swing.JLabel wedLabel;
   // End of variables declaration//GEN-END:variables
}
