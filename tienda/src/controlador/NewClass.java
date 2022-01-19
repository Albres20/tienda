/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.Image;
import java.awt.TextField;
import vista.Render;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import modelo.dao.CajeroVentasDAO;
import modelo.dao.LibroDAO;
import modelo.dao.administradorDAO;
import modelo.dao.administradorPagoDAO;
import modelo.dao.logisticaProductosDAO;
import modelo.dao.logisticaProveedorDAO;
import modelo.dao.loguinDAO;
import modelo.dto.CajeroVentasDTO;
import modelo.dto.LibroDTO;
import modelo.dto.administradorDTO;
import modelo.dto.administradorPagoDTO;
import modelo.dto.loginDTO;
import modelo.dto.logisticaProductosDTO;
import modelo.dto.logisticaProveedorDTO;
import vista.CajeroVistas.cajeroRegistrarCotizacion;
import vista.CajeroVistas.cajeroRegistrarVenta;
import vista.LogisticaVistas.logisticaModificarProv;
import vista.LogisticaVistas.logisticaRegistrarProd;
import vista.LogisticaVistas.logisticaRegistroProv;
import vista.administradorBuscar;
import vista.administradorModificar;
import vista.administradorRegistrar;
import vista.logueo;
import vista.CajeroVistas.usuarioCajero;
import vista.LogisticaVistas.logisticaModificarProd;
import vista.LogisticaVistas.logisticaRegistroProv;
import vista.administradorPagoModificar;
import vista.administradorPagoRegistrar;
import vista.administradorSubPagoModificar;
import vista.administradordetallesPagoModificar;


/**
 *
 * @author David
 */
public class NewClass implements ActionListener{
    
    static String obtener;
    private logueo view;
    private loguinDAO model; 
    private administradorDAO a;
    private administradorPagoDAO a1;
    private logisticaProveedorDAO lp;
    private logisticaProductosDAO lproductos;
    private  CajeroVentasDAO cajv;
    private administradorRegistrar adm;
    private administradorBuscar admB;
    private administradorModificar admM;
    private administradorPagoRegistrar admPR;
    private administradorPagoModificar admPM;
    private administradordetallesPagoModificar adPM;
    private administradorSubPagoModificar adSPM;
    private logisticaRegistroProv lrp;
    private logisticaModificarProv lmp;
    private logisticaRegistrarProd lrprod;
    private logisticaModificarProd lmproducto;
    private cajeroRegistrarCotizacion cajRegC;
    private cajeroRegistrarVenta cajRegV;
    private usuarioCajero cajU;
    int id;
    private int ruc;//variable de apoyo para interfaz logsitica
    private int codigo;//variable de apoyo para interfaz logsitica modificar prod y sirve como codigo para interfaz modificar pagos
    public FileInputStream input;
    
   usuarioCajero caj = new usuarioCajero();
   //usuarioCajero caj = new usuarioCajero();
    
