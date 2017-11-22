/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.daoCitas;
import datos.daoPacientes;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pojos.Citas;
import pojos.Pacientes;

/**
 *
 * @author danie
 */
public class frmCitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCitas
     */
    private ArrayList<Pacientes> lista;
    private frmCatalogoCitas catalogoCitas;

    public frmCitas(frmCatalogoCitas catalogoCitas) {
        imagen();
        setTitle("Agregar Cita");
        lblEvento.setText("Agregar Cita");
        btnAceptar.setText("Agregar");
        this.catalogoCitas = catalogoCitas;
        modeloCombo();
    }

    public frmCitas() {
        imagen();
        setTitle("Agregar Cita");
        lblEvento.setText("Agregar Cita");
        btnAceptar.setText("Agregar");
        modeloCombo();
    }

    public frmCitas(Citas cita, frmCatalogoCitas catalogoCitas) {
        imagen();
        setTitle("Modificar Cita");
        lblEvento.setText("Modificar");
        btnAceptar.setText("Modificar");
        this.catalogoCitas = catalogoCitas;
        modeloCombo();
        txtIdCita.setText(cita.getIdCita() + "");
        txtFecha.setText(cita.getFecha() + "");
        txtHora.setText(cita.getHora() + "");
        txaDescripcion.setText(cita.getDescripcion());
        txtCantidadPagada.setText(cita.getCantidadPagada() + "");
        txtCosto.setText(cita.getCostoTotal() + "");
        txtTratamiento.setText(cita.getTipo());
        cmbTipo.setSelectedItem(cita.getTipo());

        txtIdCita.setEditable(false);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(cita.getNombrePaciente())) {
                cmbPaciente.setSelectedIndex(i + 1);
                break;
            }
        }
    }

    private void imagen() {
        initComponents();
        JLabel lbl_Fondo = new JLabel();
        ImageIcon imagenFondo = new ImageIcon("proyecto\\frmAddProducto.jpg");
        ImageIcon imagenFondoRedimensionado = new ImageIcon(imagenFondo.getImage().getScaledInstance(this.getWidth(),
                this.getHeight(), java.awt.Image.SCALE_SMOOTH));
        lbl_Fondo.setIcon(imagenFondoRedimensionado);
        lbl_Fondo.setSize(this.getSize());
        this.setContentPane(lbl_Fondo);
        initComponents();
    }

    public void modeloCombo() {
        lista = new ArrayList<>();
        lista = new daoPacientes().ConsultarTodos();
        String array[] = new String[lista.size() + 1];
        array[0] = " ";
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                array[i + 1] = lista.get(i).getNombre() + " "
                        + lista.get(i).getApellidoP() + " " + lista.get(i).getApellidoM();
            }
            cmbPaciente.setModel(new DefaultComboBoxModel<>(array));
        } else {
            System.out.println("mal:(");
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

        lblEvento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdCita = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPaciente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTratamiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        txtCosto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadPagada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAbonar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        lblEvento.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEvento.setText("Agregar Cita");

        jLabel2.setText("idCita:");

        txtIdCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCitaActionPerformed(evt);
            }
        });

        jLabel7.setText(" AAAA-MM-DD");

        jLabel5.setText("Fecha:");

        jLabel4.setText("Hora:");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setText("Guardar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel6.setText("Descripcion:");

        jLabel3.setText("Paciente:");

        jLabel1.setText("HH:MM:SS");

        jLabel8.setText("Tratamiento:");

        txtTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTratamientoActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semanal", "Quincenal", "Mensusal" }));

        jLabel10.setText("Costo:");

        txtCantidadPagada.setEditable(false);
        txtCantidadPagada.setText("0");

        jLabel11.setText("Cantidad pagada:");

        btnAbonar.setText("Abonar");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(196, 196, 196))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addGap(6, 6, 6)))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHora)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtFecha)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtCantidadPagada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAbonar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEvento)
                    .addComponent(jLabel7))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCantidadPagada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnAbonar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCitaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            String tipo = cmbTipo.getSelectedItem().toString();
            Citas cita = new Citas(Integer.parseInt(txtIdCita.getText()),
                    cmbPaciente.getSelectedItem().toString(),
                    txaDescripcion.getText(), Date.valueOf(txtFecha.getText()), Time.valueOf(txtHora.getText()),
                    txtTratamiento.getText(), tipo, Double.parseDouble(txtCosto.getText()), Double.parseDouble(txtCantidadPagada.getText()));

            if (btnAceptar.getText().equals("Agregar")) {
                boolean s = new daoCitas().Insert(cita);
                if (s) {
                    JOptionPane.showMessageDialog(rootPane, "Cita Agregada");

                    this.dispose();
                }

            } else {
                boolean s = new daoCitas().Update(cita);
                if (s) {
                    JOptionPane.showMessageDialog(rootPane, "Cita Modificada");

                    this.dispose();
                }

            }
            if (catalogoCitas != null) {
                catalogoCitas.tabla();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error al leer los datos, algunos no cumplen con el formato correcto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTratamientoActionPerformed

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        try {
            double A = Double.parseDouble(txtCantidadPagada.getText());
            double d = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a Abonar"));
            double B = Double.parseDouble(txtCosto.getText());
            if (A + d > B) {
                txtCantidadPagada.setText(txtCosto.getText());
                JOptionPane.showMessageDialog(rootPane, "Cambio: " + ((A + d) - B));
            } else {
                txtCantidadPagada.setText((A + d) + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error al leer la Cantidad",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbonarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbPaciente;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtCantidadPagada;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCita;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}