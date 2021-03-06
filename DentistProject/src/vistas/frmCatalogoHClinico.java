/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.daoHClinico;
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
import pojos.HClinico;

/**
 *
 * @author danie
 */
public class frmCatalogoHClinico extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCatalogoHClinico
     */
    private TableRowSorter trsFiltro;
    private frmPrincipal frmPrincipal1;
    private datos.daoHClinico dHClinico;
    private ArrayList<HClinico> lista;

    public frmCatalogoHClinico(frmPrincipal frmPrincipal1) {
        imagen();
        this.frmPrincipal1 = frmPrincipal1;
        this.dHClinico = new daoHClinico();
        this.lista = new ArrayList<>();
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
        int columnaABuscar = comboFiltro.getSelectedIndex();
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    public void tabla() {
        try {
            lista = dHClinico.ConsultarTodos();
            if (lista != null) {
                String datos[][] = new String[lista.size()][6];
                for (int i = 0; i < lista.size(); i++) {
                    datos[i][0] = lista.get(i).getIdHC() + "";
                    datos[i][1] = lista.get(i).getIdPaciente() + "";
                    datos[i][2] = lista.get(i).getTelefono();
                    datos[i][3] = lista.get(i).isTratamiento() + "";
                    datos[i][4] = lista.get(i).getTipo();
                    datos[i][5] = lista.get(i).getNombreDr();
                }
                jtHClinico.setModel(new DefaultTableModel(datos, "idHClinico,idPaciente,Telefono,Tratamiento,Tipo,NombreDr".split(",")));

            }

        } catch (Exception e) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHClinico = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Catalogo de HClinicos");

        lblEvento.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEvento.setText("Catalogo de Historiales Clinicos");

        jtHClinico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtHClinico);

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

        btnAliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAliminar.setText("Eliminar");
        btnAliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar por:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idHClinico", "idPaciente", "Telefono", "Tratamiento", "Tipo", "NombreDr" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnAliminar)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(btnAliminar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        frmHClinico f = new frmHClinico(this);
        frmPrincipal1.getDskPanel().add(f);
        Dimension desktopSize = frmPrincipal1.getDskPanel().getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (jtHClinico.getSelectedRow() != -1) {
            int A = Integer.parseInt(jtHClinico.getValueAt(jtHClinico.getSelectedRow(), 0).toString());

            frmHClinico f = new frmHClinico(this, new daoHClinico().Buscar(A));

            frmPrincipal1.getDskPanel().add(f);

            f.show();

        } else {
            System.out.println("mal");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliminarActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Desea Eliminar el registro?", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
        if (answer == 0) {
            int A = Integer.parseInt(jtHClinico.getValueAt(jtHClinico.getSelectedRow(), 0).toString());
            boolean B = new daoHClinico().Delete(A);
            if (B) {
                JOptionPane.showMessageDialog(rootPane, "Historial Clinico Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ha ocurrido un error al eliminar el Historial clinico",
                        "Error", JOptionPane.ERROR_MESSAGE);

            }
            tabla();
        }
    }//GEN-LAST:event_btnAliminarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

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
        trsFiltro = new TableRowSorter(jtHClinico.getModel());
        jtHClinico.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtFiltroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtHClinico;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
