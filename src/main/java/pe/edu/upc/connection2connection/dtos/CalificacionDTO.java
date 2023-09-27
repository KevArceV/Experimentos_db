package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Estudiante;

public class CalificacionDTO {


    private int id;

    private int id_estudiante;

    private int estudiante_ponecalificacion;

    private int calificacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getEstudiante_ponecalificacion() {
        return estudiante_ponecalificacion;
    }

    public void setEstudiante_ponecalificacion(int estudiante_ponecalificacion) {
        this.estudiante_ponecalificacion = estudiante_ponecalificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
