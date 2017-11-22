/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.daoCitas;
import datos.daoPacientes;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import pojos.Citas;
import pojos.Pacientes;

/**
 *
 * @author danie
 */
public class frmCatalogoPacientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCatalogoCitas
     */
    private TableRowSorter trsFiltro;
    private frmPrincipal frmPrincipal;
    private datos.daoPacientes dPacientes;
    private ArrayList<Pacientes> lista;

    public frmPrincipal getFrmPrincipal() {
        return frmPrincipal;
    }

    public frmCatalogoPacientes(frmPrincipal frmPrincipa) {
        imagen();
        this.frmPrincipal = frmPrincipa;
        this.dPacientes = new daoPacientes();
        tabla();
    }
    private void imagen() {
        initComponents();
        JLabel lbl_Fondo = new JLabel();
        ImageIcon imagenFondo = new ImageIcon("proyecto\\fondo.jpg");
        ImageIcon imagenFondoRedimensionado = new ImageIcon(imagenFondo.getImage().getScaledInstance(this.getWidth(),
                this.getHeight(), java.awt.Image.SCALE_SMOOTH));
        lbl_Fondo.setIcon(imagenFondoRedimensionado);
        lbl_Fondo.setSize(this.getSize());
        this.setContentPane(lbl_Fondo);
       initComponents();
    }
    

    public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedIndex() == 0) {
            columnaABuscar = 0;
        } else if (comboFiltro.getSelectedIndex() == 1) {
            columnaABuscar = 1;
        } else if (comboFiltro.getSelectedIndex() == 2) {
            columnaABuscar = 2;
        } else if (comboFiltro.getSelectedIndex() == 3) {
            columnaABuscar = 3;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    public void tabla() {
        lista = dPacientes.ConsultarTodos();
        String datos[][] = new String[lista.size()][16];
        for (int i = 0; i < lista.size(); i++) {
            datos[i][0] = lista.get(i).getIdPaciente() + "";
            datos[i][1] = lista.get(i).getNombre();
            datos[i][2] = lista.get(i).getApellidoP();
            datos[i][3] = lista.get(i).getApellidoM();
            datos[i][4] = lista.get(i).getEdad() + "";
            datos[i][5] = lista.get(i).getDireccion();
            datos[i][6] = lista.get(i).getSexo();
            datos[i][7] = lista.get(i).getEstadoCivil();
            datos[i][8] = lista.get(i).getDiagnostico();
            datos[i][9] = lista.get(i).getPadecimiento();
            datos[i][10] = lista.get(i).getTratamiento();
            datos[i][11] = lista.get(i).getActividades();
            datos[i][12] = lista.get(i).getDia() + "";
            datos[i][13] = lista.get(i).getMes() + "";
            datos[i][14] = lista.get(i).getYear() + "";
            datos[i][15] = lista.get(i).isVigencia() + "";
        }
        jtCitas.setModel(new DefaultTableModel(datos, ("idPaciente,Nombre,ApellidoPaterno,"
                + "ApellidoMaterno,Edad,Direccion,Sexo,Estado Civil,"
                + "Diagnostico,Padecimiento,Tratamiento,Actividades,Dia,Mes,Año,Vigencia").split(",")));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCitas = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Catalogo de citas");

        lblEvento.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEvento.setText("Catalogo de Pacientes");

        jtCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtCitas);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setText("Agregar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idPaciente", "Nombre", "Apellido Paterno", "Apellido Materno" }));

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(lblEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEvento)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar)
                        .addComponent(btnModificar)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped

        txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        }
        );
        trsFiltro = new TableRowSorter(jtCitas.getModel());
        jtCitas.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        frmPacientes f = new frmPacientes(this);
        frmPrincipal.getDskPanel().add(f);
        Dimension desktopSize = frmPrincipal.getDskPanel().getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (jtCitas.getSelectedRow() != -1) {
            int A = Integer.parseInt(jtCitas.getValueAt(jtCitas.getSelectedRow(), 0).toString());
            frmPacientes f = new frmPacientes(this, new daoPacientes().Buscar(A));
            frmPrincipal.getDskPanel().add(f);
            Dimension desktopSize = frmPrincipal.getDskPanel().getSize();
            Dimension FrameSize = f.getSize();
            f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            f.show();

        } else {
            System.out.println("mal");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Desea Eliminar el registro?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
        if(answer==0){
        int A = Integer.parseInt(jtCitas.getValueAt(jtCitas.getSelectedRow(), 0).toString());
        boolean B = new daoPacientes().Delete(A);
        
        
        if (B) {
            JOptionPane.showMessageDialog(rootPane, "Paciente Elimindo");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error al eliminar el Paciente",
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
        tabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCitas;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}