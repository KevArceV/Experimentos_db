package pe.edu.upc.connection2connection.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Calificacion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_estudiante", length = 6, nullable = false)//largo de 6 y es obligatorio(nullable)
    private int id_estudiante;
    @Column(name = "estudiante_ponecalificacion", length = 6, nullable = false)//largo de 6 y es obligatorio(nullable)
    private  int estudiante_ponecalificacion;
    @Column(name = "calificacion", length = 6, nullable = false)//largo de 6 y es obligatorio(nullable)
    private  int calificacion;



    public Calificacion(){

    }

    public Calificacion(int id, int id_estudiante, int estudiante_ponecalificacion, int calificacion) {
        this.id = id;
        this.id_estudiante = id_estudiante;
        this.estudiante_ponecalificacion = estudiante_ponecalificacion;
        this.calificacion = calificacion;
    }

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
