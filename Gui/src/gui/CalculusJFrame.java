/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 * Class name  CalculusJFrame.java
 * @author Fiachra Devitt x12317886
 * Version 01
 * Date 30/02/2013
 */
public class CalculusJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculusJframe
     */
    public CalculusJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        QuotientLabel.setVisible(false);
        ProductRuleLabel.setVisible(false);
        GeneralRuleLabel.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        GeneralRuleLabel = new javax.swing.JLabel();
        ProductRuleLabel = new javax.swing.JLabel();
        QuotientLabel = new javax.swing.JLabel();
        MathboxLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculus Support");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/back-arrow2 black and red.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(10, 720, 74, 72);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/white nci logo small.png"))); // NOI18N
        jLabel2.setBounds(10, 10, 230, 137);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        GeneralRuleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/General Rule box.png"))); // NOI18N
        GeneralRuleLabel.setBounds(10, 330, 460, 310);
        jLayeredPane1.add(GeneralRuleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ProductRuleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Product box.png"))); // NOI18N
        ProductRuleLabel.setBounds(10, 330, 460, 310);
        jLayeredPane1.add(ProductRuleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        QuotientLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Quotient box.png"))); // NOI18N
        QuotientLabel.setBounds(10, 330, 460, 310);
        jLayeredPane1.add(QuotientLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MathboxLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Calculus box.png"))); // NOI18N
        MathboxLabel.setText("jLabel3");
        MathboxLabel.setBounds(10, 330, 460, 310);
        jLayeredPane1.add(MathboxLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a topic...", "General Rule", "Product Rule", "Quotient Rule" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.setBounds(10, 210, 460, 40);
        jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Math 2 wallpaper.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 480, 800);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
MathHomeJFrame myMH = new MathHomeJFrame();
myMH.setVisible (true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 1) {
            QuotientLabel.setVisible(false);
            ProductRuleLabel.setVisible(false);
            GeneralRuleLabel.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 2) {
            QuotientLabel.setVisible(false);
            ProductRuleLabel.setVisible(true);
            GeneralRuleLabel.setVisible(false);
        } else if (jComboBox1.getSelectedIndex() == 3) {
            QuotientLabel.setVisible(true);
            ProductRuleLabel.setVisible(false);
            GeneralRuleLabel.setVisible(false);
        } else if (jComboBox1.getSelectedIndex() == 0) {
            QuotientLabel.setVisible(false);
            ProductRuleLabel.setVisible(false);
            GeneralRuleLabel.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CalculusJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GeneralRuleLabel;
    private javax.swing.JLabel MathboxLabel;
    private javax.swing.JLabel ProductRuleLabel;
    private javax.swing.JLabel QuotientLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
