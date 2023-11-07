/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadproyectotrasversal.AccesoAdatos;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadproyectotrasversal.Entidades.Alumno;
import java.sql.Date;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class AlumnoData {
    private Connection con  = null;
    
    public AlumnoData(){
    con =Conexiones.getConexiones();
    }
    public void guardarAlumno(Alumno alumno ){
    String sql ="INSERT INTO alumno (dni, apellido,nombre,fechaNacimiento,estado)VALUES(? ,? ,? ,? ,?)";
        try {
            PreparedStatement ps =con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
            alumno.setIdAlumno(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "el alumno  se agrego exitosamente ");
            
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    
    }
    public void modificarAlumno(Alumno alumno){
    String sql ="UPDATE alumno SET dni =? , apellido = ? , nombre=? , fechaNacimiento =? WHERE idAlumno =?";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
           int cambio = ps.executeUpdate();
           if (cambio == 1){
           JOptionPane.showMessageDialog(null, "el alumno fue modificado exitosamente");
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder modificar datos");
            
        }
    
    }
    public void eliminarAlumno(int idAlumno){
    String sql="UPDATE alumno SET estado = 0 WHERE idAlumno =?";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int eliminar =ps.executeUpdate();
            if (eliminar ==1){
            JOptionPane.showMessageDialog(null,"el alumno se elimino exitosamente ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en eliminar alumno ");
            
        }
    
    
    }
    public Alumno buscarAlumno(int idAlumno){
    String sql ="SELECT    dni,  apellido,  nombre,  fechaNacimiento , estado  FROM alumno WHERE idAlumno =? AND estado = 1";
    Alumno alumno =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
            alumno =new Alumno();
            alumno.setIdAlumno(idAlumno);
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getNString("apellido"));
            alumno.setNombre(rs.getNString("nombre"));
            alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setEstado(true);
            
            }else{
            
            JOptionPane.showMessageDialog(null, "El alumno no existe con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return alumno;       
            
    }
   
     public   Alumno buscarAlumnoPorDni(int dni ){
    String sql ="SELECT  idAlumno,  dni,  apellido,  nombre,  fechaNacimiento , estado  FROM alumno WHERE dni=? AND estado = 1";
    Alumno alumno =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
            alumno =new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getNString("apellido"));
            alumno.setNombre(rs.getNString("nombre"));
            alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setEstado(true);
            
            }else{
            
            JOptionPane.showMessageDialog(null, "El alumno no existe con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return alumno;       
            
    }
     
     
     
     
     public   List <Alumno> listarAlumnos(){
    String sql ="SELECT  idAlumno,  dni,  apellido,  nombre,  fechaNacimiento , estado  FROM alumno WHERE estado = 1";
    ArrayList <Alumno >alumnos =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
            Alumno alumno =new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getNString("apellido"));
            alumno.setNombre(rs.getNString("nombre"));
            alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setEstado(true);
            alumnos.add(alumno);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return alumnos;       
            
    }

}
