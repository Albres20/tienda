/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import javax.swing.JOptionPane;
import modelo.dao.loguinDAO;
import vista.administradorRegistrar;
import vista.usuarioCajero;
/**
 *
 * @author MOISES
 */
public class loginDTO {
    private int id;
    private String correo;
    private String contrasena;
    private int roles_idrol;
    
    public loginDTO(){
    }

    public loginDTO(int id, String correo, String contrasena, int roles_idrol) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.roles_idrol = roles_idrol;
    }
    
    public loginDTO(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRoles_idrol() {
        return roles_idrol;
    }

    public void setRoles_idrol(int roles_idrol) {
        this.roles_idrol = roles_idrol;
    }
    
    public void validar(){
 
        
        
        if (!"".equals(getCorreo()) || !"".equals(getContrasena())) {

 
            
            if (getCorreo()!= null && getContrasena() != null) {
                if(getRoles_idrol() == 1){
                    administradorRegistrar adm = new administradorRegistrar();
                    adm.setVisible(true);
                    //dispose();
                }
                if(getRoles_idrol() == 2){
                    administradorRegistrar adm = new administradorRegistrar();
                    adm.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Lamar a clase de logistica y ponerlo true putit4s");
                    // *******clase de logistica y ponerlo true********
                    //dispose();
                }
                if(getRoles_idrol() == 3){
                    usuarioCajero caj = new usuarioCajero();
                    caj.setVisible(true);
                    //dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos");
            }
        }
    }
    
}
