package soldoutV1;
import soldoutV1.guiSplashscreen;
import Metodos.loadingBar;
import Metodos.Conexion;
import java.awt.Color;
       


public class guiSplashscreen extends javax.swing.JFrame {

loadingBar hilo;
   
    public guiSplashscreen() {
        initComponents();
        
        hilo = new loadingBar(jpProgressBar);
        hilo.start();
        hilo = null;
        //REALIZAMOS LA CONEXION A LA BD
        Conexion conected = new Conexion();
        conected.getConnection();
    }

  
       
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpProgressBar = new javax.swing.JProgressBar();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 675));
        setMinimumSize(new java.awt.Dimension(900, 675));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpProgressBar.setForeground(new java.awt.Color(51, 204, 0));
        jpProgressBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jpProgressBar.setBorderPainted(false);
        jpProgressBar.setString("100%");
        jpProgressBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jpProgressBarStateChanged(evt);
            }
        });
        getContentPane().add(jpProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 350, 20));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SplashScreen.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpProgressBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jpProgressBarStateChanged
       
        if (jpProgressBar.getValue()==100) {
              dispose();
       guiLogin opnLog = new guiLogin();
       opnLog.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jpProgressBarStateChanged

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
            java.util.logging.Logger.getLogger(guiSplashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiSplashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiSplashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiSplashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSplashscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar jpProgressBar;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
