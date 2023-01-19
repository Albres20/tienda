/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Conexion {
       public static Conexion instance;//NOSONAR //sirve para aplicar el singleton
       private Connection con; //sirve para crear los statments 
       static final String ROOT= "root";
       static final String URL = "jdbc:mysql://localhost:3306/de_compras_store?useSSL=false";
       private Conexion(){ //si es que el contructor es privado nunca podre crear conexiones
            try{
                con = DriverManager.getConnection(URL,ROOT,"1234");//NOSONAR
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
            }
           
       }
       public synchronized static Conexion saberEstado(){ //la unica forma para saber si hay una conexion es invocar al metodo saber estado, este metodo aplica el patron singleton
           if(instance==null){ //synchronized evita que el programa se cuelgue haciendo una lsita de espera, cuando multiples usuarios se conectan
               instance =new Conexion();
               
           }
           return instance;
       }

        public Connection getCon() {
            return con;
        }

       
        public void cerrarConexion(){
            this.instance=null;
        }
    
}
