package pe.edu.upc.connection2connection.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Puesto_Trabajos")
public class Puesto_Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "requisito", length = 200, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String requisito;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Reclutador_id")
    private Reclutador reclutador;

    public Puesto_Trabajo(){

    }

    public Puesto_Trabajo(int id, String requisito, Reclutador reclutador) {
        this.id = id;
        this.requisito = requisito;
        this.reclutador = reclutador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }
}
