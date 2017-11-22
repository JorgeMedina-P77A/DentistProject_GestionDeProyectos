/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author danie
 */
public class HClinico {

    private int idHC;
    private int idPaciente;
    private String telefono;
    private boolean tratamiento;
    private String tipo;
    private String nombreDr;
    private boolean tomaMedicamento;
    private String cualMedicamento;
    private boolean hospitalizacion;
    private String motivoHospitalizacion;
    private boolean esmalte;
    private boolean dentina;
    private boolean raiz;
    private boolean huesos;

    private boolean encia;
    private boolean insercionEpitelial;
    private boolean lengua;
    private boolean pulpa;
    private boolean velo;
    private boolean carrillos;
    private boolean sobreMordida;
    private boolean mordidaAbierta;
    private boolean desgasteBruxismo;
    private boolean anoclusion;

   

    private boolean ARespiratorio;
    private boolean ACardioPulmonar;
    private boolean ADigestivo;
    private boolean SNervioso;
    private boolean goagulacion;
    private boolean vertigos;
    private boolean diabetes;
    private boolean tiroides;
    private boolean fiebre;
    private boolean hipertencion;
    private boolean desmayos;
    private boolean embarazo;
    private boolean fuma;
    private boolean bebe;
    private boolean consumeDrogas;
    private boolean alergias;
    private String tipoAlergia;
    private String higienBucal;
    private String habitosAlimenticios;
    private String tipoConsulta;
     public HClinico(int idHC, int idPaciente, String telefono, boolean tratamiento, String tipo,
            String nombreDr, boolean tomaMedicamento, String cualMedicamento, boolean hospitalizacion,
            String motivoHospitalizacion, boolean esmalte, boolean dentina, boolean raiz, boolean huesos,
            boolean encia, boolean insercionEpitelial, boolean lengua, boolean pulpa, boolean velo, boolean carrillos,
             boolean sobreMordida, boolean mordidaAbierta, boolean desgasteBruxismo, boolean anoclusion,
            boolean ARespiratorio, boolean ACardioPulmonar, boolean ADigestivo, boolean SNervioso,
            boolean goagulacion, boolean vertigos, boolean diabetes, boolean tiroides, boolean fiebre,
            boolean hipertencion, boolean desmayos, boolean embarazo, boolean fuma, boolean bebe,
            boolean consumeDrogas, boolean alergias, String tipoAlergia, String higienBucal,
            String habitosAlimenticios, String tipoConsulta) {
        this.idHC = idHC;
        this.idPaciente = idPaciente;
        this.telefono = telefono;
        this.tratamiento = tratamiento;
        this.tipo = tipo;
        this.nombreDr = nombreDr;
        this.tomaMedicamento = tomaMedicamento;
        this.cualMedicamento = cualMedicamento;
        this.hospitalizacion = hospitalizacion;
        this.motivoHospitalizacion = motivoHospitalizacion;
        this.esmalte = esmalte;
        this.dentina = dentina;
        this.raiz = raiz;
        this.huesos = huesos;
        this.encia = encia;
        this.insercionEpitelial = insercionEpitelial;
        this.lengua = lengua;
        this.pulpa = pulpa;
        this.velo = velo;
        this.carrillos = carrillos;
        this.sobreMordida = sobreMordida;
        this.mordidaAbierta = mordidaAbierta;
        this.desgasteBruxismo = desgasteBruxismo;
        this.anoclusion = anoclusion;

        this.ARespiratorio = ARespiratorio;
        this.ACardioPulmonar = ACardioPulmonar;
        this.ADigestivo = ADigestivo;
        this.SNervioso = SNervioso;
        this.goagulacion = goagulacion;
        this.vertigos = vertigos;
        this.diabetes = diabetes;
        this.tiroides = tiroides;
        this.fiebre = fiebre;
        this.hipertencion = hipertencion;
        this.desmayos = desmayos;
        this.embarazo = embarazo;
        this.fuma = fuma;
        this.bebe = bebe;
        this.consumeDrogas = consumeDrogas;
        this.alergias = alergias;
        this.tipoAlergia = tipoAlergia;
        this.higienBucal = higienBucal;
        this.habitosAlimenticios = habitosAlimenticios;
        this.tipoConsulta = tipoConsulta;
    }

    public int getIdHC() {
        return idHC;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isTratamiento() {
        return tratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombreDr() {
        return nombreDr;
    }

    public boolean isTomaMedicamento() {
        return tomaMedicamento;
    }

    public String getCualMedicamento() {
        return cualMedicamento;
    }

    public boolean isHospitalizacion() {
        return hospitalizacion;
    }

    public String getMotivoHospitalizacion() {
        return motivoHospitalizacion;
    }

    public boolean isEsmalte() {
        return esmalte;
    }

    public boolean isDentina() {
        return dentina;
    }

    public boolean isRaiz() {
        return raiz;
    }

    public boolean isHuesos() {
        return huesos;
    }

    public boolean isEncia() {
        return encia;
    }

    public boolean isInsercionEpitelial() {
        return insercionEpitelial;
    }

    public boolean isLengua() {
        return lengua;
    }

    public boolean isPulpa() {
        return pulpa;
    }

    public boolean isVelo() {
        return velo;
    }

    public boolean isCarrillos() {
        return carrillos;
    }

    public boolean isSobreMordida() {
        return sobreMordida;
    }

    public boolean isMordidaAbierta() {
        return mordidaAbierta;
    }

    public boolean isDesgasteBruxismo() {
        return desgasteBruxismo;
    }

    public boolean isAnoclusion() {
        return anoclusion;
    }

    public boolean isARespiratorio() {
        return ARespiratorio;
    }

    public boolean isACardioPulmonar() {
        return ACardioPulmonar;
    }

    public boolean isADigestivo() {
        return ADigestivo;
    }

    public boolean isSNervioso() {
        return SNervioso;
    }

    public boolean isGoagulacion() {
        return goagulacion;
    }

    public boolean isVertigos() {
        return vertigos;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public boolean isTiroides() {
        return tiroides;
    }

    public boolean isFiebre() {
        return fiebre;
    }

    public boolean isHipertencion() {
        return hipertencion;
    }

    public boolean isDesmayos() {
        return desmayos;
    }

    public boolean isEmbarazo() {
        return embarazo;
    }

    public boolean isFuma() {
        return fuma;
    }

    public boolean isBebe() {
        return bebe;
    }

    public boolean isConsumeDrogas() {
        return consumeDrogas;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public String getTipoAlergia() {
        return tipoAlergia;
    }

    public String getHigienBucal() {
        return higienBucal;
    }

    public String getHabitosAlimenticios() {
        return habitosAlimenticios;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

}
