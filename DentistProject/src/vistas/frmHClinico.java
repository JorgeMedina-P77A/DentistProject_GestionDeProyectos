/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.daoHClinico;
import datos.daoPacientes;
import javax.swing.JOptionPane;
import pojos.HClinico;

/**
 *
 * @author danie
 */
public class frmHClinico extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmHClinico
     */
    private frmCatalogoHClinico catalogoHClinico;

    public frmHClinico() {
        initComponents();
    }

    public frmHClinico(HClinico h) {
        initComponents();
        llenarEspacions(h);
    }

    public frmHClinico(frmCatalogoHClinico catalogoHClinico) {
        initComponents();
        this.catalogoHClinico = catalogoHClinico;
    }

    public frmHClinico(frmCatalogoHClinico catalogoHClinico, HClinico h) {
        initComponents();
        this.catalogoHClinico = catalogoHClinico;
        llenarEspacions(h);
    }

    public void llenarEspacions(HClinico h) {
        pojos.Pacientes p = new daoPacientes().Buscar(h.getIdPaciente());
        this.lblNombre.setText(p.getNombre() + " " + p.getApellidoP() + " " + p.getApellidoM());
        this.lblDomicilio.setText(p.getDireccion());
        this.lblEdad.setText(p.getEdad() + "");

        this.btnAceptar.setText("Modificar");
        this.catalogoHClinico = catalogoHClinico;
        this.txtIdPaciente.setText(h.getIdPaciente() + "");
        this.txtIdHC.setText(h.getIdHC() + "");
        this.txtIdHC.setEditable(false);
        this.txtTelefono.setText(h.getTelefono());
        if (h.isTratamiento()) {
            this.tratamientoSi.setSelected(true);
            this.tipoMedico.setEnabled(true);
            this.tipoDental.setEnabled(true);
        } else {
            this.tratamientoNo.setSelected(true);
        }
        if (h.getTipo().equalsIgnoreCase("Medico")) {
            this.tipoMedico.setSelected(true);

        } else if (h.getTipo().equalsIgnoreCase("Dental")) {
            this.tipoDental.setSelected(true);
        }
        this.txtNombreDr.setText(h.getNombreDr());
        if (h.isTomaMedicamento()) {
            this.medicamentoSi.setSelected(true);
        } else {
            this.medicamentoNo.setSelected(true);
            this.txtCualMedicamento.setEditable(false);
        }
        this.txtCualMedicamento.setText(h.getCualMedicamento());
        if (h.isHospitalizacion()) {
            this.hospitalizadoSi.setSelected(true);
        } else {
            this.hospitalizadoNo.setSelected(true);
            this.txtMotivo.setEditable(false);
        }
        this.txtMotivo.setText(h.getMotivoHospitalizacion());

        this.chkEsmalte.setSelected(h.isEsmalte());
        this.chkDentina.setSelected(h.isDentina());
        this.chkRaiz.setSelected(h.isRaiz());
        this.chkHuesos.setSelected(h.isHuesos());
        this.chkEncia.setSelected(h.isEncia());
        this.chkInsersion.setSelected(h.isInsercionEpitelial());
        this.chkLengua.setSelected(h.isLengua());
        this.chkPulpa.setSelected(h.isPulpa());
        this.chkVelo.setSelected(h.isVelo());
        this.chkCarrillos.setSelected(h.isCarrillos());
        this.chkSobreMordida.setSelected(h.isSobreMordida());
        this.chkMordidaAbierta.setSelected(h.isMordidaAbierta());
        this.chkDesgaste.setSelected(h.isDesgasteBruxismo());
        this.chkAnoclusion.setSelected(h.isAnoclusion());

        this.chkARespiratorio.setSelected(h.isARespiratorio());
        this.chkACardiobascular.setSelected(h.isACardioPulmonar());
        this.chkADigestivo.setSelected(h.isADigestivo());
        this.chkSNervioso.setSelected(h.isSNervioso());
        this.chkGoagulacion.setSelected(h.isGoagulacion());
        this.chkVertigos.setSelected(h.isVertigos());
        this.chkDiabetes.setSelected(h.isDiabetes());
        this.chkTiroides.setSelected(h.isTiroides());
        this.chkFiebre.setSelected(h.isFiebre());
        this.chkHipertension.setSelected(h.isHipertencion());
        this.chkDesmayos.setSelected(h.isDesmayos());
        if (h.isEmbarazo()) {
            this.embarazadaSi.setSelected(true);
        } else {
            this.embarazadaNo.setSelected(true);
        }
        if (h.isFuma()) {
            this.fumaSi.setSelected(true);
        } else {
            this.FumaNo.setSelected(true);
        }
        if (h.isConsumeDrogas()) {
            this.drogasSi.setSelected(true);
        } else {
            this.drogasNo.setSelected(true);
        }
        if (h.isAlergias()) {
            this.AlergiasSi.setSelected(true);
        } else {
            this.AlergiasNo.setSelected(true);
            this.txtEspecifique.setEditable(false);
        }
        this.txtEspecifique.setText(h.getTipoAlergia());
        if (h.getHigienBucal().equalsIgnoreCase("Buena")) {
            this.chkHgBuena.setSelected(true);
        } else {
            this.chkHigMala.setSelected(true);
        }
        if (h.getHabitosAlimenticios().equalsIgnoreCase("Buena")) {
            this.AlBuena.setSelected(true);
        } else {
            this.AlMala.setSelected(true);
        }

        if (h.getTipoConsulta().equalsIgnoreCase("Emergencia")) {
            this.chkEmergencia.setSelected(true);
        } else if (h.getTipoConsulta().equalsIgnoreCase("Revision")) {
            this.chkRevision.setSelected(true);
        } else if (h.getTipoConsulta().equalsIgnoreCase("Puente")) {
            this.chkPuente.setSelected(true);
        } else if (h.getTipoConsulta().equalsIgnoreCase("Lesion caries")) {
            this.chkLesion.setSelected(true);
        } else if (h.getTipoConsulta().equalsIgnoreCase("Limpieza")) {
            this.chkLimpieza.setSelected(true);
        } else if (h.getTipoConsulta().equalsIgnoreCase("Extraccion")) {
            this.chkExtraccion.setSelected(true);
        } else if (h.getTipoConsulta().equalsIgnoreCase("Prostodoncia")) {
            this.chkProstodoncia.setSelected(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdHC = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblDomicilio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tratamientoSi = new javax.swing.JCheckBox();
        tratamientoNo = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tipoMedico = new javax.swing.JCheckBox();
        tipoDental = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtNombreDr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        medicamentoSi = new javax.swing.JCheckBox();
        medicamentoNo = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        txtCualMedicamento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hospitalizadoSi = new javax.swing.JCheckBox();
        hospitalizadoNo = new javax.swing.JCheckBox();
        txtMotivo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        chkEsmalte = new javax.swing.JCheckBox();
        chkDentina = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        chkRaiz = new javax.swing.JCheckBox();
        chkHuesos = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        chkEncia = new javax.swing.JCheckBox();
        chkInsersion = new javax.swing.JCheckBox();
        chkLengua = new javax.swing.JCheckBox();
        chkPulpa = new javax.swing.JCheckBox();
        chkVelo = new javax.swing.JCheckBox();
        chkCarrillos = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        chkSobreMordida = new javax.swing.JCheckBox();
        chkMordidaAbierta = new javax.swing.JCheckBox();
        chkDesgaste = new javax.swing.JCheckBox();
        chkAnoclusion = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        chkARespiratorio = new javax.swing.JCheckBox();
        chkACardiobascular = new javax.swing.JCheckBox();
        chkADigestivo = new javax.swing.JCheckBox();
        chkGoagulacion = new javax.swing.JCheckBox();
        chkSNervioso = new javax.swing.JCheckBox();
        chkVertigos = new javax.swing.JCheckBox();
        chkDiabetes = new javax.swing.JCheckBox();
        chkTiroides = new javax.swing.JCheckBox();
        chkFiebre = new javax.swing.JCheckBox();
        chkHipertension = new javax.swing.JCheckBox();
        chkDesmayos = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        embarazadaSi = new javax.swing.JCheckBox();
        embarazadaNo = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        fumaSi = new javax.swing.JCheckBox();
        FumaNo = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        bebeSi = new javax.swing.JCheckBox();
        bebeNo = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        drogasSi = new javax.swing.JCheckBox();
        drogasNo = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        AlergiasSi = new javax.swing.JCheckBox();
        AlergiasNo = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        txtEspecifique = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        chkHgBuena = new javax.swing.JCheckBox();
        chkHigMala = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        AlBuena = new javax.swing.JCheckBox();
        AlMala = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        chkEmergencia = new javax.swing.JCheckBox();
        chkRevision = new javax.swing.JCheckBox();
        chkProstodoncia = new javax.swing.JCheckBox();
        chkLesion = new javax.swing.JCheckBox();
        chkLimpieza = new javax.swing.JCheckBox();
        chkPuente = new javax.swing.JCheckBox();
        chkExtraccion = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Historial clinico");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Nombre del Paciente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("ID del Paciente:");

        txtIdPaciente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtIdPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPacienteKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("IDHC:");

        txtIdHC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblNombre.setText("        ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Domicilio:");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        lblDomicilio.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblDomicilio.setText("       ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Edad:");

        lblEdad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblEdad.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Telefono/Celular:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Esta bajo Tratamiento:");

        buttonGroup1.add(tratamientoSi);
        tratamientoSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tratamientoSi.setText("Si");
        tratamientoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamientoSiActionPerformed(evt);
            }
        });

        buttonGroup1.add(tratamientoNo);
        tratamientoNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tratamientoNo.setText("No");
        tratamientoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamientoNoActionPerformed(evt);
            }
        });

        btnAceptar.setText("Agregar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Tipo");

        tipoMedico.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tipoMedico.setText("Medico");
        tipoMedico.setEnabled(false);

        tipoDental.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tipoDental.setText("Dental");
        tipoDental.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Nombre de su Dr:");

        txtNombreDr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Toma algun medicamento:");

        buttonGroup2.add(medicamentoSi);
        medicamentoSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        medicamentoSi.setText("Si");
        medicamentoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicamentoSiActionPerformed(evt);
            }
        });

        buttonGroup2.add(medicamentoNo);
        medicamentoNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        medicamentoNo.setText("No");
        medicamentoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicamentoNoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("Cual:");

        txtCualMedicamento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Ha sido Hospitalizado:");

        buttonGroup3.add(hospitalizadoSi);
        hospitalizadoSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        hospitalizadoSi.setText("Si");
        hospitalizadoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalizadoSiActionPerformed(evt);
            }
        });

        buttonGroup3.add(hospitalizadoNo);
        hospitalizadoNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        hospitalizadoNo.setText("No");
        hospitalizadoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalizadoNoActionPerformed(evt);
            }
        });

        txtMotivo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(102, 102, 255));
        jLabel15.setText("EXAMEN DE TEJIDOS");

        jLabel16.setBackground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("DUROS");

        chkEsmalte.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkEsmalte.setText("Esmalte");

        chkDentina.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkDentina.setText("Dentina");

        jLabel17.setText("Rx");

        chkRaiz.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkRaiz.setText("Raiz");

        chkHuesos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkHuesos.setText("Huesos");

        jLabel18.setBackground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("BLANDOS");

        chkEncia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkEncia.setText("Encia");

        chkInsersion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkInsersion.setText("Insersion Epitelial");

        chkLengua.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkLengua.setText("Lengua");

        chkPulpa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkPulpa.setText("Pulpa (alteraciones)");

        chkVelo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkVelo.setText("Velo del paladar");

        chkCarrillos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkCarrillos.setText("Carrillos");

        jLabel19.setText("OCLUSION");

        chkSobreMordida.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkSobreMordida.setText("Sobre mordida H-V");

        chkMordidaAbierta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkMordidaAbierta.setText("Mordida abierta");

        chkDesgaste.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkDesgaste.setText("Desgaste bruxismo");

        chkAnoclusion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkAnoclusion.setText("Anoclusion");

        jLabel20.setText("ANTECEDENTES PERSONALES");

        chkARespiratorio.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkARespiratorio.setText("Aparato Respiratorio");

        chkACardiobascular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkACardiobascular.setText("Aparato Cardiobascular");

        chkADigestivo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkADigestivo.setText("Aparato Digestivo");

        chkGoagulacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkGoagulacion.setText("Problemas de Goagulacion");

        chkSNervioso.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkSNervioso.setText("Sistema Nervioso");

        chkVertigos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkVertigos.setText("Vertigos y Mareos");

        chkDiabetes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkDiabetes.setText("Diabetes");

        chkTiroides.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkTiroides.setText("Tiroides");

        chkFiebre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkFiebre.setText("Fiebre Reumatica");

        chkHipertension.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkHipertension.setText("Hipertension");

        chkDesmayos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkDesmayos.setText("Desmayos");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("Se encuentra embarazada:");

        buttonGroup4.add(embarazadaSi);
        embarazadaSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        embarazadaSi.setText("Si");

        buttonGroup4.add(embarazadaNo);
        embarazadaNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        embarazadaNo.setText("No");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("Fuma:");

        buttonGroup6.add(fumaSi);
        fumaSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fumaSi.setText("Si");

        buttonGroup6.add(FumaNo);
        FumaNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        FumaNo.setText("No");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setText("Bebe alcohol:");

        buttonGroup5.add(bebeSi);
        bebeSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bebeSi.setText("Si");

        buttonGroup5.add(bebeNo);
        bebeNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bebeNo.setText("No");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setText("Consume drogas:");

        buttonGroup7.add(drogasSi);
        drogasSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        drogasSi.setText("Si");

        buttonGroup7.add(drogasNo);
        drogasNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        drogasNo.setText("No");

        jLabel26.setBackground(new java.awt.Color(0, 102, 255));
        jLabel26.setText("Alergias:");

        buttonGroup8.add(AlergiasSi);
        AlergiasSi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AlergiasSi.setText("Si");

        buttonGroup8.add(AlergiasNo);
        AlergiasNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AlergiasNo.setText("No");

        jLabel27.setText("Especifique:");

        txtEspecifique.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel28.setBackground(new java.awt.Color(102, 51, 255));
        jLabel28.setText("Higiene Bucal:");

        buttonGroup9.add(chkHgBuena);
        chkHgBuena.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkHgBuena.setText("Buena");

        buttonGroup9.add(chkHigMala);
        chkHigMala.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkHigMala.setText("Mala");

        jLabel29.setText("Habitos de Alimentacion:");

        buttonGroup10.add(AlBuena);
        AlBuena.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AlBuena.setText("Buena");

        buttonGroup10.add(AlMala);
        AlMala.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AlMala.setText("Mala");

        jLabel30.setText("TIPO DE CONSULTA");

        buttonGroup11.add(chkEmergencia);
        chkEmergencia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkEmergencia.setText("Emergencia");

        buttonGroup11.add(chkRevision);
        chkRevision.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkRevision.setText("Revision");

        buttonGroup11.add(chkProstodoncia);
        chkProstodoncia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkProstodoncia.setText("Prostodoncia");

        buttonGroup11.add(chkLesion);
        chkLesion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkLesion.setText("Lesion caries");

        buttonGroup11.add(chkLimpieza);
        chkLimpieza.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkLimpieza.setText("Limpieza");

        buttonGroup11.add(chkPuente);
        chkPuente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkPuente.setText("Puente");

        buttonGroup11.add(chkExtraccion);
        chkExtraccion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkExtraccion.setText("Extraccion");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel31.setText("Motivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdHC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tratamientoSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tratamientoNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoMedico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoDental)
                                .addGap(39, 39, 39))
                            .addComponent(txtNombreDr)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicamentoSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicamentoNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCualMedicamento))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkDentina, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hospitalizadoSi))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hospitalizadoNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(txtMotivo))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(embarazadaSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(embarazadaNo)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkADigestivo)
                                            .addComponent(chkSNervioso))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkFiebre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkHipertension, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkACardiobascular)
                                            .addComponent(chkARespiratorio))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkTiroides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(chkDiabetes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(chkVertigos)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel22)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(fumaSi)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(FumaNo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel23)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(bebeSi)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(bebeNo))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel25)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(drogasSi)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(drogasNo))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(AlergiasSi)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(AlergiasNo)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(txtEspecifique))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(AlBuena)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(AlMala))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(chkHgBuena)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(chkHigMala))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkGoagulacion)
                                        .addGap(12, 12, 12)
                                        .addComponent(chkDesmayos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(chkCarrillos)
                    .addComponent(chkVelo)
                    .addComponent(chkInsersion)
                    .addComponent(chkEncia)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addComponent(chkSobreMordida)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEsmalte)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkRaiz)
                        .addGap(18, 18, 18)
                        .addComponent(chkHuesos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkLengua)
                    .addComponent(chkPulpa)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMordidaAbierta)
                            .addComponent(chkDesgaste)
                            .addComponent(chkAnoclusion))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkProstodoncia)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chkLesion)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkLimpieza))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chkEmergencia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(chkRevision)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkPuente)
                                            .addComponent(chkExtraccion))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDomicilio)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tratamientoSi)
                    .addComponent(tratamientoNo)
                    .addComponent(jLabel10)
                    .addComponent(tipoMedico)
                    .addComponent(tipoDental))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNombreDr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(medicamentoSi)
                    .addComponent(medicamentoNo)
                    .addComponent(jLabel13)
                    .addComponent(txtCualMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(hospitalizadoSi)
                    .addComponent(hospitalizadoNo)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(chkARespiratorio)
                    .addComponent(chkDiabetes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEsmalte)
                    .addComponent(chkDentina)
                    .addComponent(chkACardiobascular)
                    .addComponent(chkTiroides))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(chkADigestivo)
                    .addComponent(chkFiebre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRaiz)
                    .addComponent(chkHuesos)
                    .addComponent(chkSNervioso)
                    .addComponent(chkHipertension))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(chkGoagulacion)
                    .addComponent(chkDesmayos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEncia)
                    .addComponent(chkVertigos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkInsersion)
                    .addComponent(jLabel21)
                    .addComponent(embarazadaSi)
                    .addComponent(embarazadaNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(fumaSi)
                        .addComponent(FumaNo)
                        .addComponent(jLabel23)
                        .addComponent(bebeSi)
                        .addComponent(bebeNo))
                    .addComponent(chkLengua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPulpa)
                    .addComponent(jLabel25)
                    .addComponent(drogasSi)
                    .addComponent(drogasNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkVelo)
                    .addComponent(jLabel26)
                    .addComponent(AlergiasSi)
                    .addComponent(AlergiasNo)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCarrillos)
                    .addComponent(txtEspecifique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel28)
                    .addComponent(chkHgBuena)
                    .addComponent(chkHigMala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSobreMordida)
                    .addComponent(jLabel29)
                    .addComponent(AlBuena)
                    .addComponent(AlMala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMordidaAbierta)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDesgaste)
                    .addComponent(chkEmergencia)
                    .addComponent(chkRevision)
                    .addComponent(chkPuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAnoclusion)
                    .addComponent(chkLesion)
                    .addComponent(chkLimpieza)
                    .addComponent(chkExtraccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkProstodoncia))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {

            String tipoTratamiento = "";
            String tipoConsulta = "";
            if (tipoMedico.isSelected()) {
                tipoTratamiento = "Medico";
            } else if (tipoDental.isSelected()) {
                tipoTratamiento = "Dental";
            }
            if (chkEmergencia.isSelected()) {
                tipoConsulta = "Emergencia";
            } else if (chkRevision.isSelected()) {
                tipoConsulta = "Revision";
            } else if (chkPuente.isSelected()) {
                tipoConsulta = "Puente";
            } else if (chkLesion.isSelected()) {
                tipoConsulta = "Lesion caries";
            } else if (chkLimpieza.isSelected()) {
                tipoConsulta = "Limpieza";
            } else if (chkExtraccion.isSelected()) {
                tipoConsulta = "Extraccion";
            } else if (chkProstodoncia.isSelected()) {
                tipoConsulta = "Prostodoncia";
            }

            HClinico h = new HClinico(Integer.parseInt(txtIdHC.getText()),
                    Integer.parseInt(txtIdPaciente.getText()),
                    txtTelefono.getText(), tratamientoSi.isSelected(), tipoTratamiento, txtNombreDr.getText(), medicamentoSi.isSelected(),
                    txtCualMedicamento.getText() == null ? "" : txtCualMedicamento.getText(),
                    hospitalizadoSi.isSelected(), txtMotivo.getText() == null ? "" : txtMotivo.getText(),
                    chkEsmalte.isSelected(), chkDentina.isSelected(), chkRaiz.isSelected(), chkHuesos.isSelected(), chkEncia.isSelected(),
                    chkInsersion.isSelected(), chkLengua.isSelected(), chkPulpa.isSelected(), chkVelo.isSelected(), chkCarrillos.isSelected(),
                    chkSobreMordida.isSelected(), chkMordidaAbierta.isSelected(), chkDesgaste.isSelected(), chkAnoclusion.isSelected(),
                    chkARespiratorio.isSelected(), chkACardiobascular.isSelected(),
                    chkADigestivo.isSelected(), chkSNervioso.isSelected(), chkGoagulacion.isSelected(),
                    chkVertigos.isSelected(), chkDiabetes.isSelected(), chkTiroides.isSelected(), chkFiebre.isSelected(),
                    chkHipertension.isSelected(), chkDesmayos.isSelected(), embarazadaSi.isSelected(), fumaSi.isSelected(),
                    bebeSi.isSelected(), drogasSi.isSelected(), AlergiasSi.isSelected(),
                    txtEspecifique.getText() == null ? "" : txtEspecifique.getText(),
                    chkHgBuena.isSelected() ? "Buena" : "Mala", AlBuena.isSelected() ? "Buena" : "Mala", tipoConsulta);

            if (btnAceptar.getText().equals("Agregar")) {
                boolean s = new daoHClinico().Insert(h);
                if (s) {
                    JOptionPane.showMessageDialog(rootPane, "Historial Clinico Agregado");

                    this.dispose();
                }
            } else {
                boolean s = new daoHClinico().Update(h);
                if (s) {
                    JOptionPane.showMessageDialog(rootPane, "Historial Clinio Modificado");

                    this.dispose();
                }
            }
            if (catalogoHClinico != null) {
                catalogoHClinico.tabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error al leer los datos, algunos no cumplen con el formato correcto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void medicamentoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicamentoSiActionPerformed
        txtCualMedicamento.setEditable(true);
    }//GEN-LAST:event_medicamentoSiActionPerformed

    private void medicamentoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicamentoNoActionPerformed
        txtCualMedicamento.setEditable(false);
    }//GEN-LAST:event_medicamentoNoActionPerformed

    private void hospitalizadoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalizadoSiActionPerformed
        txtMotivo.setEditable(true);
    }//GEN-LAST:event_hospitalizadoSiActionPerformed

    private void hospitalizadoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalizadoNoActionPerformed
        txtMotivo.setEditable(false);
    }//GEN-LAST:event_hospitalizadoNoActionPerformed

    private void txtIdPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPacienteKeyPressed
        if (evt.getExtendedKeyCode() == 10) {
            pojos.Pacientes p = new daoPacientes().Buscar(Integer.parseInt(txtIdPaciente.getText()));
            if (p != null) {
                lblNombre.setText(p.getNombre() + " " + p.getApellidoP() + " " + p.getApellidoM());
                lblDomicilio.setText(p.getDireccion());
                lblEdad.setText(p.getEdad() + "");
                JOptionPane.showMessageDialog(rootPane, "Conectsdo", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Paciente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtIdPacienteKeyPressed

    private void tratamientoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamientoNoActionPerformed
        tipoDental.setEnabled(false);
        tipoMedico.setEnabled(false);
        tipoDental.setSelected(false);
        tipoMedico.setSelected(false);
    }//GEN-LAST:event_tratamientoNoActionPerformed

    private void tratamientoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamientoSiActionPerformed
        tipoDental.setEnabled(true);
        tipoMedico.setEnabled(true);
    }//GEN-LAST:event_tratamientoSiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AlBuena;
    private javax.swing.JCheckBox AlMala;
    private javax.swing.JCheckBox AlergiasNo;
    private javax.swing.JCheckBox AlergiasSi;
    private javax.swing.JCheckBox FumaNo;
    private javax.swing.JCheckBox bebeNo;
    private javax.swing.JCheckBox bebeSi;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox chkACardiobascular;
    private javax.swing.JCheckBox chkADigestivo;
    private javax.swing.JCheckBox chkARespiratorio;
    private javax.swing.JCheckBox chkAnoclusion;
    private javax.swing.JCheckBox chkCarrillos;
    private javax.swing.JCheckBox chkDentina;
    private javax.swing.JCheckBox chkDesgaste;
    private javax.swing.JCheckBox chkDesmayos;
    private javax.swing.JCheckBox chkDiabetes;
    private javax.swing.JCheckBox chkEmergencia;
    private javax.swing.JCheckBox chkEncia;
    private javax.swing.JCheckBox chkEsmalte;
    private javax.swing.JCheckBox chkExtraccion;
    private javax.swing.JCheckBox chkFiebre;
    private javax.swing.JCheckBox chkGoagulacion;
    private javax.swing.JCheckBox chkHgBuena;
    private javax.swing.JCheckBox chkHigMala;
    private javax.swing.JCheckBox chkHipertension;
    private javax.swing.JCheckBox chkHuesos;
    private javax.swing.JCheckBox chkInsersion;
    private javax.swing.JCheckBox chkLengua;
    private javax.swing.JCheckBox chkLesion;
    private javax.swing.JCheckBox chkLimpieza;
    private javax.swing.JCheckBox chkMordidaAbierta;
    private javax.swing.JCheckBox chkProstodoncia;
    private javax.swing.JCheckBox chkPuente;
    private javax.swing.JCheckBox chkPulpa;
    private javax.swing.JCheckBox chkRaiz;
    private javax.swing.JCheckBox chkRevision;
    private javax.swing.JCheckBox chkSNervioso;
    private javax.swing.JCheckBox chkSobreMordida;
    private javax.swing.JCheckBox chkTiroides;
    private javax.swing.JCheckBox chkVelo;
    private javax.swing.JCheckBox chkVertigos;
    private javax.swing.JCheckBox drogasNo;
    private javax.swing.JCheckBox drogasSi;
    private javax.swing.JCheckBox embarazadaNo;
    private javax.swing.JCheckBox embarazadaSi;
    private javax.swing.JCheckBox fumaSi;
    private javax.swing.JCheckBox hospitalizadoNo;
    private javax.swing.JCheckBox hospitalizadoSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JCheckBox medicamentoNo;
    private javax.swing.JCheckBox medicamentoSi;
    private javax.swing.JCheckBox tipoDental;
    private javax.swing.JCheckBox tipoMedico;
    private javax.swing.JCheckBox tratamientoNo;
    private javax.swing.JCheckBox tratamientoSi;
    private javax.swing.JTextField txtCualMedicamento;
    private javax.swing.JTextField txtEspecifique;
    private javax.swing.JTextField txtIdHC;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNombreDr;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
