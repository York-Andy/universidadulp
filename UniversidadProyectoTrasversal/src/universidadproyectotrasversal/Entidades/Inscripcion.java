/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadproyectotrasversal.Entidades;

/**
 *
 * @author Lenovo
 */
public class Inscripcion {
    private int idInscripcion;
    private Alumno  Alumno;
    private Materia materia;
    private int nota;

    public Inscripcion(int par, int par1, double par2) {
    }

    public Inscripcion(int idInscripcion, Alumno Alumno, Materia materia, int nota) {
        this.idInscripcion = idInscripcion;
        this.Alumno = Alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno Alumno, Materia ateria, int nota) {
        this.Alumno = Alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Materia getAteria() {
        return materia;
    }

    public void setAteria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", Alumno=" + Alumno + ", ateria=" + materia + ", nota=" + nota + '}';
    }

    

        
    
}
