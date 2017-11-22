/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conexion {

    private static Connection conexion;
    private static Statement sentencia;

    /**
     * Crear conexión con la Base de datos
     * @return <b>True</b> Si la conexión se realizó, 
     * <b>False</b> en caso contrario
     */
    
    
    public static void conecta() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/dentist?user=root&password=Ichliebedich");
//            JOptionPane.showMessageDialog(null,
//                    "La Conexion se ha establecido correctamente",
//                    "Información", JOptionPane.INFORMATION_MESSAGE);
            sentencia = conexion.createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error al establecer la conexion",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    
     /**
     * Ejecutar instrucción SELECT SQL
     * @param sql instrucción a ejecutar
     * @return Conjunto de resultados de la consulta
     */
    
    public static ResultSet ejecutarSQLSelect(String sql) {
        try {
            sentencia = conexion.createStatement();
            return sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    
    
     /**
     * Ejecuta instrucciones SQL INSERT, UPDATE y DELETE
     * @param sql instrucción a ejecutar
     * @return <b>True</b> Si la operación se realizó con éxito, 
     * <b>False</b> en caso de fallo
     */

    public static boolean ejecutarSQL(String sql) {
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }

}
