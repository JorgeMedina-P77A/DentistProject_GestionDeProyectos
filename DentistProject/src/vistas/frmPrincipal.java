/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the templat
e in the editor.
 */
package vistas;

import datos.Conexion;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        imagen();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Principal");
        Conexion.conecta();
    }

    public JDesktopPane getDskPanel() {
        return dskPanel;
    }

    private void imagen() {
        JLabel lbl_Fondo = new JLabel();
        ImageIcon imagenFondo = new ImageIcon("proyecto\\principal.jpg");
        ImageIcon imagenFondoRedimensionado = new ImageIcon(imagenFondo.getImage().getScaledInstance(1370,
                700, java.awt.Image.SCALE_SMOOTH));
        lbl_Fondo.setIcon(imagenFondoRedimensionado);
        lbl_Fondo.setSize(1400, 720);
        dskPanel.add(lbl_Fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAgenda = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        itmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmCitas = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout dskPanelLayout = new javax.swing.GroupLayout(dskPanel);
        dskPanel.setLayout(dskPanelLayout);
        dskPanelLayout.setHorizontalGroup(
            dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        dskPanelLayout.setVerticalGroup(
            dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        itmAgenda.setText("Cita");
        itmAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAgendaActionPerformed(evt);
            }
        });
        jMenu1.add(itmAgenda);

        jMenuItem2.setText("Paciente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setText("Historial Clinico");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Producto");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        itmSalir.setText("Salir");
        itmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(itmSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Catalogos");

        itmCitas.setText("Citas");
        itmCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCitasActionPerformed(evt);
            }
        });
        jMenu2.add(itmCitas);

        jMenuItem4.setText("Pacientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Historiales Clinicos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Reportes");

        jMenuItem3.setText("Manual de Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem8.setText("Manual Técnico");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAgendaActionPerformed
        frmCitas f = new frmCitas();
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_itmAgendaActionPerformed

    private void itmCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCitasActionPerformed
        frmCatalogoCitas f = new frmCatalogoCitas(this);
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_itmCitasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        frmCatalogoPacientes f = new frmCatalogoPacientes(this);
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        frmCatalogoHClinico f = new frmCatalogoHClinico(this);
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmCatalogoProductos f = new frmCatalogoProductos(this);
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmPacientes f = new frmPacientes();
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        frmHClinico f = new frmHClinico();
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        frmProductos f = new frmProductos();
        dskPanel.add(f);
        Dimension desktopSize = dskPanel.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        f.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void itmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSalirActionPerformed
        this.dispose();

    }//GEN-LAST:event_itmSalirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"proyecto\\Manual de Usuario.pdf");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"proyecto\\Manual Tecnico.pdf");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPanel;
    private javax.swing.JMenuItem itmAgenda;
    private javax.swing.JMenuItem itmCitas;
    private javax.swing.JMenuItem itmSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
