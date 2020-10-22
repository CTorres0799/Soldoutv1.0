package soldoutV1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JOptionPane;


public class gui1_SO extends javax.swing.JFrame implements Runnable{

    String hora,minutos,segundos;
    Thread hilo;
    
    public gui1_SO() {
        initComponents();
        this.btnInicio.setSelected(true);
        //txtDate.setText(fecha_hora());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);{
        dashOff();
        labelsUsuario();
    }
        
    }

    public void labelsUsuario() {
       
        if (pnlSlide.isEnabled()) {
            //lblGetUser.setText("");
            lblGetUser1.setText("Pedro");
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDash = new javax.swing.JPanel();
        btnSlide = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        pnlSlide = new javax.swing.JPanel();
        btnMenu = new rsbuttom.RSButtonMetro();
        btnInicio = new rsbuttom.RSButtonMetro();
        lblUsuario = new javax.swing.JLabel();
        lblGetUser = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblGetUser1 = new javax.swing.JLabel();
        btnHerramientas = new rsbuttom.RSButtonMetro();
        lblOFF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoldOut V1.0");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDash.setBackground(new java.awt.Color(32, 32, 32));

        btnSlide.setBackground(new java.awt.Color(32, 32, 32));
        btnSlide.setForeground(new java.awt.Color(32, 32, 32));
        btnSlide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dash2.0.png"))); // NOI18N
        btnSlide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSlide.setBorderPainted(false);
        btnSlide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSlide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSlideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDashLayout = new javax.swing.GroupLayout(pnlDash);
        pnlDash.setLayout(pnlDashLayout);
        pnlDashLayout.setHorizontalGroup(
            pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSlide)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashLayout.setVerticalGroup(
            pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashLayout.createSequentialGroup()
                .addComponent(btnSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1006, Short.MAX_VALUE))
        );

        getContentPane().add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guiPrincipal2.jpg"))); // NOI18N
        lblBackground.setText("jLabel1");
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlSlide.setBackground(new java.awt.Color(32, 32, 32));
        pnlSlide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnMenu.png"))); // NOI18N
        btnMenu.setColorHover(new java.awt.Color(102, 102, 102));
        btnMenu.setColorNormal(new java.awt.Color(32, 32, 32));
        btnMenu.setColorPressed(new java.awt.Color(184, 222, 146));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlSlide.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 510, 90));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInicio - copia.png"))); // NOI18N
        btnInicio.setToolTipText("Inicio: \"Permite al usuario volver a la pantalla principal\".");
        btnInicio.setColorHover(new java.awt.Color(102, 102, 102));
        btnInicio.setColorNormal(new java.awt.Color(32, 32, 32));
        btnInicio.setColorPressed(new java.awt.Color(184, 222, 146));
        btnInicio.setName("Inicio: Hola"); // NOI18N
        pnlSlide.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 510, 90));
        btnInicio.getAccessibleContext().setAccessibleName("Inicio: Hola");
        btnInicio.getAccessibleContext().setAccessibleDescription("");

        lblUsuario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario:");
        pnlSlide.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 510, -1));

        lblGetUser.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblGetUser.setForeground(new java.awt.Color(51, 255, 51));
        lblGetUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGetUser.setText("#user");
        pnlSlide.add(lblGetUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, -1));

        lblRol.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblRol.setForeground(new java.awt.Color(255, 255, 255));
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRol.setText("Rol:");
        pnlSlide.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 510, -1));

        lblGetUser1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblGetUser1.setForeground(new java.awt.Color(51, 255, 51));
        lblGetUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGetUser1.setText("#rol");
        pnlSlide.add(lblGetUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 510, -1));

        btnHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHerramientas.png"))); // NOI18N
        btnHerramientas.setColorHover(new java.awt.Color(102, 102, 102));
        btnHerramientas.setColorNormal(new java.awt.Color(32, 32, 32));
        btnHerramientas.setColorPressed(new java.awt.Color(184, 222, 146));
        btnHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHerramientasActionPerformed(evt);
            }
        });
        pnlSlide.add(btnHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 510, 100));

        getContentPane().add(pnlSlide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 1090));

        lblOFF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblOFFMouseMoved(evt);
            }
        });
        getContentPane().add(lblOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 0, 1410, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void dashOff() {
       pnlDash.setVisible(true);
       pnlDash.setEnabled(true);
       lblOFF.setVisible(false);
       lblOFF.setEnabled(false);
       pnlSlide.setVisible(false);
       pnlSlide.setEnabled(false);
    }
    
    public void dashActive() {
       pnlDash.setVisible(false);
       pnlDash.setEnabled(false);
       lblOFF.setVisible(true);
       lblOFF.setEnabled(true); 
       pnlSlide.setVisible(true);
       pnlSlide.setEnabled(true);    
    }
    
    private void btnSlideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSlideMouseClicked
        
        dashActive();
        
    }//GEN-LAST:event_btnSlideMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        cajero extGuiSO1 = new cajero();
        extGuiSO1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void lblOFFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOFFMouseMoved
        dashOff();
    }//GEN-LAST:event_lblOFFMouseMoved

    private void btnHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHerramientasActionPerformed
        guiHerramientas opnHmts = new guiHerramientas();
        opnHmts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHerramientasActionPerformed

   //METODOS 
   public static String fecha_hora() {
       
       Date fecha = new Date();
       SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
       return formatoFecha.format(fecha);
       
   }
   
   public void hora() {
       Calendar calendario = new GregorianCalendar();
       Date hora_Actual = new Date();
       calendario.setTime(hora_Actual);
       hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""
               +calendario.get(Calendar.HOUR_OF_DAY):"0"
               +calendario.get(Calendar.HOUR_OF_DAY);
       minutos=calendario.get(Calendar.MINUTE)>9?""
               +calendario.get(Calendar.MINUTE):"0"
               +calendario.get(Calendar.MINUTE);
       segundos=calendario.get(Calendar.SECOND)>9?""
               +calendario.get(Calendar.SECOND):"0"
               +calendario.get(Calendar.SECOND);
   }
   
   public void run(){
       Thread current = Thread.currentThread();
       
       while(current==hilo) {
           hora();
           //txtHR.setText(hora+":"+minutos+":"+segundos);
       }
   }
   
   
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
            java.util.logging.Logger.getLogger(gui1_SO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui1_SO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui1_SO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui1_SO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui1_SO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnHerramientas;
    private rsbuttom.RSButtonMetro btnInicio;
    private rsbuttom.RSButtonMetro btnMenu;
    private javax.swing.JButton btnSlide;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblGetUser;
    private javax.swing.JLabel lblGetUser1;
    private javax.swing.JLabel lblOFF;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlSlide;
    // End of variables declaration//GEN-END:variables

    
}
