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
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import restaurant.Formularios.nuevasrecetas;

/**


* @author ObedNoe22

*/

public class conexion{

public static final String db="restaurante";  //nombre de base de datos

private static final String user="root"; //nombre de usuario

private static final String pass=""; //contraseña de tu MySQL

private static final String url="jdbc:mysql://localhost:3306/restaurante";

private static  Connection Conn;

 

public static Connection getConnection(){

try{

Conn=DriverManager.getConnection(url,user,pass);

}catch(SQLException e){

JOptionPane.showMessageDialog(null, "error de conexion "+e.getMessage());

}

return Conn;

}
    public static ResultSet getTabla(String Consulta) {
        Connection conn=getConnection();
        Statement st;
        ResultSet datos=null;
        try{
            st=conn.createStatement();
            datos=st.executeQuery(Consulta);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
}
