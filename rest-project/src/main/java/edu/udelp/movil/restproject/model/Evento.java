package edu.udelp.movil.restproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evento")
@Data
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Campo Obligatorio")
    private Long idUsuarioRelacion;

    private String titulo;

    private String descripcion;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    private String ubicacion;
    
    private String categoria;

    @ManyToMany
    @JoinTable(
        name = "evento_contactos",
        joinColumns = @JoinColumn(name = "evento_id"),
        inverseJoinColumns = @JoinColumn(name = "contacto_id")
    )
    private List<Contacto> contactos;
}

