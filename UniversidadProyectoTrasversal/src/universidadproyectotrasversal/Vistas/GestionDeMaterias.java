/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadproyectotrasversal.Vistas;

/**
 *
 * @author Lenovo
 */
public class GestionDeMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionDeMaterias
     */
    public GestionDeMaterias() {
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

        Jbguardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbnuevo = new javax.swing.JButton();
        Jbeliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Jbsalir = new javax.swing.JButton();
        Jtcodigo = new javax.swing.JTextField();
        Jtnombre = new javax.swing.JTextField();
        Jtaño = new javax.swing.JTextField();
        Jrbestado = new javax.swing.JRadioButton();
        Jbuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        Jbguardar.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("MATERIA");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Año:");

        jLabel5.setText("Estado:");

        jbnuevo.setText("Nuevo");

        Jbeliminar.setText("Eliminar");

        jButton3.setText("Guardar");

        Jbsalir.setText("Salir");

        Jrbestado.setText("Marque si esta activo");

        Jbuscar.setText("Buscar");

        javax.swing.GroupLayout JbguardarLayout = new javax.swing.GroupLayout(Jbguardar);
        Jbguardar.setLayout(JbguardarLayout);
        JbguardarLayout.setHorizontalGroup(
            JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JbguardarLayout.createSequentialGroup()
                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JbguardarLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(JbguardarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbnuevo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jrbestado)
                            .addGroup(JbguardarLayout.createSequentialGroup()
                                .addComponent(Jbeliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(Jbsalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JbguardarLayout.createSequentialGroup()
                                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jtaño, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtcodigo))
                                .addGap(57, 57, 57)
                                .addComponent(Jbuscar)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        JbguardarLayout.setVerticalGroup(
            JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JbguardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbuscar))
                .addGap(18, 18, 18)
                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jrbestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(JbguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnuevo)
                    .addComponent(Jbeliminar)
                    .addComponent(jButton3)
                    .addComponent(Jbsalir))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jbguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jbguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbeliminar;
    private javax.swing.JPanel Jbguardar;
    private javax.swing.JButton Jbsalir;
    private javax.swing.JButton Jbuscar;
    private javax.swing.JRadioButton Jrbestado;
    private javax.swing.JTextField Jtaño;
    private javax.swing.JTextField Jtcodigo;
    private javax.swing.JTextField Jtnombre;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbnuevo;
    // End of variables declaration//GEN-END:variables
}
