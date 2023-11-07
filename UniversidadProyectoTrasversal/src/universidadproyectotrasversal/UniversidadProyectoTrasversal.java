/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadproyectotrasversal;

import com.sun.jdi.connect.spi.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadproyectotrasversal.AccesoAdatos.AlumnoData;
import universidadproyectotrasversal.AccesoAdatos.Conexiones;
import universidadproyectotrasversal.AccesoAdatos.InscripcionData;
import universidadproyectotrasversal.AccesoAdatos.MateriaData;
import universidadproyectotrasversal.Entidades.Alumno;
import universidadproyectotrasversal.Entidades.Inscripcion;
import universidadproyectotrasversal.Entidades.Materia;

/**
 *
 * @author Lenovo
 */
public class UniversidadProyectoTrasversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Connection con =(Connection) Conexiones.getConexiones();
        //Alumno juan =new Alumno(371,1234345, "luna", " juan pedro", LocalDate.of(1980, 4, 22), true);
        AlumnoData alu = new AlumnoData();
       // alu.guardarAlumno(juan);
       //alu.modificarAlumno(juan);
       //alu.eliminarAlumno(371);
      /* Alumno alumnoencontrado =alu.buscarAlumnoPorDni(678901234);
        System.out.println("dni"+alumnoencontrado.getDni());
        System.out.println("apellido"+alumnoencontrado.getApellido());
        System.out.println("nombre"+alumnoencontrado.getNombre());
        alumnoencontrado.toString();*/
     /* AlumnoData alu =new AlumnoData();
      for(Alumno alumno: alu.listarAlumnos()){
          System.out.println(alumno.getDni());
          System.out.println(alumno.getApellido());
          System.out.println(alumno.getNombre());
          System.out.println(alumno.getFechaNac());
      }*/
    // Materia materia = new Materia(13,"lengua  ", 1 ,true);
//     MateriaData mata =new MateriaData();
//     //mata.guardarMateria(materia);
//     
//     //mata.modificarAlumno(materia);
//    // mata.eliminarMateria(13);
//    Materia materiaencontrada =mata.buscaMateaia(14);
//        System.out.println("nombre"+materiaencontrada.getNombre());
//        System.out.println("año"+materiaencontrada.getAnioMateria());
//        System.out.println("estado"+materiaencontrada.isEstado());
     


//  MateriaData mata = new MateriaData();
//  for(Materia materia : mata.listarMateria()){
//
//      System.out.println(materia.getNombre());
//      System.out.println(materia.getAnioMateria());
//      System.out.println(materia.getIdMateria());
//  }
//    Inscripcion insc =new Inscripcion (355, 17, 5.9);
//    InscripcionData inscData = new InscripcionData();
//    inscData.guardarinscripcin(insc);  

//        InscripcionData inscData=new InscripcionData();
//         Inscripcion ax =new Inscripcion (355, 17, 4.9);
//         inscData.ObtenerCursadasMaterias(1);
//         System.out.println(inscData.toString());
    InscripcionData insc =new InscripcionData();
    MateriaData mata =new MateriaData();
    insc.ObtenerMateriasCursadas(371);
     
    
    
    }
    
    
    
}
