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
import pojos.Pacientes;

public class daoPacientes implements IDao<Pacientes> {

    @Override
    public boolean Insert(Pacientes obj) {
        String sql = "insert into pacientes values(" + obj.getIdPaciente() + ",'" + obj.getNombre() + "','" + obj.getApellidoP()
                + "','" + obj.getApellidoM() + "'," + obj.getEdad() + ",'" + obj.getDireccion()
                + "','" + obj.getSexo() + "','" + obj.getEstadoCivil() + "','" + obj.getDiagnostico()
                + "','" + obj.getPadecimiento() + "','" + obj.getTratamiento() + "','" + obj.getActividades()
                + "'," + obj.getDia() + "," + obj.getMes() + "," + obj.getYear() + "," + obj.isVigencia() + ")";
        return Conexion.ejecutarSQL(sql);
    }

    @Override
    public Pacientes Buscar(int id) {
        String sql = "select * from pacientes where idPaciente=" + id;
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Pacientes paciente = null;
        try {
            while (rsLista.next()) {
                paciente = new Pacientes(rsLista.getInt("idPaciente"),
                        rsLista.getString("nombre"), rsLista.getString("ApellidoP"), rsLista.getString("ApellidoM"),
                        rsLista.getInt("edad"), rsLista.getString("direccion"), rsLista.getString("sexo"),
                        rsLista.getString("EstadoCivil"), rsLista.getString("diagnostico"), rsLista.getString("padecimiento"),
                        rsLista.getString("tratamiento"), rsLista.getString("tratamiento"),
                        rsLista.getInt("dia"), rsLista.getInt("mes"), rsLista.getInt("year"), rsLista.getBoolean("vigencia"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return paciente;
    }

    @Override
    public ArrayList<Pacientes> ConsultarTodos() {
        ArrayList<Pacientes> lista = new ArrayList<>();
        String sql = "select * from pacientes";
        ResultSet rsLista = Conexion.ejecutarSQLSelect(sql);
        Pacientes paciente;
        try {
            while (rsLista.next()) {
                paciente = new Pacientes(rsLista.getInt("idPaciente"),
                        rsLista.getString("nombre"), rsLista.getString("ApellidoP"), rsLista.getString("ApellidoM"),
                        rsLista.getInt("edad"), rsLista.getString("direccion"), rsLista.getString("sexo"),
                        rsLista.getString("EstadoCivil"), rsLista.getString("diagnostico"), rsLista.getString("padecimiento"),
                        rsLista.getString("tratamiento"), rsLista.getString("tratamiento"),
                        rsLista.getInt("dia"), rsLista.getInt("mes"), rsLista.getInt("year"), rsLista.getBoolean("vigencia"));
                lista.add(paciente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return lista;
    }

    @Override
    public boolean Delete(int id) {
        return Conexion.ejecutarSQL("delete from pacientes where idPaciente = " + id);
    }

    @Override
    public boolean Update(Pacientes obj) {
        String sql = "update pacientes set nombre = '" + obj.getNombre() + "', apellidoP= '" + obj.getApellidoP()
                + "', apellidoM='" + obj.getApellidoM() + "',edad=" + obj.getEdad() + ",direccion = '"
                + obj.getDireccion() + "',sexo='" + obj.getSexo() + "',EstadoCivil='" + obj.getEstadoCivil() + "',diagnostico='"
                + obj.getDiagnostico() + "',padecimiento='" + obj.getPadecimiento() + "',tratamiento='" + obj.getTratamiento()
                + "',actividades = '" + obj.getActividades() + "',dia=" + obj.getDia() + ",mes=" + obj.getMes()
                + ",year =" + obj.getYear() + ",vigencia =" + obj.isVigencia() + " where idPaciente= " + obj.getIdPaciente();
        return Conexion.ejecutarSQL(sql);
    }

}
