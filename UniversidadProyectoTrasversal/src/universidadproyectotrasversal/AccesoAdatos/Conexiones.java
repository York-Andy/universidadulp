/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadproyectotrasversal.AccesoAdatos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLDataException;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Lenovo
 */
public class Conexiones {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB ="universidad";
    private static final String USUARIO = "root";
    private static final String PASSWORD ="";
    private static Connection connection;
   // metodo constructor  
    private Conexiones (){}
    public static Connection getConexiones(){
    if (connection == null){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            try {
                connection =  DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conectado");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion ");
            
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Eroor al cargar driver");
            
        }
    
    }
    return connection;
    
    }
    
    
}
