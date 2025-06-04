package edu.udelp.movil.restproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "recordatorio")
@Data
public class Recordatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private Long idTipo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechaHora;
    
    private String mensaje;

    @ElementCollection
    @CollectionTable(name = "recordatorio_correos", joinColumns = @JoinColumn(name = "recordatorio_id"))
    @Column(name = "correo", nullable = false)
    private List<String> correos;
}