    public NewClass(logueo view, administradorRegistrar adm, loguinDAO model, administradorDAO a , 
            administradorPagoDAO a1, logisticaProveedorDAO lp,  logisticaProductosDAO lproductos, CajeroVentasDAO cajv,
            administradorBuscar admB, administradorModificar admM, administradorPagoRegistrar admPR, 
            administradorPagoModificar admPM, administradordetallesPagoModificar adPM, administradorSubPagoModificar adSPM,  
            logisticaRegistroProv lrp, logisticaModificarProv lmp, logisticaRegistrarProd lrprod, 
            logisticaModificarProd lmproducto,cajeroRegistrarCotizacion cajRegC,cajeroRegistrarVenta cajRegV, usuarioCajero cajU){
        this.view=view;
        this.model=model;
        //dao
        this.a=a;
        this.a1=a1;
        this.lp=lp;
        this.lproductos=lproductos;
        this.cajv=cajv;
        this.adm=adm;
        this.admB=admB;
        this.admM=admM;
        this.admPR=admPR;
        this.admPM=admPM;
        this.adPM=adPM;
        this.adSPM=adSPM;
        this.lrp=lrp;
        this.lmp=lmp;
        this.lrprod=lrprod;
        this.lmproducto=lmproducto;
        this.cajRegC=cajRegC;
        this.cajRegV=cajRegV;
        this.cajU=cajU;
        //---Inicio---interfaz Logueo
        this.view.botonIniciarSesion.setActionCommand("Abrir Sesion");
        this.view.botonIniciarSesion.addActionListener(this);
        //----Fin----interfaz Logueo
       
        //---Inicio---AdministradorRegistrar
        this.adm.botonRegistrarAdmin.setActionCommand("botonRegistrarAdmin");//boton "registrar" registrar usuario
        this.adm.botonRegistrarAdmin.addActionListener(this);
        this.adm.botonBuscarAdmin.setActionCommand("botonBusqueda");//boton buscar/modificar 
        this.adm.botonBuscarAdmin.addActionListener(this);
        this.adm.pagosAdminReg.setActionCommand("pagosRegistrarAdmin");//boton pagos adminiregistrargeneral
        this.adm.pagosAdminReg.addActionListener(this);
        this.adm.registrarAdminRegistrar.setActionCommand("registrarAdminRegistrar");// boton registrar Admin Registrar General
        this.adm.registrarAdminRegistrar.addActionListener(this);
        this.adm.salirAdminRegistrar.setActionCommand("botonAdminRegistrar");
        this.adm.salirAdminRegistrar.addActionListener(this);//cierra sesión
        //----Fin----AdministradorRegistrar
        //---Inicio---interfaz AdministradorBuscar
        this.admB.registrarUsuarioAdminBuscar.setActionCommand("registrarUsuarioAdminBuscar");
        this.admB.registrarUsuarioAdminBuscar.addActionListener(this);
        this.admB.botonBusquedaAdministrador.setActionCommand("botonBusquedaAdministrador");//boton "buscar" buscar/modificar
        this.admB.botonBusquedaAdministrador.addActionListener(this);
        this.admB.pagosAdminBuscar.setActionCommand("pagosAdminBuscar");
        this.admB.pagosAdminBuscar.addActionListener(this); 
        this.admB.buscarAdminBuscar.setActionCommand("buscarAdminBuscar");
        this.admB.buscarAdminBuscar.addActionListener(this);
         //----Fin----interfaz AdministradorBuscar
        //interfaz AdministradorModificar
        this.admM.botonEliminarAdminMod.setActionCommand("botonEliminarAdminMod");
        this.admM.botonEliminarAdminMod.addActionListener(this);
        this.admM.botonGuardarAdminModif.setActionCommand("botonGuardarAdminModif");//boton "guardar" buscar/modificar  modificar especificamente 
        this.admM.botonGuardarAdminModif.addActionListener(this);
        this.admM.registrarAdminModificar.setActionCommand("registrarAdminModificar");//boton redirecciona a registrarAdmin
        this.admM.registrarAdminModificar.addActionListener(this);
        this.admM.modificarAdminModificar.setActionCommand("modificarAdminModificar");//boton redirecciona a registrarModificar la misma ventana
        this.admM.modificarAdminModificar.addActionListener(this);
        this.admM.botonSalirAdminModificar.setActionCommand("botonSalirAdminModificar");//boton redirecciona a login
        this.admM.botonSalirAdminModificar.addActionListener(this);
        //interfaz AdministradorPagoRegistro
        this.admPR.registrarAdminPR.setActionCommand("registrarAdminPR");
        this.admPR.registrarAdminPR.addActionListener(this);
        this.admPR.buscarAdminPR.setActionCommand("buscarAdminPR");
        this.admPR.buscarAdminPR.addActionListener(this); 
        this.admPR.pagosAdminPR .setActionCommand("pagosAdminPR");
        this.admPR.pagosAdminPR .addActionListener(this);
        this.admPR.subirImagenRegistroPago.setActionCommand("subirImagenRegistroPago");
        this.admPR.subirImagenRegistroPago.addActionListener(this);
        this.admPR.guardarRegistrarPagoAPG.setActionCommand("guardarRegistrarPagoAPG");
        this.admPR.guardarRegistrarPagoAPG.addActionListener(this);
        this.admPR.subRPAdminRegistro.setActionCommand("subRPAdminRegistro");
        this.admPR.subRPAdminRegistro.addActionListener(this);
        this.admPR.subBorrarRPAdminRegistro.setActionCommand("subBorrarRPAdminRegistro");
        this.admPR.subBorrarRPAdminRegistro.addActionListener(this);
        this.admPR.subMEAdminModificar.setActionCommand("subMEAdminModificar");
        this.admPR.subMEAdminModificar.addActionListener(this);
        this.admPR.botonSalirAdminPagoRegistrar.setActionCommand("botonSalirAdminPagoRegistrar");
        this.admPR.botonSalirAdminPagoRegistrar.addActionListener(this);
        //administrador pagoModificar 
        this.admPM.registrarAdminPagoModificar.setActionCommand("registrarAdminPagoModificar");
        this.admPM.registrarAdminPagoModificar.addActionListener(this);
        this.admPM.buscarAdminPagoModificar.setActionCommand("buscarAdminPagoModificar");
        this.admPM.buscarAdminPagoModificar.addActionListener(this);
        this.admPM.pagosAdminPagoModificar.setActionCommand("pagosAdminPagoModificar");
        this.admPM.pagosAdminPagoModificar.addActionListener(this);
        this.admPM.botonSalirAdminPagoModificar.setActionCommand("botonSalirAdminPagoModificar");
        this.admPM.botonSalirAdminPagoModificar.addActionListener(this);
        this.admPM.registroPagoadminPagoModificar.setActionCommand("registroPagoadminPagoModificar");
        this.admPM.registroPagoadminPagoModificar.addActionListener(this);
        this.admPM.modificarAdminPagoModificar.setActionCommand("modificarAdminPagoModificar");
        this.admPM.modificarAdminPagoModificar.addActionListener(this);
        //interfz administradorSubPagoModificar
        ;
        this.adSPM.registrarAdminSubPagoModificar.setActionCommand("registrarAdminSubPagoModificar");
        this.adSPM.registrarAdminSubPagoModificar.addActionListener(this);
        this.adSPM.guardarEditarPagoASubPago.setActionCommand("guardarEditarPagoASubPago");
        this.adSPM.guardarEditarPagoASubPago.addActionListener(this);
        this.adSPM.eliminarSubPagoModif.setActionCommand("eliminarSubPagoModif");
        this.adSPM.eliminarSubPagoModif.addActionListener(this);
        this.adSPM.atrasSubPagoModificar.setActionCommand("atrasSubPagoModificar");
        this.adSPM.atrasSubPagoModificar.addActionListener(this);
        this.adSPM.botonSalirAdminSubPagoModificar.setActionCommand("botonSalirAdminSubPagoModificar");
        this.adSPM.botonSalirAdminSubPagoModificar.addActionListener(this);
        //interfaz administradordetallesPagoModificar 
        this.adPM.botonSalirAdminDetallesPagoModif.setActionCommand("botonSalirAdminDetallesPagoModif");
        this.adPM.botonSalirAdminDetallesPagoModif.addActionListener(this);
        //interfaz logisiticaRegistroProved
        this.lrp.botonRegistrarLogisiticaProveedor.setActionCommand("botonRegistrarLogisiticaProveedor");
        this.lrp.botonRegistrarLogisiticaProveedor.addActionListener(this);
        this.lrp.modificarEliminarBuscarProveedor.setActionCommand("modificarEliminarBuscarProveedor");
        this.lrp.modificarEliminarBuscarProveedor.addActionListener(this);
        this.lrp.registrarProductoLogistica.setActionCommand("registrarProductoLogistica");
        this.lrp.registrarProductoLogistica.addActionListener(this);
        this.lrp.editarProductoLogistica.setActionCommand("editarProductoLogistica");
        this.lrp.editarProductoLogistica.addActionListener(this);
        this.lrp.botonSalirLogRegProv.setActionCommand("botonSalirLogRegProv");
        this.lrp.botonSalirLogRegProv.addActionListener(this);
        
        //interfaz modificar logisiticaProve
        this.lmp.btnBusquedaLogisitica.setActionCommand("btnBusquedaLogisitica");
        this.lmp.btnBusquedaLogisitica.addActionListener(this);
        this.lmp.botonEliminarModProv.setActionCommand("botonEliminarModProv");
        this.lmp.botonEliminarModProv.addActionListener(this);
        this.lmp.botonGuardarLogisiticaProveedor.setActionCommand("botonGuardarLogisiticaProveedor");
        this.lmp.botonGuardarLogisiticaProveedor.addActionListener(this);
        this.lmp.botonSalirLogModifProv.setActionCommand("botonSalirLogModifProv");
        this.lmp.botonSalirLogModifProv.addActionListener(this);
        this.lmp.registrarProductoLogModifProv.setActionCommand("registrarProductoLogModifProv");
        this.lmp.registrarProductoLogModifProv.addActionListener(this);
        this.lmp.modElimLogisticaModProv.setActionCommand("modElimLogisticaModProv");
        this.lmp.modElimLogisticaModProv.addActionListener(this);
        this.lmp.registrarProveedorLogisticaModifProv.setActionCommand("registrarProveedorLogisticaModifProv");
        this.lmp.registrarProveedorLogisticaModifProv.addActionListener(this);
        this.lmp.modElimProdLogModProv.setActionCommand("modElimProdLogModProv");
        this.lmp.modElimProdLogModProv.addActionListener(this);
        //interfaz logisiticaRegistrarProd 
        
        this.lrprod.botonRegistrarLogisiticaProductos.setActionCommand("botonRegistrarLogisiticaProductos");
        this.lrprod.botonRegistrarLogisiticaProductos.addActionListener(this);
        this.lrprod.botonSalirLogRegProd.setActionCommand("botonSalirLogRegProd");
        this.lrprod.botonSalirLogRegProd.addActionListener(this);
        this.lrprod.registrarProveedorLogRegProd.setActionCommand("registrarProveedorLogRegProd");
        this.lrprod.registrarProveedorLogRegProd.addActionListener(this);
        this.lrprod.modelimLogRegProd.setActionCommand("modelimLogRegProd");
        this.lrprod.modelimLogRegProd.addActionListener(this);
        this.lrprod.modElimProvLogRegProd.setActionCommand("modElimProvLogRegProd");
        this.lrprod.modElimProvLogRegProd.addActionListener(this);
        
        
        //interfaz logisiticaModificarProd        
        this.lmproducto.btnBusquedaLogisiticaProducto.setActionCommand("btnBusquedaLogisiticaProducto");
        this.lmproducto.btnBusquedaLogisiticaProducto.addActionListener(this);
        this.lmproducto.botonEliminarModProducto.setActionCommand("botonEliminarModProducto");
        this.lmproducto.botonEliminarModProducto.addActionListener(this);
        this.lmproducto.botonSalirLogisticaModifProd.setActionCommand("botonSalirLogisticaModifProd");
        this.lmproducto.botonSalirLogisticaModifProd.addActionListener(this);
        this.lmproducto.registrarProductoLogisticaModProd.setActionCommand("registrarProductoLogisticaModProd");
        this.lmproducto.registrarProductoLogisticaModProd.addActionListener(this);
        this.lmproducto.modElimProvLogisModProd.setActionCommand("modElimProvLogisModProd");
        this.lmproducto.modElimProvLogisModProd.addActionListener(this);
        this.lmproducto.registrarProvedLogModProd.setActionCommand("registrarProvedLogModProd");
        this.lmproducto.registrarProvedLogModProd.addActionListener(this);
        
        
        //añadiendo addMouseListener a tabla
        admPM.tablasbMEAdminModificar.addMouseListener(new escuchaTablaPago());
        //---Inicio--- Interfaces Cajero//
        /**Abrir intefaces**/
        this.cajU.botonabrirVenta.setActionCommand("botonabrirVenta");
        this.cajU.botonabrirVenta.addActionListener(this);
        this.cajU.botonabrirCotizacion.setActionCommand("botonabrirCotizacion");
        this.cajU.botonabrirCotizacion.addActionListener(this);
        this.cajRegV.botonVentaAbrirCot.setActionCommand("botonVentaAbrirCot");
        this.cajRegV.botonVentaAbrirCot.addActionListener(this);
        this.cajRegC.botonCotAbrirVenta.setActionCommand("botonCotAbrirVenta");
        this.cajRegC.botonCotAbrirVenta.addActionListener(this);
        /**Cerrar Sesion**/
        this.cajU.botonSalirusuarioCajero.setActionCommand("botonSalirusuarioCajero");
         this.cajU.botonSalirusuarioCajero.addActionListener(this);
        this.cajRegV.botonSalirCajeroVenta.setActionCommand("botonSalirCajeroVenta");
        this.cajRegV.botonSalirCajeroVenta.addActionListener(this);
        this.cajRegC.botonSalirCajeroCotizacion.setActionCommand("botonSalirCajeroCotizacion");
        this.cajRegC.botonSalirCajeroCotizacion.addActionListener(this);
        
        //Registrar Venta:
        this.cajRegV.botonBusqProdVentaCajero.setActionCommand("botonBusqProdVentaCajero");
        this.cajRegV.botonBusqProdVentaCajero.addActionListener(this);
        this.cajRegV.botonBoletaVenta.setActionCommand("botonBoletaVenta");
        this.cajRegV.botonBoletaVenta.addActionListener(this);
        //Cancelar Venta:
        this.cajRegV.btnCajeroCancelVenta.setActionCommand("btnCajeroCancelVenta");
        this.cajRegV.btnCajeroCancelVenta.addActionListener(this);
        //Registrar Cotizacion:
        this.cajRegC.botonBusqProdCotCajero.setActionCommand("botonBusqProdCotCajero");
        this.cajRegC.botonBusqProdCotCajero.addActionListener(this);
        this.cajRegC.btnCajeroBoletaCot.setActionCommand("btnCajeroBoletaCot");
        this.cajRegC.btnCajeroBoletaCot.addActionListener(this);
        //Cancelar Cotizacion:
        this.cajRegC.btnCajeroCancelarCot.setActionCommand("btnCajeroCancelarCot");
        this.cajRegC.btnCajeroCancelarCot.addActionListener(this);
        //---Fin--- Interfaces Cajero//
    }
    public void iniciar(){
         this.view.setVisible(true);
       
    }
    public static void setObtener(String obtener) {
        NewClass.obtener = obtener;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();
        //---Inicio---interfaz Logueo
        if(comando.equals("Abrir Sesion")){ 
            if(view.user.getText().isEmpty()||view.password.getText().isEmpty()){  
                UIManager UI=new UIManager();
                UI.put("OptionPane.background",new ColorUIResource(251, 247, 247));
                UI.put("Panel.background",new ColorUIResource(251, 247, 247));
                UI.put("OptionPane.messageForeground", new ColorUIResource(0, 0, 0 ));
                JOptionPane.showMessageDialog(null,"<html><h2>Existe por lo menos<br> un campo vacío</h2></html>","Atención",  WARNING_MESSAGE);
            }
            else{
                   loguinDAO login=new loguinDAO();
                   loginDTO l=login.read(view.user.getText(), view.password.getText());
             
                if (l!=null) { //validar
                        if(l.getRoles_idrol() == 1){
                            System.out.println("rol 1");
                            adm.setVisible(true);
                            view.dispose();
                        }
                        if(l.getRoles_idrol() == 2){
                            lrp.setVisible(true);
                            System.out.println("rol 2");
                            view.dispose();
                        }
                        if(l.getRoles_idrol() == 3){                   
                            cajU.setVisible(true);
                            System.out.println("rol 3");
                            view.dispose();
                        } 
                } 
                else{
                    UIManager UI=new UIManager();
                    UI.put("OptionPane.background",new ColorUIResource(255, 87, 51 ));
                    UI.put("Panel.background",new ColorUIResource(255, 87, 51 ));
                    UI.put("OptionPane.messageForeground", new ColorUIResource(255, 255, 255 ));
                    JOptionPane.showMessageDialog(null,"<html><h2>Correo o contraseña incorrecta</h2></html>","Atención",  ERROR_MESSAGE);} 
         } 
        }
        //----Fin----interfaz Logueo
        
       
        
        //---Inicio---AdministradorRegistrar
        
        if(comando.equals("registrarAdminRegistrar")){
            adm.textNombre.setText("");
            adm.textApellido.setText("");
            adm.textContraseña.setText("");
            adm.textDNI.setText("");
            adm.textCorreo.setText("");
            adm.textDireccion.setText("");
            adm.textTelefono.setText("");
            
        }
        if(comando.equals("botonRegistrarAdmin")){
		
            int flag = 0;
            if(!adm.textNombre.getText().isEmpty()){
                if(!adm.textApellido.getText().isEmpty()){
                    if(!adm.textDNI.getText().isEmpty()){
                        if(adm.barraRol.getSelectedItem()== "Admin"||adm.barraRol.getSelectedItem()== "Logistica"||adm.barraRol.getSelectedItem()== "Cajero"){
                            if (!adm.textCorreo.getText().isEmpty()) {
                                if(!adm.textContraseña.getText().isEmpty()){
                                    if(!adm.textDireccion.getText().isEmpty()){
                                        if(!adm.textTelefono.getText().isEmpty()){
                                            flag=1;
                                            JOptionPane.showMessageDialog(null,"Los datos fueron guardados con éxito");
                                    }else{
                                            JOptionPane.showMessageDialog(null,"Por favor ingrese su telefono");
                                            } 
                                    }else{
                                            JOptionPane.showMessageDialog(null,"Por favor ingrese su dirección");
                                            } 
                                    }else{
                                            JOptionPane.showMessageDialog(null,"Por favor ingrese su contraseña");
                                            }
                                }else{
                                     JOptionPane.showMessageDialog(null,"Por favor ingrese su correo");
                                }
                                      
                               }else{
                                      JOptionPane.showMessageDialog(null,"Por favor ingrese su rol");
                                  } 
                
                           }else{
                               JOptionPane.showMessageDialog(null,"Por favor ingrese su dni");
                           } 
                
                    }else{
                        JOptionPane.showMessageDialog(null,"Por favor ingrese sus apellidos");
                    } 
                
            }else{
                JOptionPane.showMessageDialog(null,"Por favor ingrese su(s) nombre(s)");
            } 
            
            int rol=3;
            
            if(adm.barraRol.getSelectedItem()=="Admin"){
                rol=1;
            }
            if(adm.barraRol.getSelectedItem()=="Logistica"){
                rol=2;
            }
            if(adm.barraRol.getSelectedItem()=="Cajero"){
                rol=3;
            }
            
            if (flag == 1) {
                 a.create(new administradorDTO(adm.textNombre.getText(), adm.textApellido.getText(), 
                Integer.valueOf(adm.textDNI.getText()), rol, adm.textCorreo.getText(), 
                adm.textContraseña.getText(), adm.textDireccion.getText(),
                Integer.valueOf(adm.textTelefono.getText())));
                System.out.println("rol 1");

                //setear nulo 
                adm.textNombre.setText("");
                adm.textApellido.setText("");
                adm.textContraseña.setText("");
                adm.textDNI.setText("");
                adm.textCorreo.setText("");
                adm.textDireccion.setText("");
                adm.textTelefono.setText("");
            }
	  
	
           
        }
        
        if(comando.equals("botonBusqueda")){
            List<administradorDTO> customerList = null;
            admB.setVisible(true);
            adm.dispose();
            customerList=a.readAll();
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("ROL");
            modelo.addColumn("ACCIONES");
            admB.tablaBusquedaAdmin.setModel(modelo);
            for (administradorDTO customer : customerList){
             
            Object[] datos= new Object[6];  
            JButton b1= new JButton();
            datos[0]=customer.getId();
            datos[1]=customer.getDNI();
            datos[2]=customer.getNombre();
            datos[3]=customer.getApellido();
            datos[4]=customer.getRoles_idrol();
            datos[5]=b1;
            modelo.addRow(datos);
            }
            admB.tablaBusquedaAdmin.addMouseListener(new EscuchaMouse());
        }
        
        if(comando.equals("buscarAdminBuscar")){
            List<administradorDTO> customerList = null;
            admB.setVisible(true);
            adm.dispose();
            customerList=a.readAll();
            admB.tablaBusquedaAdmin.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel modelo=new DefaultTableModel();
               modelo.addColumn("N°");
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("ROL");
            modelo.addColumn("ACCIONES");
            admB.tablaBusquedaAdmin.setModel(modelo);
            Object[] datos= new Object[6];  
            JButton b1= new JButton();
            for (administradorDTO customer : customerList){
             
                
                datos[0]=customer.getId();
                datos[1]=customer.getDNI();
                datos[2]=customer.getNombre();
                datos[3]=customer.getApellido();
                datos[4]=customer.getRoles_idrol();
                datos[5]=b1;
                modelo.addRow(datos);
                
            }
            admB.barraBusquedaAdmin.setText("");
            admB.tablaBusquedaAdmin.addMouseListener(new EscuchaMouse());
            
            
        }        
        if(comando.equals("pagosRegistrarAdmin")){
            adm.dispose();
            admPR.setVisible(true);
           
            
        }
        if(comando.equals("botonAdminRegistrar")){//Cerrar Sesión
            adm.dispose();
            view.setVisible(true);
            view.user.setText("");
            view.password.setText("");
           
            
        }
        //interfaz administradorModificar
        if(comando.equals("botonEliminarAdminMod")){
            a.delete(Integer.valueOf(admB.barraBusquedaAdmin.getText()));
            admM.dispose();
            admB.dispose();
            admB.setVisible(true);
            
        }
        if(comando.equals("registrarAdminModificar")){ //redirecciona de modifcar admin a registrar admin 
            admM.dispose();
            adm.setVisible(true);
            
        }
        if(comando.equals("modificarAdminModificar")){ //redirecciona de modifcar admin a registrar admin 
            admM.dispose();
            admB.setVisible(true);
           
            
        }
        if(comando.equals("botonSalirAdminModificar")){ //redirecciona de modifcar admin a registrar admin 
            admM.dispose();
            view.setVisible(true);  
            view.user.setText("");
            view.password.setText("");
        }
        //////////////////////
        //interfaz AdministradorBuscar
        if(comando.equals("registrarUsuarioAdminBuscar")){
            admB.dispose();
            adm.setVisible(true);
        }
        if(comando.equals("botonBusquedaAdministrador")){
            administradorDTO admDTO=a.read(Integer.valueOf(admB.barraBusquedaAdmin.getText()));
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("ROL");
            modelo.addColumn("ACCIONES");
            admB.tablaBusquedaAdmin.setModel(modelo);
            Object[] datos= new Object[6];  
            JButton b1= new JButton();
            datos[0]=admDTO.getId();
            datos[1]=admDTO.getDNI();
            datos[2]=admDTO.getNombre();
            datos[3]=admDTO.getApellido();
            datos[4]=admDTO.getRoles_idrol();
            datos[5]=b1;
            modelo.addRow(datos);
            admB.tablaBusquedaAdmin.addMouseListener(new EscuchaMouse());
        
            //System.out.println("vista"+String.valueOf(view.user)+","+"controaldor"+String.valueOf(view.password));
        }
        
        if(comando.equals("botonGuardarAdminModif")){
            
            a.update(new administradorDTO(admM.campoNombreAdminMod.getText(), admM.campoApellidoAdminMod.getText(),
                    Integer.valueOf(admM.campodniAdminMod.getText()), Integer.valueOf(admM.campoRolAdminMod.getText()), admM.campoCorreoAdminMod.getText(), 
                    admM.campoContrasenaAdminMod.getText(), admM.campoDireccionAdminMod.getText(), Integer.valueOf(admM.campoTelefonoAdminMod.getText())), id);
            System.out.println("-->"+admM.campoNombreAdminMod.getText()+admM.campoApellidoAdminMod.getText()+
                    Integer.valueOf(admM.campodniAdminMod.getText())+Integer.valueOf(admM.campoRolAdminMod.getText())+
                    admM.campoCorreoAdminMod.getText()+admM.campoContrasenaAdminMod.getText()+admM.campoDireccionAdminMod.getText()+Integer.valueOf(admM.campoTelefonoAdminMod.getText())+"\nid:"+id);
            //setear vacio 
            admM.dispose();
            admB.setVisible(true);
            
        }
        if(comando.equals("pagosAdminBuscar")){
            admB.dispose();
            admPR.setVisible(true);

        }
        /*Administrador Pago registro */
        if(comando.equals("registrarAdminPR")){
            admPR.dispose();
            adm.setVisible(true);

        }
        if(comando.equals("buscarAdminPR")){
            admPR.dispose();
            admB.setVisible(true);

        }
        if(comando.equals("pagosAdminPR")){
           /* 
            a1.update(new administradorPagoDTO(adSPM.tituloPago.getText(), Float.valueOf(adSPM.montoPago.getText()), adSPM.entidadPago.getText(), adSPM.descripcionPago.getText(), adSPM.fechaPago.getText()), codigo);
            //hay q setear 
            admPR.dispose();
            adPM.setVisible(true);*/
            
        }
        if(comando.equals("botonSalirAdminPagoRegistrar")){
            admPR.dispose();
            view.setVisible(true);
            view.user.setText("");
            view.password.setText("");

        }
        
        if(comando.equals("subirImagenRegistroPago")){
            String rutaArchivo = "";
            JFileChooser j = new JFileChooser();
            FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");//esto es para realizar el filtro
            j.setFileFilter(fi);//establecer filtro 
            int se = j.showOpenDialog(admPR);
            if (se == 0) {
                admPR.subirImagenRegistroPago.setText("" + j.getSelectedFile().getName());
                rutaArchivo = j.getSelectedFile().getAbsolutePath();
            }
                try {
                     input = new FileInputStream(new File(rutaArchivo));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }

        }  
        if(comando.equals("guardarRegistrarPagoAPG")){
             a1.create(new administradorPagoDTO(admPR.tituloPago.getText(), Float.valueOf(admPR.montoPago.getText()), admPR.entidadPago.getText(), admPR.descripcionPago.getText(), admPR.fechaPago.getText(), input)); 
             //Blanqueando
             admPR.tituloPago.setText("");
             admPR.montoPago.setText("");
             admPR.entidadPago.setText("");
             admPR.descripcionPago.setText("");
             admPR.fechaPago.setText("");
             input=null;
             admPR.subirImagenRegistroPago.setText("Inserta PDF");
        }
        /*interfaz administradorPagoModifcar*/
        
        if(comando.equals("registrarAdminPagoModificar")){
             admPM.dispose();
             adm.setVisible(true);
        }
        if(comando.equals("buscarAdminPagoModificar")){
             admPM.dispose();
             admB.setVisible(true);
        }
        if(comando.equals("pagosAdminPagoModificar")){
             admPM.dispose();
             admPR.setVisible(true);
        }
        if(comando.equals("botonSalirAdminPagoModificar")){
             admPM.dispose();
             view.setVisible(true);
             view.user.setText("");
             view.password.setText("");
        }
        if(comando.equals("registroPagoadminPagoModificar")){
             admPM.dispose();
             admPR.setVisible(true);
        }
        if(comando.equals("modificarAdminPagoModificar")){
             admPM.dispose();
             admPM.setVisible(true);
        }
        /*administradorSubPagoModificar*/
        
        if(comando.equals("registrarAdminSubPagoModificar")){
             admPM.dispose();
             adm.setVisible(true);
        }
        if(comando.equals("guardarEditarPagoASubPago")){
            a1.update(new administradorPagoDTO(adSPM.tituloPago.getText(), Float.valueOf(adSPM.montoPago.getText()), adSPM.entidadPago.getText(), adSPM.descripcionPago.getText(), adSPM.fechaPago.getText()), codigo);
            //hay q setear 
            adSPM.dispose();
            admPM.setVisible(true);
            List<administradorPagoDTO> customerList = null;
            admPM.setVisible(true);
            admPR.dispose();
            customerList=a1.readAll();
            //admPM.tablasbMEAdminModificar.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("TITULO");
            modelo.addColumn("MONTO");
            modelo.addColumn("ENTIDAD");
            modelo.addColumn("FECHA");
            modelo.addColumn("DESCARGAR PDF");
            admPM.tablasbMEAdminModificar.setModel(modelo);
            JButton b2= new JButton();
            //Diseño a boton
            //estiloBoton("image/descargalo.png", b2);
            estiloBoton("/image/descargalo.png", b2);
            for (administradorPagoDTO customer : customerList){
             
                Object[] datos= new Object[6];  
                datos[0]=customer.getId();
                datos[1]=customer.getTitulo();
                datos[2]=customer.getMonto();
                datos[3]=customer.getEntidad();
                datos[4]=customer.getFechaPAgo();
                datos[5]=b2;
                modelo.addRow(datos);
                
            }
            /*admB.barraBusquedaAdmin.setText("");*/
            //admPM.tablasbMEAdminModificar.addMouseListener(new escuchaTablaPago());
             
        }
        
        if(comando.equals("eliminarSubPagoModif")){
           a1.delete(codigo);
           adSPM.dispose();
            admPM.setVisible(true);
            List<administradorPagoDTO> customerList = null;
            admPM.setVisible(true);
            admPR.dispose();
            customerList=a1.readAll();
            //admPM.tablasbMEAdminModificar.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("TITULO");
            modelo.addColumn("MONTO");
            modelo.addColumn("ENTIDAD");
            modelo.addColumn("FECHA");
            modelo.addColumn("DESCARGAR PDF");
            admPM.tablasbMEAdminModificar.setModel(modelo);
            for (administradorPagoDTO customer : customerList){
             
                Object[] datos= new Object[6];  
                JButton b2= new JButton();
                estiloBoton("/image/descargalo.png", b2);
                datos[0]=customer.getId();
                datos[1]=customer.getTitulo();
                datos[2]=customer.getMonto();
                datos[3]=customer.getEntidad();
                datos[4]=customer.getFechaPAgo();
                datos[5]=b2;
                modelo.addRow(datos);
                
            }
            /*admB.barraBusquedaAdmin.setText("");*/
            //admPM.tablasbMEAdminModificar.addMouseListener(new escuchaTablaPago());
        }
         if(comando.equals("atrasSubPagoModificar")){
             adSPM.dispose();
             admPM.setVisible(true);
        }
        if(comando.equals("botonSalirAdminSubPagoModificar")){
             adSPM.dispose();
             view.setVisible(true);
             view.user.setText("");
             view.password.setText("");
        }
        /* interfaz adminsitrador pago registro */
                    
        if(comando.equals("subRPAdminRegistro")){
             admPR.tituloPago.setText("");
             admPR.montoPago.setText("");
             admPR.entidadPago.setText("");
             admPR.descripcionPago.setText("");
             admPR.fechaPago.setText("");
             admPR.subirImagenRegistroPago.setText("Insertar PDF");
        }
        
        if(comando.equals("subBorrarRPAdminRegistro")){
             admPR.tituloPago.setText("");
             admPR.montoPago.setText("");
             admPR.entidadPago.setText("");
             admPR.descripcionPago.setText("");
             admPR.fechaPago.setText("");
             admPR.subirImagenRegistroPago.setText("Insertar PDF");
        }
        if(comando.equals("subMEAdminModificar")){
            /*admPR.dispose();
            admPM.setVisible(true);
            List<administradorPagoDTO> customerList = null;
            customerList=a1.readAll();
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("TITULO");
            modelo.addColumn("MONTO");
            modelo.addColumn("ENTIDAD");
            modelo.addColumn("FECHA");
            modelo.addColumn("DESCARGAR PDF");
            admPM.tablasbMEAdminModificar.setModel(modelo);
            for (administradorPagoDTO customer : customerList){
             
                Object[] datos= new Object[6];  
                JButton b2= new JButton("+");
                datos[0]=customer.getId();
                datos[1]=customer.getTitulo();
                datos[2]=customer.getMonto();
                datos[3]=customer.getEntidad();
                datos[4]=customer.getFechaPAgo();
                datos[5]=b2;
                modelo.addRow(datos);
                
            }
            
            admPM.tablasbMEAdminModificar.addMouseListener(new EscuchaMouse());*/
            List<administradorPagoDTO> customerList = null;
            admPM.setVisible(true);
            admPR.dispose();
            customerList=a1.readAll();
            //admPM.tablasbMEAdminModificar.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel modelo=new DefaultTableModel();
               modelo.addColumn("N°");
            modelo.addColumn("TITULO");
            modelo.addColumn("MONTO");
            modelo.addColumn("ENTIDAD");
            modelo.addColumn("FECHA");
            modelo.addColumn("DESCARGAR PDF");
            admPM.tablasbMEAdminModificar.setModel(modelo);
            JButton b2= new JButton();
            estiloBoton("/image/descargalo.png", b2);
                
            for (administradorPagoDTO customer : customerList){
             
                Object[] datos= new Object[6];  
                
                datos[0]=customer.getId();
                datos[1]=customer.getTitulo();
                datos[2]=customer.getMonto();
                datos[3]=customer.getEntidad();
                datos[4]=customer.getFechaPAgo();
                datos[5]=b2;
                modelo.addRow(datos);
                
            }
            /*admB.barraBusquedaAdmin.setText("");*/
            //admPM.tablasbMEAdminModificar.addMouseListener(new escuchaTablaPago());
        }
        //interfaz administardetallesPagoModificar
        if(comando.equals("botonSalirAdminDetallesPagoModif")){
            adPM.dispose();
            view.setVisible(true);
            view.user.setText("");
            view.password.setText("");
             
        }
        //logisiticaregitrarProveedor
        if(comando.equals("botonRegistrarLogisiticaProveedor")){
            lp.create(new logisticaProveedorDTO(lrp.textRazonSocial.getText(), lrp.textRepresentante.getText(), Integer.valueOf(lrp.textTelefono.getText()),  lrp.textDistrito.getText(), Integer.valueOf(lrp.textRUC.getText()), String.valueOf(lrp.comboBoxEstadoCivil.getSelectedItem()),  lrp.textEmail.getText(), lrp.textDireccion.getText(), lrp.textAreaDescripcion.getText()));
             
        }
        if(comando.equals("modificarEliminarBuscarProveedor")){
            lrp.dispose();
            lmp.setVisible(true);
             
        }
        if(comando.equals("editarProductoLogistica")){
            lrp.dispose();
            lmproducto.setVisible(true);
            List<logisticaProveedorDTO> customerList = null;
            
            customerList=lp.readAll();
            /*DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("ROL");
            modelo.addColumn("ACCIONES");
            admB.tablaBusquedaAdmin.setModel(modelo);*/
            for (logisticaProveedorDTO customer : customerList){
                String rucProveedor;
                //se cargan de la base de datos los ruc de los proveedores en el combox
                rucProveedor=customer.getRazonSocial();
                lmproducto.comboBoxProveedor.addItem(rucProveedor);
            }
             
        }
        if(comando.equals("botonSalirLogRegProv")){
            lrp.dispose();
            view.setVisible(true);
            view.user.setText("");
            view.password.setText("");
             
        }
        
        //logisiticaModirifacarProv
        
        if(comando.equals("btnBusquedaLogisitica")){
            this.ruc=Integer.valueOf(lmp.textBusquedaRuc.getText());
            logisticaProveedorDTO admDTO=lp.read(ruc);
            lmp.textRazonSocial.setText(admDTO.getRazonSocial());
            lmp.textRepresentante.setText(admDTO.getRepresentante());
            lmp.textTelefono.setText(String.valueOf(admDTO.getTelefono()));
            lmp.textDistrito.setText(admDTO.getDistrito());
            lmp.textRUC.setText(String.valueOf(admDTO.getRuc()));
            lmp.comboBoxEstadoCivil.setSelectedItem(admDTO.getEstado());
            lmp.textEmail.setText(admDTO.getEmail());
            lmp.textDireccion.setText(admDTO.getDireccion());
            lmp.textAreaDescripcion.setText(admDTO.getDetalles());
             
        }
        if(comando.equals("botonEliminarModProv")){
            lp.delete(ruc);
            lmp.comboBoxEstadoCivil.setSelectedItem("Ninguno");
            lmp.textAreaDescripcion.setText("");
            lmp.textBusquedaRuc.setText("");
            lmp.textDireccion.setText("");
            lmp.textDistrito.setText("");
            lmp.textEmail.setText("");
            lmp.textRUC.setText("");
            lmp.textRazonSocial.setText("");
            lmp.textRepresentante.setText("");
            lmp.textTelefono.setText("");
            
             
        }
        if(comando.equals("botonGuardarLogisiticaProveedor")){
            lp.update(new logisticaProveedorDTO(lmp.textRazonSocial.getText(), lmp.textRepresentante.getText(), Integer.valueOf(lmp.textTelefono.getText()), lmp.textDistrito.getText(), Integer.valueOf(lmp.textRUC.getText()), String.valueOf(lmp.comboBoxEstadoCivil.getSelectedItem()), lmp.textEmail.getText(), lmp.textDireccion.getText(), lmp.textAreaDescripcion.getText()), ruc);
            lmp.comboBoxEstadoCivil.setSelectedItem("Ninguno");
            lmp.textAreaDescripcion.setText("");
            lmp.textBusquedaRuc.setText("");
            lmp.textDireccion.setText("");
            lmp.textDistrito.setText("");
            lmp.textEmail.setText("");
            lmp.textRUC.setText("");
            lmp.textRazonSocial.setText("");
            lmp.textRepresentante.setText("");
            lmp.textTelefono.setText("");
            
             
        }
        if(comando.equals("botonSalirLogModifProv")){
            
            lmp.dispose();
            view.setVisible(true);
            view.user.setText("");
            view.password.setText("");
             
        }
        if(comando.equals("registrarProductoLogModifProv")){
            
            lmp.dispose();
            lrp.setVisible(true);
        }
        if(comando.equals("modElimLogisticaModProv")){
            
            lmp.textAreaDescripcion.setText("");
            lmp.textBusquedaRuc.setText("");
            lmp.textDireccion.setText("");
            lmp.textDistrito.setText("");
            lmp.textEmail.setText("");
            lmp.textRUC.setText("");
            lmp.textRazonSocial.setText("");
            lmp.textRepresentante.setText("");
            lmp.textTelefono.setText("");
            lmp.comboBoxEstadoCivil.setSelectedItem("Ninguno");
        }
        if(comando.equals("registrarProveedorLogisticaModifProv")){
            
            lmp.dispose();
            lrp.setVisible(true);
        }
        if(comando.equals("modElimProdLogModProv")){
            
            lmp.dispose();
            lmproducto.setVisible(true);
            
        }
        
        if(comando.equals("registrarProductoLogistica")){
            lrp.dispose();
            lrprod.setVisible(true);
            List<logisticaProveedorDTO> customerList = null;
            
            customerList=lp.readAll();
            /*DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("ROL");
            modelo.addColumn("ACCIONES");
            admB.tablaBusquedaAdmin.setModel(modelo);*/
            for (logisticaProveedorDTO customer : customerList){
                String rucProveedor;
                //se cargan de la base de datos los ruc de los proveedores en el combox
                rucProveedor=customer.getRazonSocial();
                    lrprod.comboBoxProveedor.addItem(rucProveedor);
            }
             
        }
        if(comando.equals("botonSalirLogRegProd")){
            lrp.dispose();
            view.setVisible(true);
            view.user.setText("");
            view.password.setText("");
        }
         if(comando.equals("modelimLogRegProd")){
            lrp.dispose();
            lmp.setVisible(true);
        }
        
        //logisiticaRegistrarProducto
        if(comando.equals("registrarProveedorLogRegProd")){
            lrp.setVisible(true);
            lrprod.dispose();
            /*lrp.textAreaDescripcion.setText("");
            lrp.textDireccion.setText("");
            lrp.textDistrito.setText("");
            lrp.textEmail.setText("");
            lrp.textRUC.setText("");
            lrp.textRazonSocial.setText("");
            lrp.textRepresentante.setText("");
            lrp.textTelefono.setText("");
            lrp.textAreaDescripcion.setText("");
            lrp.comboBoxEstadoCivil.setSelectedItem("Ninguno");*/
            
        }
        if(comando.equals("modElimProvLogRegProd")){
            lrprod.dispose();
            lmp.setVisible(true);
  
        }
        if(comando.equals("botonRegistrarLogisiticaProductos")){

             lproductos.create(new logisticaProductosDTO(lrprod.textcodigo.getText(), lrprod.textNombre.getText(), Integer.valueOf(lrprod.textPrecio.getText()), lrprod.textAreaDescripcion.getText(), lrprod.textFechaVencimiento.getText(), String.valueOf(lrprod.comboBoxProveedor.getSelectedItem()), lrprod.textMarca.getText(), lrprod.textCateogria.getText(), Integer.valueOf(lrprod.textCantidad.getText())));

         }
        
        //logisticaModificarProdcuto
        if(comando.equals("btnBusquedaLogisiticaProducto")){
            codigo=Integer.valueOf(lmproducto.textBusquedaRucProducto.getText());
            logisticaProductosDTO lproductoDTO= lproductos.read(codigo);
            lmproducto.textcodigo.setText(lproductoDTO.getCodigo());
            lmproducto.textRepresentante.setText(lproductoDTO.getNombre());
            lmproducto.textPrecio.setText(String.valueOf(lproductoDTO.getPrecio()));
            lmproducto.textCantidad.setText(String.valueOf(lproductoDTO.getStock()));
            lmproducto.textVencimiento.setText(lproductoDTO.getFecha());
            lmproducto.comboBoxProveedor.setSelectedItem(lproductoDTO.getProveedor());
            lmproducto.textAreaDescripcion.setText(lproductoDTO.getDescripcion()); 
            lmproducto.textMarca.setText(lproductoDTO.getMarca());
            lmproducto.textCategoria.setText(lproductoDTO.getCategoria());
            
             
        }
        if(comando.equals("botonEliminarModProducto")){
            
            lproductos.delete(codigo);
            lmproducto.textcodigo.setText("");
            lmproducto.textRepresentante.setText("");
            lmproducto.textPrecio.setText("");
            lmproducto.textCantidad.setText("");
            lmproducto.textVencimiento.setText("");
            lmproducto.comboBoxProveedor.setSelectedItem("Ninguno");
            lmproducto.textAreaDescripcion.setText(""); 
            lmproducto.textMarca.setText("");
            lmproducto.textCategoria.setText("");
            
             
        }
        if(comando.equals("botonSalirLogisticaModifProd")){
                lmproducto.dispose();
                view.setVisible(true);
                view.user.setText("");
                view.password.setText("");
        }
        if(comando.equals("registrarProductoLogisticaModProd")){
                lmproducto.dispose();
                lrprod.setVisible(true);
        }
                
        if(comando.equals("modElimProvLogisModProd")){
                lmproducto.dispose();
                lmp.setVisible(true);
                
        }
        if(comando.equals("registrarProvedLogModProd")){
                lmproducto.dispose();
                lrp.setVisible(true);
                
        }
        
        //---Inicio--- Cajero Venta//     
            /** Abrir ventanas cotizacion y venta***/
            if(comando.equals("botonabrirVenta")){
                cajU.dispose();
                cajRegV.setVisible(true);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 cajRegV.labelFechaActualVenta.setText(dtf.format(LocalDateTime.now()));
                 DefaultTableModel modelo=(DefaultTableModel)cajRegV.tablaCajeroVenta.getModel(); 
                int a =modelo.getRowCount()-1;
                System.out.println(a);
                for(int i=a; i>=0; i--){
                System.out.println(i);
                modelo.removeRow(i);
                }
                List lista= cajv.readAll();
                cajRegV.labelNBoletaVenta.setText(Integer.toString(100+lista.size()));
                cajRegV.tablaCajeroVenta.setModel(modelo);
                cajRegV.textBusquedaProdVentaCajero.setText("");
                cajRegV.labelMontoTotalVenta.setText("");
            }
            if(comando.equals("botonabrirCotizacion")){
                cajU.dispose();
                cajRegC.setVisible(true);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                cajRegC.labelFechaActualCotizacion.setText(dtf.format(LocalDateTime.now()));
                DefaultTableModel modelo=(DefaultTableModel) cajRegC.tablaCajeroCotizacion.getModel(); 
                int a =modelo.getRowCount()-1;
                System.out.println(a);
                for(int i=a; i>=0; i--){
                System.out.println(i);
                modelo.removeRow(i);
                }
                List lista= cajv.readAll();
                cajRegC.labelNBoletaCot.setText(Integer.toString(100+lista.size()));
                cajRegC.tablaCajeroCotizacion.setModel(modelo);
                cajRegC.textBusquedaCotizacionCajero.setText("");
                cajRegC.labelMontoTotalCotizacion.setText("");
                
            }
            if(comando.equals("botonVentaAbrirCot")){
                cajRegV.dispose();
                cajRegC.setVisible(true);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                cajRegC.labelFechaActualCotizacion.setText(dtf.format(LocalDateTime.now()));
                DefaultTableModel modelo=(DefaultTableModel) cajRegC.tablaCajeroCotizacion.getModel(); 
                int a =modelo.getRowCount()-1;
                System.out.println(a);
                for(int i=a; i>=0; i--){
                System.out.println(i);
                modelo.removeRow(i);
                }
                List lista= cajv.readAll();
                cajRegC.labelNBoletaCot.setText(Integer.toString(100+lista.size()));
                cajRegC.tablaCajeroCotizacion.setModel(modelo);
                cajRegC.textBusquedaCotizacionCajero.setText("");
                cajRegC.labelMontoTotalCotizacion.setText("");
            }
            if(comando.equals("botonCotAbrirVenta")){
                
                cajRegC.dispose();
                cajRegV.setVisible(true);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                 cajRegV.labelFechaActualVenta.setText(dtf.format(LocalDateTime.now()));
                 DefaultTableModel modelo=(DefaultTableModel)cajRegV.tablaCajeroVenta.getModel(); 
                int a =modelo.getRowCount()-1;
                System.out.println(a);
                for(int i=a; i>=0; i--){
                System.out.println(i);
                modelo.removeRow(i);
                }
                List lista= cajv.readAll();
                cajRegV.labelNBoletaVenta.setText(Integer.toString(100+lista.size()));
                cajRegV.tablaCajeroVenta.setModel(modelo);
                cajRegV.textBusquedaProdVentaCajero.setText("");
                cajRegV.labelMontoTotalVenta.setText("");
                
            }
            /****/
            /**Cerrar Sesión**/
            if(comando.equals("botonSalirusuarioCajero")){
                cajU.dispose();
                view.setVisible(true);
                view.user.setText("");
                view.password.setText("");
            }
            if(comando.equals("botonSalirCajeroVenta")){
                cajRegV.dispose();
                view.setVisible(true);
                view.user.setText("");
            view.password.setText("");
            }
            if(comando.equals("botonSalirCajeroCotizacion")){
                cajRegC.dispose();
                view.setVisible(true);
                view.user.setText("");
            view.password.setText("");
            }
            /**/
        
            /**Cancelar  Venta y Cotizacion**/
            if(comando.equals("btnCajeroCancelVenta")){
               int result = JOptionPane.showConfirmDialog(cajRegV, "Desea Cancelar la venta", "Mensaje", JOptionPane.YES_NO_OPTION);
               if(result==0){
                   DefaultTableModel modelo=(DefaultTableModel) cajRegV.tablaCajeroVenta.getModel(); 
                   int a =modelo.getRowCount()-1;
                    System.out.println(a);
                    for(int i=a; i>=0; i--){
                    System.out.println(i);
                    modelo.removeRow(i);
                    }
                    cajRegV.tablaCajeroVenta.setModel(modelo);
                    cajRegV.textBusquedaProdVentaCajero.setText("");
                    cajRegV.labelMontoTotalVenta.setText("");
                    JOptionPane.showMessageDialog(cajRegV,  "Venta Cancelada","Mensaje",JOptionPane.CANCEL_OPTION);
                    cajRegV.dispose();
                    cajU.setVisible(true);
               }
            }
            if(comando.equals("btnCajeroCancelarCot")){
                int result = JOptionPane.showConfirmDialog(cajRegC, "Desea Cancelar la venta", "Mensaje", JOptionPane.YES_NO_OPTION);
               if(result==0){
                   DefaultTableModel modelo=(DefaultTableModel) cajRegC.tablaCajeroCotizacion.getModel(); 
                   int a =modelo.getRowCount()-1;
                    System.out.println(a);
                    for(int i=a; i>=0; i--){
                    System.out.println(i);
                    modelo.removeRow(i);
                    }
                    cajRegC.tablaCajeroCotizacion.setModel(modelo);
                    cajRegC.textBusquedaCotizacionCajero.setText("");
                    cajRegC.labelMontoTotalCotizacion.setText("");
                    JOptionPane.showMessageDialog(cajRegC, "Venta Cancelada","Mensaje",JOptionPane.CANCEL_OPTION);
                    cajRegC.dispose();
                    cajU.setVisible(true);
               }
            }
            /**/
           /**Agregar productos Venta**/
         if(comando.equals("botonBusqProdVentaCajero")){
             try{
                String codigo;
                int cantidad=0;
                float monto;
                if(cajRegV.labelMontoTotalVenta.getText().isEmpty()){
                    monto=0;
                }else{
                monto=Float.valueOf(cajRegV.labelMontoTotalVenta.getText());}
                float precio;
                boolean encontrado=false;
                 /* System.out.println("AgregadoCajero");
                  cajRegV.textBoletaVenta.setText("aasda");*/
                 logisticaProductosDTO productoCaj=lproductos.read(Integer.valueOf(cajRegV.textBusquedaProdVentaCajero.getText()));
                 System.out.println("Codigo: "+productoCaj.getCodigo()+",Categoria:"+productoCaj.getCategoria()+"fecha:"+productoCaj.getFecha());
                 Object[] datos= new Object[7];
                 datos[0]=cajRegV.tablaCajeroVenta.getRowCount()+1;
                 datos[1]=productoCaj.getCodigo();
                 datos[2]=productoCaj.getNombre();
                 datos[3]=productoCaj.getCategoria();
                 datos[4]=productoCaj.getPrecio();
                 for(int i=0;i<cajRegV.tablaCajeroVenta.getRowCount();i++){
                     codigo=(String) cajRegV.tablaCajeroVenta.getModel().getValueAt(i, 1);
                     if(codigo.equals(productoCaj.getCodigo())){
                         cantidad=(int) cajRegV.tablaCajeroVenta.getModel().getValueAt(i, 5);
                         encontrado=true;
                         cantidad++;
                         precio=productoCaj.getPrecio()*cantidad;
                         monto+=productoCaj.getPrecio();
                         cajRegV.tablaCajeroVenta.getModel().setValueAt(cantidad, i, 5);
                         cajRegV.tablaCajeroVenta.getModel().setValueAt(precio, i, 6);
                         break;
                     }
                 }
                 if(encontrado==false){
                     datos[5]=1;
                     datos[6]=productoCaj.getPrecio();
                     monto+=productoCaj.getPrecio();
                     DefaultTableModel modelo=(DefaultTableModel)cajRegV.tablaCajeroVenta.getModel(); 
                   modelo.addRow(datos); 
                   cajRegV.tablaCajeroVenta.setModel(modelo);
                 }
                 cajRegV.labelMontoTotalVenta.setText(Float.toString(monto));
             }catch(java.lang.NullPointerException ex){
                 JOptionPane.showMessageDialog(cajRegV,"<html><h2>Código no encontrado</h2></html>","Error",  ERROR_MESSAGE);
             }catch(java.lang.NumberFormatException ex){
                 JOptionPane.showMessageDialog(cajRegV,"<html><h2>Digite valores numéricos</h2></html>","Error",  WARNING_MESSAGE);
             }
           }   
           if(comando.equals("botonBoletaVenta")){
               try{
               CajeroVentasDTO venta =  new CajeroVentasDTO(cajRegV.tablaCajeroVenta.getRowCount(),cajRegV.labelFechaActualVenta.getText(),Float.parseFloat(cajRegV.labelMontoTotalVenta.getText()),"activo");
               cajv.create(venta);
               //descontar stock de los productos vendidos
                int codigo;
                int cantidad;
                int stock;
                for(int i=0;i<cajRegV.tablaCajeroVenta.getRowCount();i++){
                    codigo=Integer.parseInt((String) cajRegV.tablaCajeroVenta.getModel().getValueAt(i, 1));
                    cantidad=(int) cajRegV.tablaCajeroVenta.getModel().getValueAt(i, 5);
                    logisticaProductosDTO producto=lproductos.read(codigo);
                    stock=producto.getStock();
                    stock=stock-cantidad;
                    producto.setStock(stock);
                    lproductos.update(producto, codigo);
                }
               
               JOptionPane.showMessageDialog(cajRegV,  "Venta Registrada");
               cajRegV.dispose();
               cajU.setVisible(true);
               }catch(java.lang.NumberFormatException ex){
                   JOptionPane.showMessageDialog(cajRegV,"No se han agregado productos","Error",  ERROR_MESSAGE);
               }
           }
           /**Agregar productos Cotizacion**/
           if(comando.equals("botonBusqProdCotCajero")){
               try{
                   String codigo;
                   boolean encontrado=false;
                   logisticaProductosDTO productoCaj=lproductos.read(Integer.valueOf(cajRegC.textBusquedaCotizacionCajero.getText()));
                   System.out.println("Producto: "+productoCaj.getCodigo()+","+productoCaj.getFecha());
                   Object [] options={"Cancelar","Añadir"};
                    JSpinner spinner=new JSpinner();
                    SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
                    modeloSpinner.setValue(1);
                    modeloSpinner.setMaximum(productoCaj.getStock());
                    modeloSpinner.setMinimum(1);
                    spinner.setModel(modeloSpinner);
                   JPanel panel = new JPanel();
                    panel.add(new JLabel("Stock:"));
                    panel.add(new JLabel(String.valueOf(productoCaj.getStock())));
                    panel.add(new JLabel(", Cantidad:"));
                    panel.add(spinner);
                   int result=JOptionPane.showOptionDialog(null, panel, "Producto Encontrado", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                   if(result==1){//Agregar datos a la tabla
                       System.out.println(spinner.getValue());
                        int cantidad=0;
                        cantidad=(int) spinner.getValue();
                        float monto;
                        if(cajRegC.labelMontoTotalCotizacion.getText().isEmpty()){
                            monto=0;
                        }else{
                        monto=Float.valueOf(cajRegC.labelMontoTotalCotizacion.getText());}
                        Object[] datos= new Object[7];
                        datos[0]=cajRegC.tablaCajeroCotizacion.getRowCount()+1;
                        datos[1]=productoCaj.getCodigo();
                        datos[2]=productoCaj.getNombre();
                        datos[3]=productoCaj.getCategoria();
                        datos[4]=productoCaj.getPrecio();
                        datos[5]=cantidad;
                        datos[6]=productoCaj.getPrecio()*cantidad;
                        monto+=productoCaj.getPrecio()*cantidad;
                         for(int i=0;i<cajRegC.tablaCajeroCotizacion.getRowCount();i++){
                             codigo=(String) cajRegC.tablaCajeroCotizacion.getModel().getValueAt(i, 1);
                             if(codigo.equals(productoCaj.getCodigo())){
                                 encontrado=true;
                                 JOptionPane.showMessageDialog(cajRegC,"El produto ya ha sido agregado","Advertencia",  WARNING_MESSAGE);
                                 break;
                             }
                         }
                         if(!encontrado){
                             cajRegC.labelMontoTotalCotizacion.setText(Float.toString(monto));
                            DefaultTableModel modelo=(DefaultTableModel)cajRegC.tablaCajeroCotizacion.getModel(); 
                            modelo.addRow(datos); 
                            cajRegC.tablaCajeroCotizacion.setModel(modelo);
                         }
                     }
                        
               }catch(java.lang.NullPointerException ex){
                   JOptionPane.showMessageDialog(cajRegC,"<html><h2>Producto no encontrado</h2></html>","Error",  ERROR_MESSAGE);
               }catch(java.lang.NumberFormatException ex){
                 JOptionPane.showMessageDialog(cajRegC,"<html><h2>Digite valores numéricos</h2></html>","Error",  WARNING_MESSAGE);
             }    
           }
           if(comando.equals("btnCajeroBoletaCot")){
               try{
               CajeroVentasDTO venta =  new CajeroVentasDTO(cajRegC.tablaCajeroCotizacion.getRowCount(),cajRegC.labelFechaActualCotizacion.getText(),Float.parseFloat(cajRegC.labelMontoTotalCotizacion.getText()),"activo");
               cajv.create(venta);
               //descontar stock de los productos vendidos
                int codigo;
                int cantidad;
                int stock;
                for(int i=0;i<cajRegC.tablaCajeroCotizacion.getRowCount();i++){
                    codigo=Integer.parseInt((String) cajRegC.tablaCajeroCotizacion.getModel().getValueAt(i, 1));
                    cantidad=(int) cajRegC.tablaCajeroCotizacion.getModel().getValueAt(i, 5);
                    logisticaProductosDTO producto=lproductos.read(codigo);
                    stock=producto.getStock();
                    stock=stock-cantidad;
                    producto.setStock(stock);
                    lproductos.update(producto, codigo);
                }
               JOptionPane.showMessageDialog(cajRegC,  "Venta Registrada");
               cajRegC.dispose();
               cajU.setVisible(true);
               }catch(java.lang.NumberFormatException ex){
                   JOptionPane.showMessageDialog(cajRegC,"No se han agregado productos","Error",  ERROR_MESSAGE);
               }
           }
        //---Fin--- Cajero Venta//
    
    }
    
    
    class EscuchaMouse implements MouseListener{ 
        @Override
        public void mouseClicked(MouseEvent e) {
                    String var;
                    
                    int b=1;
                    
                    int column=admB.tablaBusquedaAdmin.columnAtPoint(e.getPoint());
                    int row=admB.tablaBusquedaAdmin.rowAtPoint(e.getPoint());
                    
                    if(row<admB.tablaBusquedaAdmin.getRowCount() && row>=0 && column<admB.tablaBusquedaAdmin.getColumnCount() && column>=4){
                        
                        
                        //((JButton)var).doClick();
                        var =String.valueOf(admB.tablaBusquedaAdmin.getModel().getValueAt(row, b));
                        id=(int) admB.tablaBusquedaAdmin.getModel().getValueAt(row, 0);
                        admM.setVisible(true);
                        admB.setVisible(false);
                        administradorDTO admDTO=a.read(Integer.valueOf(var));
                        admM.campoApellidoAdminMod.setText(admDTO.getApellido());
                        admM.campoContrasenaAdminMod.setText(admDTO.getContrasena());
                        admM.campoCorreoAdminMod.setText(admDTO.getCorreo());
                        admM.campoDireccionAdminMod.setText(admDTO.getDirección());
                        admM.campoNombreAdminMod.setText(admDTO.getNombre());
                        admM.campoRolAdminMod.setText(String.valueOf(admDTO.getRoles_idrol()));
                        admM.campoTelefonoAdminMod.setText(String.valueOf(admDTO.getTelefono()));
                        admM.campodniAdminMod.setText(String.valueOf(admDTO.getDNI()));
                    }	
        	        
	      	}

        @Override
        public void mousePressed(MouseEvent me) {
            
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    }
    class escuchaTablaPago implements MouseListener{ 
        @Override
        public void mouseClicked(MouseEvent e) {
                    String var;
                    String nombreArchivo;
                    
                    int b=0;
                    
                    int column=admPM.tablasbMEAdminModificar.columnAtPoint(e.getPoint());
                    int row=admPM.tablasbMEAdminModificar.rowAtPoint(e.getPoint());
                    
                    if(row<admPM.tablasbMEAdminModificar.getRowCount() && row>=0 && column<admPM.tablasbMEAdminModificar.getColumnCount() && column>=5){
                        InputStream input = null;
                        
                        //((JButton)var).doClick();
                        var =String.valueOf(admPM.tablasbMEAdminModificar.getModel().getValueAt(row, b));
                        nombreArchivo=String.valueOf(admPM.tablasbMEAdminModificar.getModel().getValueAt(row, 0));
                        File file = new File(nombreArchivo+".pdf");
                        
                        /*adPM.setVisible(true);
                        admPM.setVisible(false);*///
                        administradorPagoDTO admDTO=a1.read(Integer.valueOf(var));
                        input=admDTO.getIs();
                        System.out.println("-------------------"+input);
                        int tamanoInput;
                        try {
                            FileOutputStream output = new FileOutputStream(file);
                            tamanoInput = input.available();
                            System.out.println(tamanoInput);
                            byte[] buffer = new byte[tamanoInput];
                            while (input.read(buffer) > 0) 
                             output.write(buffer);
                            JOptionPane.showMessageDialog(null, "Archivo descargado");
                        } catch (IOException ex) {
                            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    if(row<admPM.tablasbMEAdminModificar.getRowCount() && row>=0 && column<admPM.tablasbMEAdminModificar.getColumnCount() && column>=0 && column<=4){
                        
                        var =String.valueOf(admPM.tablasbMEAdminModificar.getModel().getValueAt(row, b));
                        codigo=Integer.valueOf(var);//codigo sera usado para realizar la edicion en bd 
                        administradorPagoDTO admDTO=a1.read(Integer.valueOf(var));
                        admDTO.getDescripcion();
                        admDTO.getEntidad();
                        admDTO.getFechaPAgo();
                        admDTO.getId();
                        admPM.dispose();
                        adSPM.setVisible(true);
                        adSPM.tituloPago.setText(admDTO.getTitulo());
                        adSPM.montoPago.setText(String.valueOf(admDTO.getMonto()));
                        adSPM.entidadPago.setText(admDTO.getEntidad());
                        adSPM.descripcionPago.setText(admDTO.getDescripcion());
                        adSPM.fechaPago.setText(admDTO.getFechaPAgo());
                        
                    }
        	        
	      	}

        @Override
        public void mousePressed(MouseEvent me) {
            
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    }
    public void estiloBoton(String ruta, JButton botón){//"/image/descargalo.png"
        ImageIcon fondoboton=new ImageIcon(getClass().getResource(ruta));
        Icon fondo1=new ImageIcon(fondoboton.getImage().getScaledInstance(30,25, Image.SCALE_AREA_AVERAGING));
        Icon fondo1press=new ImageIcon(fondoboton.getImage().getScaledInstance(40,30, Image.SCALE_AREA_AVERAGING));
        botón.setIcon(fondo1);
        botón.setPressedIcon(fondo1press);
        botón.setEnabled(true);
        System.out.println("hereee");
    }
    
}		

		


	
    
    
   
    
   /* 
    public static void main(String[] args){
        LibroDAO l= new LibroDAO();
        
        l.create(new LibroDTO("888","Yaya","Pepo"));
        l.update(new LibroDTO("888","Yaya","Pepo"));
        
        LibroDTO librobuscar=l.read("888", "888");
        System.out.println("name"+"-->"+librobuscar.getNombre());
    }
*/
    

