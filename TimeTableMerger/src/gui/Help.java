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
public class Help extends javax.swing.JDialog {

    private final TimetableDAO timetableDAO;
    private final UserDAO userDAO;
    private final UserStorageDAO userStorageDAO;

    /**
     * Creates new form Test
     *
     * @param parent
     * @param modal
     * @param timetableDAO
     * @param userStorageDAO
     */
    public Help(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO) {
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
      HelpLabel = new javax.swing.JLabel();
      greenColour = new javax.swing.JLabel();
      Label1 = new java.awt.Label();
      Label2 = new java.awt.Label();
      OK = new javax.swing.JButton();
      redColour1 = new javax.swing.JLabel();

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

      HelpLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
      HelpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
      HelpLabel.setName("HelpLabel"); // NOI18N

      greenColour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      greenColour.setName("greenColour"); // NOI18N

      Label1.setName("Label2"); // NOI18N
      Label1.setText("Busy Time Slot");

      Label2.setName("Label2"); // NOI18N
      Label2.setText("Free Time Slot");

      OK.setText("OK");
      OK.setName("OK"); // NOI18N
      OK.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            OKActionPerformed(evt);
         }
      });

      redColour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      redColour1.setName("redColour1"); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(greenColour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(redColour1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(HelpLabel)
                  .addGap(60, 60, 60))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(102, 102, 102))))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(HelpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(greenColour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(8, 8, 8)
                  .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(14, 14, 14)
                  .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(redColour1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(OK)
            .addContainerGap(22, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButton1ActionPerformed

   private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
      dispose(); 
   }//GEN-LAST:event_OKActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel HelpLabel;
   private java.awt.Label Label1;
   private java.awt.Label Label2;
   private javax.swing.JButton OK;
   private javax.swing.JButton exitButton1;
   private javax.swing.JLabel greenColour;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel redColour1;
   // End of variables declaration//GEN-END:variables
}
