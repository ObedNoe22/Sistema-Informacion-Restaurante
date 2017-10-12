/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**

*

* @author lupita

*/

public class conexion{

public static final String db="restaurante";  //nombre de base de datos

private static final String user="root"; //nombre de usuario

private static final String pass=""; //contraseña de tu MySQL

private static final String url="jdbc:mysql://localhost/restaurante";

private static  Connection Conn;

 

public static Connection getConnection(){

try{

Conn=DriverManager.getConnection(url,user,pass);

}catch(SQLException e){

JOptionPane.showMessageDialog(null, "error de conexion "+e.getMessage());

}

return Conn;

}

 

}
