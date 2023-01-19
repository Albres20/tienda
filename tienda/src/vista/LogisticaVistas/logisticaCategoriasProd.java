package vista.LogisticaVistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author orlan
 */
public class logisticaCategoriasProd extends javax.swing.JFrame {

   FondoPanel FondoPanel=new FondoPanel();
    public logisticaCategoriasProd() {
        this.setLocationRelativeTo(null);
        this.setContentPane(FondoPanel);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/image/logoDiscord.png")).getImage());
        ImageIcon fondoboton=new ImageIcon(getClass().getResource("/image/exit.png"));
        Icon fondo1=new ImageIcon(fondoboton.getImage().getScaledInstance(66,56, Image.SCALE_AREA_AVERAGING));
        Icon fondo1press=new ImageIcon(fondoboton.getImage().getScaledInstance(60,50, Image.SCALE_AREA_AVERAGING));
        botonSalirLogisticaCategProd.setIcon(fondo1);
        botonSalirLogisticaCategProd.setPressedIcon(fondo1press);
        botonSalirLogisticaCategProd.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new userSilueta();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1318, 373));

        jPanel2.setBackground(new java.awt.Color(90, 250, 210, 120));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 55));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Descripción");

        textcodigo.setBackground(new java.awt.Color(196, 196, 196));
        textcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcodigoKeyTyped(evt);
            }
        });

        textNombre.setBackground(new java.awt.Color(196, 196, 196));
        textNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        textAreaDescripcion.setBackground(new java.awt.Color(196, 196, 196));
        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setRows(5);
        textAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Añadir Categoría");

        botonGuardarLogisiticaCategorias.setBackground(new java.awt.Color(0, 0, 0));
        botonGuardarLogisiticaCategorias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonGuardarLogisiticaCategorias.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarLogisiticaCategorias.setText("Guardar");
        botonGuardarLogisiticaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarLogisiticaCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 257, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardarLogisiticaCategorias)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardarLogisiticaCategorias)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(72, 104, 218));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(285, 486));

        registrarProvedLogCat.setBackground(new java.awt.Color(72, 104, 218));
        registrarProvedLogCat.setBackground(new java.awt.Color(72, 104, 218, 240));
        registrarProvedLogCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrarProvedLogCat.setForeground(new java.awt.Color(255, 255, 255));
        registrarProvedLogCat.setText("REGISTRAR PROVEEDOR");
        registrarProvedLogCat.setHideActionText(true);
        registrarProvedLogCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarProvedLogCat.setText("<html><p>REGISTRAR</p><p>PROVEEDOR</p></html>");
        registrarProvedLogCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProvedLogCatActionPerformed(evt);
            }
        });

        modElimProvLogisCat.setBackground(new java.awt.Color(72, 104, 218));
        modElimProvLogisCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modElimProvLogisCat.setForeground(new java.awt.Color(255, 255, 255));
        modElimProvLogisCat.setText("MODIFICAR/ELIMINAR PROVEEDOR");
        modElimProvLogisCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modElimProvLogisCat.setPreferredSize(new java.awt.Dimension(153, 23));
        modElimProvLogisCat.setText("<html><center><p>    MODIFICAR/</p><p>ELIMINAR PROVEEDOR</p></center></html>");
        modElimProvLogisCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modElimProvLogisCatActionPerformed(evt);
            }
        });

        registrarProductoLogisticaCat.setBackground(new java.awt.Color(72, 104, 218));
        registrarProductoLogisticaCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrarProductoLogisticaCat.setForeground(new java.awt.Color(255, 255, 255));
        registrarProductoLogisticaCat.setText("REGISTRAR PRODUCTO");
        registrarProductoLogisticaCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductoLogisticaCatActionPerformed(evt);
            }
        });

        modProdLogCat.setBackground(new java.awt.Color(72, 104, 218));
        modProdLogCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modProdLogCat.setForeground(new java.awt.Color(255, 255, 255));
        modProdLogCat.setText("MODIFICAR/ELIMINAR PRODUCTO");
        modProdLogCat.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        modProdLogCat.setText("<html><CENTER><p>MODIFICAR</p><p>ELIMINAR PRODUCTO</p></center></html>");

        jPanel6.setPreferredSize(new java.awt.Dimension(77, 71));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(Logisitica)");

        categoria.setBackground(new java.awt.Color(72, 104, 218));
        categoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setText("Añadir Categoría Productos");
        categoria.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        modProdLogCat.setText("<html><CENTER><p>MODIFICAR</p><p>ELIMINAR PRODUCTO</p></center></html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalirLogisticaCategProd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(modProdLogCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(registrarProductoLogisticaCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrarProvedLogCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modElimProvLogisCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(57, 57, 57)))
                .addComponent(registrarProvedLogCat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modElimProvLogisCat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(registrarProductoLogisticaCat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modProdLogCat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalirLogisticaCategProd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(410, 66));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DE COMPRAS! - STORE ");
        jLabel12.setMaximumSize(new java.awt.Dimension(369, 44));
        jLabel12.setMinimumSize(new java.awt.Dimension(369, 44));
        jLabel12.setPreferredSize(new java.awt.Dimension(369, 44));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        setBounds(0, 0, 1334, 804);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarProvedLogCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProvedLogCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarProvedLogCatActionPerformed

    private void registrarProductoLogisticaCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoLogisticaCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarProductoLogisticaCatActionPerformed

    private void botonGuardarLogisiticaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarLogisiticaCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarLogisiticaCategoriasActionPerformed

    private void modElimProvLogisCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modElimProvLogisCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modElimProvLogisCatActionPerformed

    private void textcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcodigoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo números");
        }
        if(textcodigo.getText().length()>=4){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El área de código debe ser de 4 dígitos.");
        }
    }//GEN-LAST:event_textcodigoKeyTyped

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        
        if(textNombre.getText().length()>=50){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El nombre no debe ser mayor a 50 caracteres.");
        }
    }//GEN-LAST:event_textNombreKeyTyped

    private void textAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescripcionKeyTyped
        if(textAreaDescripcion.getText().length()>=199){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"La descripción no debe ser mayor 199 caracteres.");
        }
    }//GEN-LAST:event_textAreaDescripcionKeyTyped

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
            java.util.logging.Logger.getLogger(logisticaCategoriasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logisticaCategoriasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logisticaCategoriasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logisticaCategoriasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logisticaCategoriasProd().setVisible(true);
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
    public static final javax.swing.JButton botonGuardarLogisiticaCategorias = new javax.swing.JButton();
    public static final javax.swing.JButton botonSalirLogisticaCategProd = new javax.swing.JButton();
    private static final javax.swing.JButton categoria = new javax.swing.JButton();
    private javax.swing.JButton jButton1;
    private static final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private static final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JButton modElimProvLogisCat = new javax.swing.JButton();
    public static final javax.swing.JButton modProdLogCat = new javax.swing.JButton();
    public static final javax.swing.JButton registrarProductoLogisticaCat = new javax.swing.JButton();
    public static final javax.swing.JButton registrarProvedLogCat = new javax.swing.JButton();
    public final javax.swing.JTextArea textAreaDescripcion = new javax.swing.JTextArea();
    public final javax.swing.JTextField textNombre = new javax.swing.JTextField();
    public final javax.swing.JTextField textcodigo = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
