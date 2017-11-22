/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojos.HClinico;

public class daoHClinico implements IDao<HClinico> {

    /**
     * Agrega una Historial clinico de acuerdo a los atributos del Historial
     * Clinico recibidos
     *
     * @param obj HClinico que se desea agregar
     * @return <b>True</b> si el HClinico se agrego exitosamente,
     * <b>False</b> si no se ha podido agregar
     */
    @Override
    public boolean Insert(HClinico obj) {
        String SQL = "insert into HClinico values(" + obj.getIdHC() + "," + obj.getIdPaciente() + ",'" + obj.getTelefono() + "'," + obj.isTratamiento()
                + ",'" + obj.getTipo() + "','" + obj.getNombreDr() + "'," + obj.isTomaMedicamento() + ",'" + obj.getCualMedicamento() + "',"
                + obj.isHospitalizacion() + ",'" + obj.getMotivoHospitalizacion() + "'," + obj.isEsmalte() + "," + obj.isDentina() + ","
                + obj.isRaiz() + "," + obj.isHuesos() + "," + obj.isEncia() + "," + obj.isInsercionEpitelial() + "," + obj.isLengua() + ","
                + obj.isPulpa() + "," + obj.isVelo() + "," + obj.isCarrillos() + "," + obj.isSobreMordida() + "," + obj.isMordidaAbierta() + "," + obj.isDesgasteBruxismo() + ","
                + obj.isAnoclusion() + "," + obj.isARespiratorio() + "," + obj.isACardioPulmonar() + ","
                + obj.isADigestivo() + "," + obj.isSNervioso() + "," + obj.isGoagulacion() + "," + obj.isVertigos() + "," + obj.isDiabetes() + ","
                + obj.isTiroides() + "," + obj.isFiebre() + "," + obj.isHipertencion() + "," + obj.isDesmayos() + "," + obj.isEmbarazo() + ","
                + obj.isFuma() + "," + obj.isBebe() + "," + obj.isConsumeDrogas() + "," + obj.isAlergias() + ",'" + obj.getTipoAlergia() + "','"
                + obj.getHigienBucal() + "','" + obj.getHabitosAlimenticios() + "','" + obj.getTipoConsulta() + "')";
        return Conexion.ejecutarSQL(SQL);
    }

