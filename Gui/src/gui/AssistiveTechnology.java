/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Dimeji
 */
public class AssistiveTechnology extends javax.swing.JFrame {

    /**
     * Creates new form AssistiveTechnology
     */
    public AssistiveTechnology() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Nci = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Contact = new javax.swing.JLabel();
        UserGuide = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/white nci logo small.png"))); // NOI18N
        Nci.setText(" ");
        Nci.setBounds(10, 10, 230, 137);
        jLayeredPane1.add(Nci, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/back-arrow2 black and red.png"))); // NOI18N
        jButton5.setToolTipText("");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(10, 720, 74, 72);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Assistive Technology:");
        jLabel4.setBounds(40, 190, 270, 40);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("<html> Assistive Technology is any device, piece of equipment, or software that can help reduce<br/> the negative impact of a disability on a student’s academic success. Examples include:<br/><br/>\n•\tVoice Recognition Software<br/>\n•\tLiteracy Support Software<br/>\n•\tText to Speech Software<br/>\n•\tText Enlargement Software<br/>\n•\tAlternative Keyboards & Mice<br/>\n•\tDigital Voice Recorders <br/>\n<html/>");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jLabel2.setBounds(30, 230, 400, 280);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> To avail of this service a student must first register with Disability Officer (D.O). Once registered, a student can benefit from the use of the dedicated facilities available in the AT Centre, located in the Library, together with the support and training provided by the A.T. Officer.<html/>");
        jLabel3.setBounds(40, 520, 390, 160);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Contact.setForeground(new java.awt.Color(51, 255, 102));
        Contact.setText("<html><b>Contact</b>: Karen Mooney<br>\nDisability Officer<br/>\n<b>Phone</b>: 01 6599269<br>\n<b>Email</b>: karen.mooney@ncirl.ie\n\n<html/>");
        Contact.setBounds(300, 60, 170, 100);
        jLayeredPane1.add(Contact, javax.swing.JLayeredPane.DEFAULT_LAYER);

        UserGuide.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserGuide.setText("User Guides");
        UserGuide.setFocusPainted(false);
        UserGuide.setOpaque(false);
        UserGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserGuideActionPerformed(evt);
            }
        });
        UserGuide.setBounds(143, 730, 110, 60);
        jLayeredPane1.add(UserGuide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/help button take 1.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setBounds(380, 710, 90, 84);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setText("jButton6");
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setRolloverEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(390, 730, 60, 50);
        jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Math 2 wallpaper.jpg"))); // NOI18N
        background.setOpaque(true);
        background.setBounds(0, 0, 480, 800);
        jLayeredPane1.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Disability myDisability = new Disability ();
      myDisability.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void UserGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserGuideActionPerformed
        try{
            
            
            String URL ="https://moodle.ncirl.ie/login/index.php";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        
        
        }
    }//GEN-LAST:event_UserGuideActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ContactGui myCG = new ContactGui(true);
        myCG.setVisible(true);
        this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AssistiveTechnology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssistiveTechnology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssistiveTechnology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssistiveTechnology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssistiveTechnology().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Nci;
    private javax.swing.JButton UserGuide;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
