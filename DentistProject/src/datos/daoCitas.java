/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojos.Citas;

public class daoCitas implements IDao<Citas> {

    
    /**
     * Agrega una cita de acuerdo a los atributos la cita recibida
     * @param obj Cita que se desea agregar
     * @return <b>True</b> si la cita se agrego exitosamente, 
     * <b>False</b> si no se ha podido agregar
     */
    @Override
    public boolean Insert(Citas obj) {
        String sql = "insert into citas values(" + obj.getIdCita() + ",'"
                + obj.getNombrePaciente() + "','" + obj.getDescripcion() + "','"
                + obj.getFecha() + "','" + obj.getHora() + "','" + obj.getTratamiento() + "','"
                + obj.getTipo() + "'," + obj.getCostoTotal() + "," + obj.getCantidadPagada() + ")";
        return Conexion.ejecutarSQL(sql);
    }

    
    /**
     * Busca una cita de acuerdo al id recibido parámetro, 
     * @param id Identificador de la cita a buscar
     * @return Si la cita es encontrada, carga los atributos con sus datos, de lo 
     * contrario regresa Null
     */
    @Override
    public Citas Buscar(int id) {
        String sql = "select * from citas where idCita=" + id;
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Citas cita = null;
        try {
            while (rsLista.next()) {
                cita = new Citas(rsLista.getInt("idCita"), rsLista.getString("NombrePaciente"),
                        rsLista.getString("descripcion"), rsLista.getDate("fecha"), rsLista.getTime("hora"),
                        rsLista.getString("tratamiento"), rsLista.getString("tipo"), rsLista.getDouble("costoTotal"),
                        rsLista.getDouble("CantidadPagada"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cita;
    }
    
    /**
     * Busca todos los datos de la tabla citas
     * @return un ArrayList<Citas> que contiene los atributos con sus datos, de lo 
     * contrario regresa Null
     */
    

    @Override
    public ArrayList<Citas> ConsultarTodos() {
        ArrayList<Citas> lista = new ArrayList<>();
        String sql = "select * from citas";
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Citas cita;
        try {
            while (rsLista.next()) {
                cita = new Citas(rsLista.getInt("idCita"), rsLista.getString("NombrePaciente"),
                        rsLista.getString("descripcion"), rsLista.getDate("fecha"), rsLista.getTime("hora"),
                        rsLista.getString("tratamiento"), rsLista.getString("tipo"), rsLista.getDouble("costoTotal"),
                        rsLista.getDouble("CantidadPagada"));
                lista.add(cita);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return lista;
    }

    
     /**
     * Elimina una cita de acuerdo al atributo Id recibido como parámetro
     * @return <b>True</b> si la cita se elimino exitosamente, <b>False</b> si no se ha podido eliminar
     */
    @Override
    public boolean Delete(int id) {
        return Conexion.ejecutarSQL("delete from citas where idCita = " + id);
    }
    
    /**
     * Edita los datos de una Cita de acuerdo a los atributos la Cita recibida
     * @param obj Cita que se desea editar
     * @return <b>True</b> si la cita se editó exitosamente, 
     * <b>False</b> si no se ha podido editar
     */

    @Override
    public boolean Update(Citas obj) {
        String sql = "update citas set "
                + "NombrePaciente = '" + obj.getNombrePaciente() + "'," + "descripcion = '" + obj.getDescripcion()
                + "',fecha = '" + obj.getFecha() + "', hora = '" + obj.getHora() + "', tratamiento = '" + obj.getTratamiento()
                + "', tipo =  '" + obj.getTipo() + "', costoTotal = " + obj.getCostoTotal() + ", cantidadPagada = " + obj.getCantidadPagada()
                + " where idCita= " + obj.getIdCita();
        return Conexion.ejecutarSQL(sql);
    }

}
