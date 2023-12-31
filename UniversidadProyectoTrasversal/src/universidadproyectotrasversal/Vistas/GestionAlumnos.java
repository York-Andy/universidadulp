/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadproyectotrasversal.Vistas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import universidadproyectotrasversal.AccesoAdatos.AlumnoData;
import universidadproyectotrasversal.Entidades.Alumno;
import java.util.Date;
import javax.management.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class GestionAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionAlumnos
     */
    public GestionAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpescritorioAlumno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        Jtapellido = new javax.swing.JTextField();
        Jtnombre = new javax.swing.JTextField();
        Jrbestado = new javax.swing.JRadioButton();
        Jbnuevo = new javax.swing.JButton();
        Jbeliminar = new javax.swing.JButton();
        Jbguardar = new javax.swing.JButton();
        Jbsalir = new javax.swing.JButton();
        Jbuscar = new javax.swing.JButton();
        jdcFechaDenacimiento = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        JpescritorioAlumno.setBackground(new java.awt.Color(0, 255, 0));
        JpescritorioAlumno.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ALUMNO");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Documento:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de nacimiento:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estado:");

        jtdni.setBackground(new java.awt.Color(204, 255, 204));

        Jtapellido.setBackground(new java.awt.Color(204, 255, 204));

        Jtnombre.setBackground(new java.awt.Color(204, 255, 204));

        Jrbestado.setBackground(new java.awt.Color(204, 255, 204));
        Jrbestado.setForeground(new java.awt.Color(0, 0, 0));
        Jrbestado.setText("Marque si esta activo");

        Jbnuevo.setBackground(new java.awt.Color(153, 255, 102));
        Jbnuevo.setForeground(new java.awt.Color(0, 0, 0));
        Jbnuevo.setText("Nuevo");
        Jbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnuevoActionPerformed(evt);
            }
        });

        Jbeliminar.setBackground(new java.awt.Color(153, 255, 102));
        Jbeliminar.setForeground(new java.awt.Color(0, 0, 0));
        Jbeliminar.setText("Eliminar");
        Jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbeliminarActionPerformed(evt);
            }
        });

        Jbguardar.setBackground(new java.awt.Color(153, 255, 102));
        Jbguardar.setForeground(new java.awt.Color(0, 0, 0));
        Jbguardar.setText("Guardar");
        Jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbguardarActionPerformed(evt);
            }
        });

        Jbsalir.setBackground(new java.awt.Color(153, 255, 102));
        Jbsalir.setForeground(new java.awt.Color(0, 0, 0));
        Jbsalir.setText("Salir");
        Jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbsalirActionPerformed(evt);
            }
        });

        Jbuscar.setBackground(new java.awt.Color(204, 255, 204));
        Jbuscar.setForeground(new java.awt.Color(0, 0, 0));
        Jbuscar.setText("Buscar");
        Jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuscarActionPerformed(evt);
            }
        });

        jdcFechaDenacimiento.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout JpescritorioAlumnoLayout = new javax.swing.GroupLayout(JpescritorioAlumno);
        JpescritorioAlumno.setLayout(JpescritorioAlumnoLayout);
        JpescritorioAlumnoLayout.setHorizontalGroup(
            JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcFechaDenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                                        .addComponent(Jbnuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jbeliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jbguardar))
                                    .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                                        .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(50, 50, 50)
                                        .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jrbestado)
                                            .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Jtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(Jtapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtdni, javax.swing.GroupLayout.Alignment.LEADING)))))
                                .addGap(18, 18, 18)
                                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jbuscar)
                                    .addComponent(Jbsalir))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        JpescritorioAlumnoLayout.setVerticalGroup(
            JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpescritorioAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbuscar))
                .addGap(21, 21, 21)
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jrbestado))
                .addGap(18, 18, 18)
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jdcFechaDenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(JpescritorioAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbnuevo)
                    .addComponent(Jbeliminar)
                    .addComponent(Jbguardar)
                    .addComponent(Jbsalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpescritorioAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpescritorioAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuscarActionPerformed
      AlumnoData alu =new AlumnoData ();
      int dni =Integer.parseInt(jtdni.getText());
      Alumno alumno =new Alumno();
     alu.buscarAlumnoPorDni(dni);
     if(alumno!=null    ){
     JOptionPane.showMessageDialog(null, "el alumno fue encontrado");
     
     }else{
     JOptionPane.showMessageDialog(null, "el alumno que busca no existe en base de datos");
     }
      
    }//GEN-LAST:event_JbuscarActionPerformed

    private void JbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbguardarActionPerformed
      AlumnoData  alu = new AlumnoData();
      //Carga de datos por ventana
      int dni =Integer.parseInt(jtdni.getText());
      String apellido =Jtapellido.getText();
      String nombre =Jtnombre.getText();
      LocalDate fechaNac =jdcFechaDenacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      Boolean estado = Jrbestado.isSelected();
      //de datos en mi alumno y alumnoData
      Alumno alumno =new Alumno(dni, apellido, nombre, fechaNac, true);
      alu.guardarAlumno(alumno);
      
    }//GEN-LAST:event_JbguardarActionPerformed

    private void JbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnuevoActionPerformed
     AlumnoData alu = new  AlumnoData();
     
   //Obtener valores de campo
     int dni =Integer.parseInt(jtdni.getText());
     String apellido =Jtapellido.getText();
     String nombre =Jtnombre.getText();
     LocalDate fechaNac =jdcFechaDenacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
     Boolean estado = true;
     //Crear una instancia alumno
     Alumno alumno =new Alumno(dni, apellido, nombre, fechaNac, true);
     //Crear una instancia guardar alumno
     alu.guardarAlumno(alumno);
    
     
    }//GEN-LAST:event_JbnuevoActionPerformed

    private void JbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbeliminarActionPerformed
     AlumnoData alu =new AlumnoData();
     Alumno alumno =new Alumno();
     alu.eliminarAlumno(WIDTH);
    }//GEN-LAST:event_JbeliminarActionPerformed

    private void JbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbsalirActionPerformed
      dispose();    
    }//GEN-LAST:event_JbsalirActionPerformed
//   public   Alumno NumeroDocumento(int dni){
//   AlumnoData alu =new AlumnoData();
//   Alumno alumno =new Alumno();
//   
//   
//   
//   
//   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbeliminar;
    private javax.swing.JButton Jbguardar;
    private javax.swing.JButton Jbnuevo;
    private javax.swing.JButton Jbsalir;
    private javax.swing.JButton Jbuscar;
    private javax.swing.JPanel JpescritorioAlumno;
    private javax.swing.JRadioButton Jrbestado;
    private javax.swing.JTextField Jtapellido;
    private javax.swing.JTextField Jtnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdcFechaDenacimiento;
    private javax.swing.JTextField jtdni;
    // End of variables declaration//GEN-END:variables
}
