package edu.proyectoApi.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "solicitud_generator")
    @SequenceGenerator(name="solicitud_generator", sequenceName = "solicitudes_id_solicitud_seq", allocationSize=1)
    private Long idSolicitud;

    private Boolean estadoSolicitud;

    @ManyToOne
    @JoinColumn(name = "idClub")
    private Club club;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    // Getters y Setters

    public Solicitud() {
    }

    public Solicitud(Boolean estadoSolicitud, Club club, Usuario usuario) {
        this.estadoSolicitud = estadoSolicitud;
        this.club = club;
        this.usuario = usuario;
    }

    // Otros métodos, si es necesario
}
