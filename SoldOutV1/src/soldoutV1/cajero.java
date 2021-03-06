/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldoutV1;

import Metodos.Conexion;
import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class cajero extends javax.swing.JFrame {

    
    public cajero() {
        initComponents();
         setVisible(true);
         selectMesero();
         menu();
        //dashOff();
    }
    
    DefaultTableModel model = new DefaultTableModel();
    TableRowSorter trs;

    
    public void cobro() {
  
    }
    
    public void selectMesero(){
        
        String mesero = (JOptionPane.showInputDialog(null,"Selecciona el mesero porfavor","Meseros",
                JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Selecciona","Pedro","Chelis","Kitian"},
                "Selecciona")).toString();
        
        lblNMesero.setText(mesero);
    }
    
    public void añadirElementos() {
        
        DefaultTableModel tabla01 = (DefaultTableModel)tblMenu.getModel();
        
        Object [] fila = new Object[3];
        
        fila [0] = txtNombre.getText();
        fila [1] = txtDescripcion.getText();
        fila [2] = txtPrecio.getText();
        
        tabla01.addRow(fila);
        
        tblMenu.setModel(tabla01);
    }
    
    public void barraBusqueda() {
        String valor = txfBuscador.getText();
        
        if (valor.isEmpty()) {
            tblMenu.clearSelection();
        }else {
            for (int i = 0; i < tblMenu.getRowCount(); i++) {
                if (tblMenu.getValueAt(i, 0).equals(valor)) {
                    //tblMenu.requestFocus();
                    tblMenu.changeSelection(i, 0, false, false);
                }
   
            }
        }
    }
    
    public DefaultTableModel menu () {
        
        Conexion conected = new Conexion();
        
        
        int cont = 1; //Acumula el NO. de registros
        
        String [] nombresColumnas = {"idPlatillo","nombre","descripcion","precio"};
        String [] registros = new String [4];
        
        DefaultTableModel tblMenu = new DefaultTableModel(null, nombresColumnas);
        
        String sql = "Select * FROM menu";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            cn = conected.getConnection();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {                
                registros [0] = rs.getString("idPlatillo");
                registros [1] = rs.getString("nombre");
                registros [2] = rs.getString("descripcion");
                registros [3] = rs.getString("precio");
                
                tblMenu.addRow(registros);
            }
                    
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR");
        }
        finally
        {  
        
            try {
                
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
                
            } catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null, e);
            }
      
        }
        
        return tblMenu;
        }
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        btnEntradas = new rsbuttom.RSButtonMetro();
        lblBebidas1 = new javax.swing.JLabel();
        lblNMesero = new javax.swing.JLabel();
        lblMesero = new javax.swing.JLabel();
        btnBebidas = new rsbuttom.RSButtonMetro();
        lblCategory = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblBebidas = new javax.swing.JLabel();
        btnAñadir = new rsbuttom.RSButtonMetro();
        lblCategorias = new javax.swing.JLabel();
        txfBuscador = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        pnlDash = new javax.swing.JPanel();
        btnSlide = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        Background.setBackground(new java.awt.Color(102, 102, 102));
        Background.setLayout(null);

        btnEntradas.setBackground(new java.awt.Color(255, 255, 255));
        btnEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entradas.png"))); // NOI18N
        btnEntradas.setColorHover(new java.awt.Color(220, 211, 204));
        btnEntradas.setColorNormal(new java.awt.Color(255, 255, 255));
        btnEntradas.setColorPressed(new java.awt.Color(153, 204, 0));
        Background.add(btnEntradas);
        btnEntradas.setBounds(310, 150, 150, 70);

        lblBebidas1.setFont(new java.awt.Font("Dosis ExtraBold", 3, 18)); // NOI18N
        lblBebidas1.setForeground(new java.awt.Color(255, 255, 255));
        lblBebidas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBebidas1.setText("Entradas");
        Background.add(lblBebidas1);
        lblBebidas1.setBounds(310, 230, 150, 24);

        lblNMesero.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblNMesero.setForeground(new java.awt.Color(255, 255, 0));
        lblNMesero.setText("#name");
        Background.add(lblNMesero);
        lblNMesero.setBounds(990, 270, 160, 30);

        lblMesero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMesero.setForeground(new java.awt.Color(255, 255, 255));
        lblMesero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMesero.setText("Mesero:");
        Background.add(lblMesero);
        lblMesero.setBounds(810, 270, 170, 30);

        btnBebidas.setBackground(new java.awt.Color(255, 255, 255));
        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bebidas.png"))); // NOI18N
        btnBebidas.setColorHover(new java.awt.Color(220, 211, 204));
        btnBebidas.setColorNormal(new java.awt.Color(255, 255, 255));
        btnBebidas.setColorPressed(new java.awt.Color(153, 204, 0));
        Background.add(btnBebidas);
        btnBebidas.setBounds(130, 150, 150, 70);

        lblCategory.setFont(new java.awt.Font("Dosis ExtraBold", 1, 24)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setText("Categorias:");
        Background.add(lblCategory);
        lblCategory.setBounds(110, 80, 140, 30);

        txtNombre.setText("jTextField1");
        Background.add(txtNombre);
        txtNombre.setBounds(510, 880, 140, 24);

        txtPrecio.setText("jTextField1");
        Background.add(txtPrecio);
        txtPrecio.setBounds(510, 940, 140, 24);

        txtDescripcion.setText("jTextField1");
        Background.add(txtDescripcion);
        txtDescripcion.setBounds(510, 910, 140, 24);

        lblBebidas.setFont(new java.awt.Font("Dosis ExtraBold", 3, 18)); // NOI18N
        lblBebidas.setForeground(new java.awt.Color(255, 255, 255));
        lblBebidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBebidas.setText("Bebidas");
        Background.add(lblBebidas);
        lblBebidas.setBounds(130, 230, 150, 24);

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        Background.add(btnAñadir);
        btnAñadir.setBounds(310, 900, 150, 35);

        lblCategorias.setBackground(new java.awt.Color(255, 255, 255));
        lblCategorias.setFont(new java.awt.Font("Dosis ExtraBold", 1, 24)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        Background.add(lblCategorias);
        lblCategorias.setBounds(110, 120, 1750, 150);

        txfBuscador.setBackground(new java.awt.Color(255, 255, 255));
        txfBuscador.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txfBuscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscador.setToolTipText("Buscador: \"Permite al usuario, realizar un filtrado de los platillos y bebidas dentro del menu\".");
        txfBuscador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txfBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscadorKeyTyped(evt);
            }
        });
        Background.add(txfBuscador);
        txfBuscador.setBounds(820, 300, 330, 30);
        txfBuscador.getAccessibleContext().setAccessibleName("Hola mundo");

        tblMenu.setBackground(new java.awt.Color(255, 255, 255));
        tblMenu.setForeground(new java.awt.Color(0, 0, 0));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alitas 6pzs", "BBQ", "65"},
                {"Alitas 6pzs", "Limon-Pimiento", "65"},
                {"Hamburguesa", "Hawaiana", "82"},
                {"CocaCola", "600 ml", "15"}
            },
            new String [] {
                "Nombre", "Descripcion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMenu.setAutoscrolls(false);
        tblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblMenu.setDropMode(javax.swing.DropMode.INSERT);
        tblMenu.setSelectionBackground(new java.awt.Color(51, 204, 0));
        jScrollPane1.setViewportView(tblMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(jPanel1);
        jPanel1.setBounds(300, 360, 1330, 470);

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

        Background.add(pnlDash);
        pnlDash.setBounds(0, 0, 80, 1080);

        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guiMenu.jpg"))); // NOI18N
        Background.add(lblBackground);
        lblBackground.setBounds(0, 0, 1920, 1080);

        getContentPane().add(Background);
        Background.setBounds(2, 0, 2200, 1110);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSlideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSlideMouseClicked

        //dashActive();
    }//GEN-LAST:event_btnSlideMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
       añadirElementos();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txfBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscadorKeyTyped
        
            txfBuscador.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txfBuscador.getText(), 1));
            }

        });

        trs = new TableRowSorter(model);
        tblMenu.setRowSorter(trs);
        
    }//GEN-LAST:event_txfBuscadorKeyTyped

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
            java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private rsbuttom.RSButtonMetro btnAñadir;
    private rsbuttom.RSButtonMetro btnBebidas;
    private rsbuttom.RSButtonMetro btnEntradas;
    private javax.swing.JButton btnSlide;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBebidas;
    private javax.swing.JLabel lblBebidas1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JLabel lblNMesero;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txfBuscador;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
