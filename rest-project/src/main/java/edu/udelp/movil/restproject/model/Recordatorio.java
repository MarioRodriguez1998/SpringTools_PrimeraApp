package edu.udelp.movil.restproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    
    @NotNull(message = "Campo Obligatorio")
    private Long idUsuarioRelacion;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private Long idTipo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechaHora;
    
    private String mensaje;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "recordatorio_correos", joinColumns = @JoinColumn(name = "recordatorio_id"))
    @Column(name = "correo", nullable = false)
    private List<String> correos;

}