    /**
     * Busca un HClinico de acuerdo al id recibido parámetro,
     *
     * @param id Identificador del HClinico a buscar
     * @return Si el HClinico es encontrado, carga los atributos con sus datos,
     * de lo contrario regresa Null
     */
    @Override
    public HClinico Buscar(int id) {
        String SQL = "Select * from HClinico where idHC = " + id;
        ResultSet rsLista = Conexion.ejecutarSQLSelect(SQL);
        HClinico h = null;
        try {
            while (rsLista.next()) {
                h = new HClinico(rsLista.getInt("idHC"), rsLista.getInt("idPaciente"),
                        rsLista.getString("Telefono"), rsLista.getBoolean("Tratamiento"),
                        rsLista.getString("Tipo"), rsLista.getString("NombreDr"), rsLista.getBoolean("TomaMedicamento"),
                        rsLista.getString("CualMedicamento"), rsLista.getBoolean("Hospitalizacion"),
                        rsLista.getString("MotivoHospitalizacion"), rsLista.getBoolean("Esmalte"), rsLista.getBoolean("Dentina"),
                        rsLista.getBoolean("Raiz"), rsLista.getBoolean("Huesos"), rsLista.getBoolean("Encia"),
                        rsLista.getBoolean("InsercionEpitelial"), rsLista.getBoolean("Lengua"), rsLista.getBoolean("Pulpa"),
                        rsLista.getBoolean("Velo"), rsLista.getBoolean("Carrillos"), rsLista.getBoolean("SobreMordida"),
                        rsLista.getBoolean("MordidaAbierta"), rsLista.getBoolean("DesgasteBruxismo"), rsLista.getBoolean("Anoclusion"),
                        rsLista.getBoolean("ARespiratorio"), rsLista.getBoolean("ACardioBascular"), rsLista.getBoolean("ADigestivo"),
                        rsLista.getBoolean("SNervioso"), rsLista.getBoolean("Goagulacion"), rsLista.getBoolean("Vertigos"),
                        rsLista.getBoolean("Diabetes"), rsLista.getBoolean("Tiroides"), rsLista.getBoolean("Fiebre"),
                        rsLista.getBoolean("Hipertension"), rsLista.getBoolean("Desmayos"), rsLista.getBoolean("Embarazo"),
                        rsLista.getBoolean("Fuma"), rsLista.getBoolean("Bebe"), rsLista.getBoolean("ConsumeDrogas"),
                        rsLista.getBoolean("Alergias"), rsLista.getString("TipoAlergia"), rsLista.getString("HigienBucal"),
                        rsLista.getString("HabitosAlimenticios"), rsLista.getString("TipoConsulta"));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return h;
    }

    /**
     * Busca un HClinico de acuerdo al id recibido parámetro,
     *
     * @param id Identificador del Paciente que contiene el HClinico a buscar
     * @return Si el HClinico es encontrado, carga los atributos con sus datos,
     * de lo contrario regresa Null
     */
    public HClinico BuscaHCP(int idPaciente) {
        String SQL = "Select * from HClinico where idPaciente = " + idPaciente;
        ResultSet rsLista = Conexion.ejecutarSQLSelect(SQL);
        HClinico h = null;
        try {
            while (rsLista.next()) {
                h = new HClinico(rsLista.getInt("idHC"), rsLista.getInt("idPaciente"),
                        rsLista.getString("Telefono"), rsLista.getBoolean("Tratamiento"),
                        rsLista.getString("Tipo"), rsLista.getString("NombreDr"), rsLista.getBoolean("TomaMedicamento"),
                        rsLista.getString("CualMedicamento"), rsLista.getBoolean("Hospitalizacion"),
                        rsLista.getString("MotivoHospitalizacion"), rsLista.getBoolean("Esmalte"), rsLista.getBoolean("Dentina"),
                        rsLista.getBoolean("Raiz"), rsLista.getBoolean("Huesos"), rsLista.getBoolean("Encia"),
                        rsLista.getBoolean("InsercionEpitelial"), rsLista.getBoolean("Lengua"), rsLista.getBoolean("Pulpa"),
                        rsLista.getBoolean("Velo"), rsLista.getBoolean("Carrillos"), rsLista.getBoolean("SobreMordida"),
                        rsLista.getBoolean("MordidaAbierta"), rsLista.getBoolean("DesgasteBruxismo"), rsLista.getBoolean("Anoclusion"),
                        rsLista.getBoolean("ARespiratorio"), rsLista.getBoolean("ACardioBascular"), rsLista.getBoolean("ADigestivo"),
                        rsLista.getBoolean("SNervioso"), rsLista.getBoolean("Goagulacion"), rsLista.getBoolean("Vertigos"),
                        rsLista.getBoolean("Diabetes"), rsLista.getBoolean("Tiroides"), rsLista.getBoolean("Fiebre"),
                        rsLista.getBoolean("Hipertension"), rsLista.getBoolean("Desmayos"), rsLista.getBoolean("Embarazo"),
                        rsLista.getBoolean("Fuma"), rsLista.getBoolean("Bebe"), rsLista.getBoolean("ConsumeDrogas"),
                        rsLista.getBoolean("Alergias"), rsLista.getString("TipoAlergia"), rsLista.getString("HigienBucal"),
                        rsLista.getString("HabitosAlimenticios"), rsLista.getString("TipoConsulta"));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return h;

    }

    /**
     * Busca todos los datos de la tabla HClinico
     *
     * @return un ArrayList<HClinico> que contiene los atributos con sus datos,
     * de lo contrario regresa Null
     */
    @Override
    public ArrayList<HClinico> ConsultarTodos() {
        ArrayList<HClinico> lista = new ArrayList<>();
        String SQL = "Select * from HClinico";
        ResultSet rsLista = Conexion.ejecutarSQLSelect(SQL);
        HClinico h = null;
        try {
            while (rsLista.next()) {
                h = new HClinico(rsLista.getInt("idHC"), rsLista.getInt("idPaciente"),
                        rsLista.getString("Telefono"), rsLista.getBoolean("Tratamiento"),
                        rsLista.getString("Tipo"), rsLista.getString("NombreDr"), rsLista.getBoolean("TomaMedicamento"),
                        rsLista.getString("CualMedicamento"), rsLista.getBoolean("Hospitalizacion"),
                        rsLista.getString("MotivoHospitalizacion"), rsLista.getBoolean("Esmalte"), rsLista.getBoolean("Dentina"),
                        rsLista.getBoolean("Raiz"), rsLista.getBoolean("Huesos"), rsLista.getBoolean("Encia"),
                        rsLista.getBoolean("InsercionEpitelial"), rsLista.getBoolean("Lengua"), rsLista.getBoolean("Pulpa"),
                        rsLista.getBoolean("Velo"), rsLista.getBoolean("Carrillos"), rsLista.getBoolean("SobreMordida"),
                        rsLista.getBoolean("MordidaAbierta"), rsLista.getBoolean("DesgasteBruxismo"), rsLista.getBoolean("Anoclusion"),
                        rsLista.getBoolean("ARespiratorio"), rsLista.getBoolean("ACardioBascular"), rsLista.getBoolean("ADigestivo"),
                        rsLista.getBoolean("SNervioso"), rsLista.getBoolean("Goagulacion"), rsLista.getBoolean("Vertigos"),
                        rsLista.getBoolean("Diabetes"), rsLista.getBoolean("Tiroides"), rsLista.getBoolean("Fiebre"),
                        rsLista.getBoolean("Hipertension"), rsLista.getBoolean("Desmayos"), rsLista.getBoolean("Embarazo"),
                        rsLista.getBoolean("Fuma"), rsLista.getBoolean("Bebe"), rsLista.getBoolean("ConsumeDrogas"),
                        rsLista.getBoolean("Alergias"), rsLista.getString("TipoAlergia"), rsLista.getString("HigienBucal"),
                        rsLista.getString("HabitosAlimenticios"), rsLista.getString("TipoConsulta"));
                lista.add(h);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return lista;
    }

    /**
     * Elimina un HClinico de acuerdo al atributo Id recibido como parámetro
     *
     * @return <b>True</b> si el HClinico se elimino exitosamente, <b>False</b>
     * si no se ha podido eliminar
     */
    @Override
    public boolean Delete(int id) {
        return Conexion.ejecutarSQL("delete from HClinico where idHC = " + id);
    }

    /**
     * Edita los datos de un HClinico de acuerdo a los atributos del HClinico
     * recibido
     *
     * @param obj HClinico que se desea editar
     * @return <b>True</b> si el HClinico se editó exitosamente,
     * <b>False</b> si no se ha podido editar
     *
     */
    @Override
    public boolean Update(HClinico obj) {
        String SQL = "update HClinico set "
                + "idPaciente= " + obj.getIdPaciente() + ", telefono = '" + obj.getTelefono() + "', Tratamiento = " + obj.isTratamiento()
                + ", Tipo = '" + obj.getTipo() + "', NombreDr = '" + obj.getNombreDr() + "', TomaMedicamento = " + obj.isTomaMedicamento()
                + ", CualMedicamento = '" + obj.getCualMedicamento() + "', Hospitalizacion = " + obj.isHospitalizacion()
                + ", MotivoHospitalizacion = '" + obj.getMotivoHospitalizacion() + "', Esmalte = " + obj.isEsmalte() + ", Dentina = " + obj.isDentina()
                + ", Raiz = " + obj.isRaiz() + ", Huesos =" + obj.isHuesos()
                + ", Encia = " + obj.isEncia() + ", InsercionEpitelial = " + obj.isInsercionEpitelial() + ", Lengua = " + obj.isLengua()
                + ", Pulpa = " + obj.isPulpa() + ", Velo = " + obj.isVelo() + ", Carrillos = " + obj.isCarrillos() + ", SobreMordida = " + obj.isSobreMordida()
                + ", MordidaAbierta = " + obj.isMordidaAbierta() + ", DesgasteBruxismo = " + obj.isDesgasteBruxismo() + ", Anoclusion = " + obj.isAnoclusion()
                + ", ARespiratorio = " + obj.isARespiratorio() + ", ACardiobascular = " + obj.isACardioPulmonar()
                + ", ADigestivo = " + obj.isADigestivo() + ", SNervioso = " + obj.isSNervioso() + ", Goagulacion = " + obj.isGoagulacion()
                + ", Vertigos = " + obj.isVertigos() + ", Diabetes = " + obj.isDiabetes() + ", Tiroides = " + obj.isTiroides()
                + ", Fiebre = " + obj.isFiebre() + ", Hipertension = " + obj.isHipertencion() + ", Desmayos = " + obj.isDesmayos()
                + ", Embarazo = " + obj.isEmbarazo() + ", Fuma = " + obj.isFuma() + ", Bebe = " + obj.isBebe() + ", ConsumeDrogas = " + obj.isConsumeDrogas()
                + ", Alergias = " + obj.isAlergias() + ", TipoAlergia = '" + obj.getTipoAlergia() + "', HigienBucal = '" + obj.getHigienBucal()
                + "', HabitosAlimenticios = '" + obj.getHabitosAlimenticios() + "', TipoConsulta = '" + obj.getTipoConsulta()
                + "' where idHC = " + obj.getIdHC();
        return Conexion.ejecutarSQL(SQL);
    }

}
