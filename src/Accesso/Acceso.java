/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesso;


import InterfazAdmin.InterfazAdmin;
import Joption.Joption;
import Joption.Joptionx;
import java.sql.*;
import javax.swing.JOptionPane;
import sesion.Login;


public class Acceso {
  
   Joption icon = new Joption();
   Joptionx save = new Joptionx(); 
     
public  void acceso(String usuario ,String contraseña,String tipo_usuario){
  
    
Connection conexion=null;
Statement consulta=null;
ResultSet tabla=null;
try{
    //coneccion a base de datos y acceso al administrador
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost/control_inventario","root","");
    consulta=conexion.createStatement();
    tabla=consulta.executeQuery("SELECT tipo_sesion,contra_usu from administrador where tipo_sesion='"+tipo_usuario+"'AND contra_usu='"+ contraseña+"'");
    if(tabla.next()){  
    JOptionPane.showMessageDialog(null,"BIENVENIDO ADMINISTRADOR"  , "BIENVENIDO",JOptionPane.PLAIN_MESSAGE,icon);
    InterfazAdmin as = new InterfazAdmin();
    as.setVisible(true);
 
    }

    else{
    JOptionPane.showMessageDialog(null,"ADMINISTRADOR NO AUTORIZADO!","ERROR",JOptionPane.ERROR_MESSAGE,save);
    Login.contraseña.setText("");
    Login.usuarioL.setSelectedIndex(0);
    return;
   

    }
    
}catch(ClassNotFoundException|SQLException e ){
JOptionPane.showMessageDialog(null,"BASE DE DATOS NO DISPONIBLE","ERROR",JOptionPane.INFORMATION_MESSAGE,save );
}
  }  




public  void accesoinvitado(String usuario ,String contraseña,String tipo_usuario){
Connection conexion=null;
Statement consulta=null;
ResultSet tabla=null;
try{
    //Conexion a base de datos y acceso al sistema invitado
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost/control_inventario","root","");
    consulta=conexion.createStatement();
    tabla=consulta.executeQuery("select contra_usu, tipo_sesion from invitado where contra_usu='"+contraseña+"'AND tipo_sesion='"+ tipo_usuario+"'");
    if(tabla.next()){  
    JOptionPane.showMessageDialog(null,"BIENVENIDO__INVITADO","BIENVENIDO",JOptionPane.PLAIN_MESSAGE,icon);
    InterfazAdmin pi= new InterfazAdmin();
    pi.setVisible(true);
    InterfazAdmin.btnusuario.setVisible(false);
    InterfazAdmin.btnadmin.setVisible(false);
              
    }else{
    JOptionPane.showMessageDialog(null,"EL ADMINISTRADOR NO LO HA REGISTRADO!","ERROR",JOptionPane.ERROR_MESSAGE,save);
    Login.contraseña.setText("");
   Login.contraseña.setText("");
    return;
    }
}catch(ClassNotFoundException |SQLException e){
JOptionPane.showMessageDialog(null,"BASE DE DATOS NO DISPONIBLE","ERROR",JOptionPane.INFORMATION_MESSAGE,save );}

}  

}
