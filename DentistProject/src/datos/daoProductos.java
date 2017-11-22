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
import pojos.Productos;

public class daoProductos implements IDao<Productos> {

    @Override
    public boolean Insert(Productos obj) {
        String SQL = "insert into productos values (" + obj.getIdProducto() + ",'"
                + obj.getNombre() + "','" + obj.getTipo() + "','" + obj.getDescripcion() + "',"
                + obj.getCantidad() + "," + obj.getPrecioCompra() + "," + obj.getPrecioVenta() + ")";
        return Conexion.ejecutarSQL(SQL);
    }

    @Override
    public Productos Buscar(int id) {
        String sql = "select * from productos";
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Productos producto = null;
        try {
            while (rsLista.next()) {
                producto = new Productos(rsLista.getInt("idProducto"), rsLista.getString("nombre"),
                        rsLista.getString("Tipo"), rsLista.getString("descripcion"), rsLista.getInt("Cantidad"),
                        rsLista.getInt("PrecioCompra"), rsLista.getInt("PrecioVenta"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return producto;
    }

    @Override
    public ArrayList<Productos> ConsultarTodos() {
        ArrayList<Productos> lista = new ArrayList<>();
        String sql = "select * from productos";
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Productos producto;
        try {
            while (rsLista.next()) {
                producto = new Productos(rsLista.getInt("idProducto"), rsLista.getString("nombre"),
                        rsLista.getString("Tipo"), rsLista.getString("descripcion"), rsLista.getInt("Cantidad"),
                        rsLista.getInt("PrecioCompra"), rsLista.getInt("PrecioVenta"));
                lista.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return lista;
    }

    @Override
    public boolean Delete(int id) {
        return Conexion.ejecutarSQL("Delete from productos where idProducto = " + id);
    }

    @Override
    public boolean Update(Productos obj) {
    String SQL= "update productos set nombre = '"+obj.getNombre()+"', tipo = '"+obj.getTipo()+"', "+
            "Descripcion = '"+obj.getDescripcion()+"', Cantidad = "+obj.getCantidad()+", precioCompra = "
            +obj.getPrecioCompra()+", precioVenta = "+obj.getPrecioVenta()+" where idProducto = "+obj.getIdProducto();
    return Conexion.ejecutarSQL(SQL);
    }

}
