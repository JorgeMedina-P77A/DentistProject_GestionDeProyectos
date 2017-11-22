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
import pojos.Pagos;

public class daoPagos implements IDao<pojos.Pagos> {

    @Override
    public boolean Insert(Pagos obj) {
        String SQL = "Insert into pagos values (null," + obj.getIdProducto() + "," + obj.getIdPaciente()
                + ",'" + obj.getDescripcion() + "'," + obj.getCantidad() + "," + obj.getPago() + "," + obj.getDebe() + ")";
        return Conexion.ejecutarSQL(SQL);
    }

    @Override
    public Pagos Buscar(int id) {
        String sql = "select * from pagos where idPago=" + id;
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Pagos pago = null;
        try {
            while (rsLista.next()) {
                pago = new Pagos(rsLista.getInt("idPago"), rsLista.getInt("idProducto"),
                        rsLista.getInt("idPaciente"), rsLista.getString("descripcion"),
                        rsLista.getInt("cantidad"), rsLista.getDouble("pago"), rsLista.getDouble("debe"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return pago;
    }

    @Override
    public ArrayList<Pagos> ConsultarTodos() {
        String sql = "select * from pagos";
        ArrayList<Pagos> lista = new ArrayList<>();
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Pagos pago = null;
        try {
            while (rsLista.next()) {
                pago = new Pagos(rsLista.getInt("idPago"), rsLista.getInt("idProducto"),
                        rsLista.getInt("idPaciente"), rsLista.getString("descripcion"),
                        rsLista.getInt("cantidad"), rsLista.getDouble("pago"), rsLista.getDouble("debe"));
                lista.add(pago);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return lista;

    }

    @Override
    public boolean Delete(int id) {
        String SQL = "Delete from pagos where id = "+id;
        return Conexion.ejecutarSQL(SQL);
    }

    @Override
    public boolean Update(Pagos obj) {
        String SQL = "update pagos set idProducto =" + obj.getIdProducto() + ", idPaciente = " + obj.getIdPaciente()
                + ", descripcion = '" + obj.getDescripcion() + "', cantidad = " + obj.getCantidad() + ", pago = "
                + obj.getPago() + ", debe = " + obj.getDebe() + " where idPago = " + obj.getIdPago();

        return Conexion.ejecutarSQL(SQL);
    }

}
