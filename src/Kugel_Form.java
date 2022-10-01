
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maryem
 */
public class Kugel_Form extends javax.swing.JFrame {

    /**
     * Creates new form Kugel_Form
     */
    public Kugel_Form() {
        initComponents();
        
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Wrong  input Format exception DocumentFilter
                ((AbstractDocument) rText.getDocument()).setDocumentFilter(new FilterJframeText() );

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        ResText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Kugel.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, -1, 201));

        ResText.setBackground(new java.awt.Color(255, 255, 255));
        ResText.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ResText.setForeground(new java.awt.Color(51, 51, 51));
        ResText.setText("Result");
        ResText.setBorder(null);
        ResText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResTextActionPerformed(evt);
            }
        });
        getContentPane().add(ResText, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 277, 120, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("r:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setText("Kugel Volume ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("berechnen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 274, -1, -1));

        rText.setBackground(new java.awt.Color(255, 255, 255));
        rText.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rText.setForeground(new java.awt.Color(51, 51, 51));
        rText.setBorder(null);
        getContentPane().add(rText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Calculate the Kugel's Volume:
        // Fomule : V = 4/3*(P*r^3)
        
        double r = Double.parseDouble(rText.getText());
        Double Res = (4*22*r*r*r)/(3*7);
        //Round the Result 2number after coma '.' 
        Res=Math.round(Res*100.0)/100.0;
         ResText.setText(Res.toString());    }   
         
         //Make Exception for Empty File
   double ParseDouble(String strNumber) {
   if (strNumber != null && strNumber.length() > 0) {
       try {
          return Double.parseDouble(strNumber);
       } catch(NumberFormatException e) {
           
          return -1;   
          
       }
   }
   else return 0;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResTextActionPerformed

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
            java.util.logging.Logger.getLogger(Kugel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kugel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kugel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kugel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kugel_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ResText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField rText;
    // End of variables declaration//GEN-END:variables
}