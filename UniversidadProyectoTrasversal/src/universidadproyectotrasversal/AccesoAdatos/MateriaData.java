/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadproyectotrasversal.AccesoAdatos;
import java.sql.Connection;
import universidadproyectotrasversal.Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Statement;
/**
 *
 * @author Lenovo
 */
public class MateriaData {
    private Connection con = null;
    public MateriaData(){
     con =Conexiones.getConexiones();
    }
    public void guardarMateria(Materia materia){
    String sql ="INSERT INTO materia(  nombre ,  anio, estado) VALUES ( ? ,? ,?)";
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //ps.setInt(1 , materia.getIdMateria());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
            materia.setIdMateria(1);
            JOptionPane.showMessageDialog(null, "Materia guardada");
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la materia ");
            
        }
    
    }
    public void modificarAlumno(Materia materia){
    String sql ="UPDATE materia  SET nombre =? , anio =? , estado=?  WHERE idMateria=?";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
            
           int cambio = ps.executeUpdate();
           if (cambio == 1){
           JOptionPane.showMessageDialog(null, "la  materia fue modificado exitosamente");
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder modificar datos de la materia");
            
        }
    }
    public void eliminarMateria(int idMa){
    String sql="UPDATE materia  SET estado = 0 WHERE idMateria =?";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1 , idMa);
            int eliminar =ps.executeUpdate();
            if (eliminar ==1){
            JOptionPane.showMessageDialog(null,"la materia  se elimino exitosamente ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en eliminar ña materia  ");
            
        }

} 
public Materia buscaMateaia(int idMateria){
    String sql ="SELECT idMateria ,  nombre ,  anio  FROM  materia  WHERE estado =1";
    Materia materia  =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
            materia  =new Materia ();
            materia.setIdMateria(idMateria);
            materia.setNombre(rs.getNString("nombre"));
            materia.setAnioMateria(idMateria);
            
           materia.setEstado(true);
            
            }else{
            
            JOptionPane.showMessageDialog(null, "El alumno no existe con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return materia;       
            
    }
      public   List <Materia> listarMateria(){
    String sql ="SELECT  idMateria,  nombre,  anio,  estado FROM materia  WHERE estado = 1";
    ArrayList <Materia >materias =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
            Materia  materia =new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("anio"));
            materia.setEstado(true);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al buscar alumnos ");
        }
    
            
     return materias ;       

}

}
