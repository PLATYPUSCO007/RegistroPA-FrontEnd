/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropa.frontend;

import Controller.EstudianteController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.Ciudades;
import modelo.Departamentos;
import modelo.Estudiante;
import modelo.Identificacion;
import org.hibernate.HibernateException;

/**
 *
 * @author Bautista
 */
public class VCrearAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form Valumnos
     */
    EstudianteController estudiantecontroller;
    VAlumno valumno;
    Estudiante estudianteactualizar;
    int actividad = 0;

    public VCrearAlumnos() {
        estudiantecontroller = new EstudianteController();
        initComponents();
        initDepartamentos();
        initCiudades();
        initTipoIden();
        actividad = 1;
    }

    public VCrearAlumnos(Estudiante estudianteactualizar) {
        estudiantecontroller = new EstudianteController();
        this.estudianteactualizar = estudianteactualizar;
        initComponents();
        initDepartamentos();
        initCiudades();
        initTipoIden();
        actividad = 2;
    }

    public EstudianteController getEstudiantecontroller() {
        return estudiantecontroller;
    }

    public void setEstudiantecontroller(EstudianteController estudiantecontroller) {
        this.estudiantecontroller = estudiantecontroller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${estudiantecontroller.estudiantenuevo.nombre}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(jTextField1);
        jTextField1.setBounds(96, 16, 355, 20);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${estudiantecontroller.estudiantenuevo.apellidos}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(jTextField2);
        jTextField2.setBounds(96, 45, 355, 20);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${estudiantecontroller.estudiantenuevo.identificacion}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(jTextField3);
        jTextField3.setBounds(96, 71, 114, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(263, 71, 188, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${estudiantenuevo.ciudad.declaringClass}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${estudiantenuevo.ciudad.declaringClass}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(25, 109, 80, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cundinamarca" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(196, 109, 93, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(25, 19, 46, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(25, 48, 46, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departamento");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(206, 135, 69, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(35, 135, 33, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Ingreso: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 135, 91, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Horario:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(214, 77, 39, 14);
        jPanel1.add(jDate);
        jDate.setBounds(356, 109, 95, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(22, 71, 56, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-790, -370, 1330, 650);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 18, 480, 170);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 200, 81, 57);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refrescar.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 200, 81, 57);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/aceptar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 200, 81, 57);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -80, 570, 420);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (actividad == 1) {
                estudiantecontroller.getEstudiantenuevo().setDepartamento(Departamentos.valueOf(jComboBox2.getSelectedItem().toString()));
                estudiantecontroller.getEstudiantenuevo().setCiudad(Ciudades.valueOf(jComboBox1.getSelectedItem().toString()));
                estudiantecontroller.getEstudiantenuevo().setTipoIdentificacion(Identificacion.valueOf(jComboBox3.getSelectedItem().toString()));
                estudiantecontroller.getEstudiantenuevo().setFechaDeIngreso(jDate.getDate());
                estudiantecontroller.guardarestudiantenuevo();
            }

            if (actividad == 2) { 
                estudianteactualizar.setNombre(jTextField1.getText());
                estudianteactualizar.setApellidos(jTextField2.getText());
                estudianteactualizar.setIdentificacion(Integer.parseInt(jTextField3.getText()));
                estudianteactualizar.setDepartamento(Departamentos.valueOf(jComboBox2.getSelectedItem().toString()));
                estudianteactualizar.setCiudad(Ciudades.valueOf(jComboBox1.getSelectedItem().toString()));
                estudianteactualizar.setTipoIdentificacion(Identificacion.valueOf(jComboBox3.getSelectedItem().toString()));
                estudianteactualizar.setFechaDeIngreso(jDate.getDate());
                estudiantecontroller.setEstudianteactualizar(estudianteactualizar);
                estudiantecontroller.editar();
            }

        } catch (HibernateException exception) {
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        valumno = new VAlumno();
        valumno.setVisible(true);
        valumno.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
        jTextField1.setText(estudianteactualizar.getNombre());
        jTextField2.setText(estudianteactualizar.getApellidos());
        jTextField3.setText(String.valueOf(estudianteactualizar.getIdentificacion()));
        jDate.setDate(estudianteactualizar.getFechaDeIngreso());
        jComboBox1.setSelectedIndex(estudianteactualizar.getCiudad().ordinal());
        jComboBox2.setSelectedIndex(estudianteactualizar.getDepartamento().ordinal());
        jComboBox3.setSelectedIndex(estudianteactualizar.getTipoIdentificacion().ordinal());
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(VCrearAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void initDepartamentos() {
        ArrayList<String> departamentos = estudiantecontroller.enumDepartamentos();
        DefaultComboBoxModel departamentosmodel = new DefaultComboBoxModel(departamentos.toArray());
        jComboBox2.setModel(departamentosmodel);
    }

    private void initCiudades() {
        ArrayList<String> ciudades = estudiantecontroller.enumCiudades();
        DefaultComboBoxModel ciudadesmodel = new DefaultComboBoxModel(ciudades.toArray());
        jComboBox1.setModel(ciudadesmodel);
    }

    private void initTipoIden() {
        ArrayList<String> tipoIdentificacion = estudiantecontroller.enumIdentificacion();
        DefaultComboBoxModel tipoidenmodel = new DefaultComboBoxModel(tipoIdentificacion.toArray());
        jComboBox3.setModel(tipoidenmodel);
    }

    private void Limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
        jDate.setDate(new Date());
    }
}
