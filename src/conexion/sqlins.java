/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Obed Martinez
 */
public class sqlins {
    public static String INSERT_CON_FOTO = "INSERT INTO Personal" + "(nombre, apellidos, email, foto) VALUES(?, ?, ?, ?)";
    public static String INSERT_SIN_FOTO = "INSERT INTO Personal" + "(nombre, apellidos, email) VALUES(?, ?, ?)";
}
