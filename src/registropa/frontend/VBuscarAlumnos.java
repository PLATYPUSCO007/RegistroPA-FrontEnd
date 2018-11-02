/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropa.frontend;

import Controller.EstudianteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;

/**
 *
 * @author Bautista
 */
public class VBuscarAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form VBuscarAlumnos
     */
    DefaultTableModel tmodel = new DefaultTableModel();
    EstudianteController estudiantecontroller;
    List<Estudiante> estudiantesbuscados;
    VAlumno alumno;
    String[] estudiante;

    public VBuscarAlumnos() {
        alumno = new VAlumno();
        estudiantesbuscados = new ArrayList<Estudiante>();
        estudiantecontroller = new EstudianteController();
        initComponents();
        modelotabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 350));
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nombre", "apellidos", "identificacion", "departamento", "ciudad" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 30, 110, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 20, 230, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 510, 150);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-evidence-filled-50.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 240, 100, 70);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 250, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(580, 350));
        jLabel1.setMinimumSize(new java.awt.Dimension(580, 350));
        jLabel1.setPreferredSize(new java.awt.Dimension(580, 350));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        estudiantecontroller.setCampo(jComboBox1.getSelectedItem().toString());
        estudiantecontroller.setValor(jTextField1.getText());
        datosModeloTabla();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        alumno.setVisible(true);
        alumno.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VBuscarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBuscarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBuscarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBuscarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VBuscarAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void modelotabla() {
        tmodel.addColumn("Id");
        tmodel.addColumn("Nombre");
        tmodel.addColumn("Apellido");
        tmodel.addColumn("Tipo Ident");
        tmodel.addColumn("Nº Ident");
        tmodel.addColumn("F. Ingreso");
        jTable1.setModel(tmodel);
    }

    private void datosModeloTabla(){
        try {
            tmodel.setRowCount(0);
            estudiantesbuscados = estudiantecontroller.buscarEstud();
            for (int i = 0; i < estudiantesbuscados.size(); i++) {
                estudiante = new String[]{String.valueOf(estudiantesbuscados.get(i).getId()),
                    estudiantesbuscados.get(i).getNombre(),
                    estudiantesbuscados.get(i).getApellidos(),
                    estudiantesbuscados.get(i).getTipoIdentificacion().name(),
                    String.valueOf(estudiantesbuscados.get(i).getIdentificacion()),
                    estudiantesbuscados.get(i).getFechaDeIngreso().toString()
                };
                tmodel.addRow(estudiante);
            }
        } catch (Exception e) {
        }
    }
}
