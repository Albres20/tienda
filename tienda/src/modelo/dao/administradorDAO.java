/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion.Conexion;
import modelo.dto.administradorDTO;
import modelo.interfaces.crud;

/**
 *
 * @author David
 */
public class administradorDAO implements crud<administradorDTO> {//NOSONAR
    
    private static final String SQL_Insert="INSERT into usuarios(nombre, apellido, dni, rolesIdrol, correo, contrasena, direccion, telefono, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";//NOSONAR
    private static final String SQL_Delete="DELETE from usuarios WHERE dni=?";//NOSONAR
    private static final String SQL_Update="UPDATE usuarios SET nombre=?, apellido=?, dni=?, rolesIdrol=?, correo=?, contrasena=?, direccion=?, telefono=? WHERE id=?";//NOSONAR
    private static final String SQL_Read="SELECT * FROM usuarios WHERE dni = ?";//NOSONAR
    private static final String SQL_ReadAll="SELECT * from usuarios";//NOSONAR
    private static final Conexion con=Conexion.saberEstado();//singleton

    @Override
    public boolean create(administradorDTO c) {
        
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Insert)) {
            
            
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setInt(3, c.getDNI());
            ps.setInt(4, c.getRoles_idrol());
            ps.setString(5, c.getCorreo());
            ps.setString(6, c.getContrasena());
            ps.setString(7, c.getDirección());
            ps.setInt(8, c.getTelefono());
            ps.setInt(9, 1);
            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Delete)){
           
        ps.setInt(1, (int) key);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean update(administradorDTO c, Object b) {
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Update)){

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setInt(3, c.getDNI());
            ps.setInt(4, c.getRoles_idrol());
            ps.setString(5, c.getCorreo());
            ps.setString(6, c.getContrasena());
            ps.setString(7, c.getDirección());
            ps.setInt(8, c.getTelefono());
            ps.setObject(9, b);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public administradorDTO read(Object key) {
       
       
        administradorDTO l = null;
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Read)) {
            
           
            ps.setInt(1, (int) key);
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new administradorDTO(res.getInt("id"),res.getString("nombre"),res.getString("apellido"),
                        res.getInt("dni"), res.getInt("rolesIdrol"),   res.getString("correo") , 
                        res.getString("contrasena"),  res.getString("direccion"),  res.getInt("telefono"));
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(administradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        System.out.println(key+"XDDDD");
        return l;
    }

    @Override
    public administradorDTO read(Object key, Object key2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<administradorDTO> readAll() {
       
        
        administradorDTO l = null;
        List<administradorDTO> customerList = new ArrayList<>();
       
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_ReadAll)){
            
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new administradorDTO(res.getInt("id"),res.getString("nombre"),res.getString("apellido"),
                        res.getInt("dni"), res.getInt("rolesIdrol"),   res.getString("correo") , 
                        res.getString("contrasena"),  res.getString("direccion"),  res.getInt("telefono"));
                customerList.add(l);
                } 
            }
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(administradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        
        return customerList;
    }


   
    
}
