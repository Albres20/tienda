/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//prueba David maquina 1
//prueba maquiba 2
//prueba maquina 3
//prueba maquina en 4
//prueba Angel
/**
 * mastor come ping4
 * @author David Pablo
 */
public class administradorBuscar extends javax.swing.JFrame {

    FondoPanel FondoPanel=new FondoPanel();
    //transient Basedatos bd = new Basedatos ();
    transient Statement st;
    public administradorBuscar() {
        this.setContentPane(FondoPanel);
        initComponents();
        //Probar coneccion de base de datos
        /*try {
            bd.conectar();
            st = bd.con.createStatement();
        } catch (SQLException e){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,"Principal");
        }
        */
        tablaBusquedaAdmin.setDefaultRenderer(Object.class, new Render());
       
                
        ImageIcon fondoboton2=new ImageIcon(getClass().getResource("/image/iconoBuscar.png"));
        Icon fondo2=new ImageIcon(fondoboton2.getImage().getScaledInstance(30,25, Image.SCALE_AREA_AVERAGING));
        Icon fondo2press=new ImageIcon(fondoboton2.getImage().getScaledInstance(40,30, Image.SCALE_AREA_AVERAGING));
        botonBusquedaAdministrador.setIcon(fondo2);
        botonBusquedaAdministrador.setPressedIcon(fondo2press);
        botonBusquedaAdministrador.setEnabled(true);
        
        
        ImageIcon fondoboton=new ImageIcon(getClass().getResource("/image/exit.png"));
        Icon fondo1=new ImageIcon(fondoboton.getImage().getScaledInstance(66,56, Image.SCALE_AREA_AVERAGING));
        Icon fondo1press=new ImageIcon(fondoboton.getImage().getScaledInstance(60,50, Image.SCALE_AREA_AVERAGING));
        botonSalirAdminBuscar.setIcon(fondo1);
        botonSalirAdminBuscar.setPressedIcon(fondo1press);
        botonSalirAdminBuscar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new logo();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new userSilueta();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel2.setBackground(new java.awt.Color(44, 39, 39));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(85, 101, 240));
        jPanel3.setFocusTraversalPolicyProvider(true);
        jPanel3.setPreferredSize(new java.awt.Dimension(1318, 59));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DE COMPRAS! - STORE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(25, 25, 25))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        registrarUsuarioAdminBuscar.setBackground(new java.awt.Color(0, 0, 0));
        registrarUsuarioAdminBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrarUsuarioAdminBuscar.setForeground(new java.awt.Color(255, 255, 255));
        registrarUsuarioAdminBuscar.setText("<html><p>Registrar</p><p>Usuario</p></html>");
        registrarUsuarioAdminBuscar.setBorder(null);
        registrarUsuarioAdminBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioAdminBuscarActionPerformed(evt);
            }
        });

        buscarAdminBuscar.setBackground(new java.awt.Color(0, 0, 0));
        buscarAdminBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarAdminBuscar.setForeground(new java.awt.Color(255, 255, 255));
        buscarAdminBuscar.setText("<html><p>Buscar/</p><p>Modificar</p></html>");

        pagosAdminBuscar.setBackground(new java.awt.Color(0, 0, 0));
        pagosAdminBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pagosAdminBuscar.setForeground(new java.awt.Color(255, 255, 255));
        pagosAdminBuscar.setText("Pagos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(Admin)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarUsuarioAdminBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buscarAdminBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagosAdminBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalirAdminBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addComponent(registrarUsuarioAdminBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buscarAdminBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pagosAdminBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalirAdminBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel4.setBackground(new java.awt.Color(192, 243, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda por DNI:  ");

        barraBusquedaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaAdminActionPerformed(evt);
            }
        });
        barraBusquedaAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barraBusquedaAdminKeyTyped(evt);
            }
        });

        tablaBusquedaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaBusquedaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBusquedaAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBusquedaAdmin);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(barraBusquedaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBusquedaAdministrador)
                .addContainerGap(494, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(barraBusquedaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBusquedaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );

        setBounds(0, 0, 1334, 804);
    }// </editor-fold>//GEN-END:initComponents

    private void barraBusquedaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBusquedaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBusquedaAdminActionPerformed

    private void registrarUsuarioAdminBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioAdminBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarUsuarioAdminBuscarActionPerformed

    private void tablaBusquedaAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBusquedaAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBusquedaAdminMouseClicked

    private void barraBusquedaAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraBusquedaAdminKeyTyped
        // TODO add your handling code here:
         char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo números");
        }
    }//GEN-LAST:event_barraBusquedaAdminKeyTyped

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
            java.util.logging.Logger.getLogger(administradorBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administradorBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administradorBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administradorBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administradorBuscar().setVisible(true);
            }
        });
    }
class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/image/FondoPrincipal.jpg")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
class logo extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/image/logoDiscord.png")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
class userSilueta extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/image/userSilueta.png")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JTextField barraBusquedaAdmin = new javax.swing.JTextField();
    public static final javax.swing.JButton botonBusquedaAdministrador = new javax.swing.JButton();
    public static final javax.swing.JButton botonSalirAdminBuscar = new javax.swing.JButton();
    public static final javax.swing.JButton buscarAdminBuscar = new javax.swing.JButton();
    private static final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JButton pagosAdminBuscar = new javax.swing.JButton();
    public static final javax.swing.JButton registrarUsuarioAdminBuscar = new javax.swing.JButton();
    public final javax.swing.JTable tablaBusquedaAdmin = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
