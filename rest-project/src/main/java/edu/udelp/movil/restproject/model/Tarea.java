package edu.udelp.movil.restproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tarea")
@Data
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
    @Column(length = 30)
    private String nombre;

    private String descripcion;

    @Max(value = 5, message = "La prioridad maxima es de 5")
    @Min(value = 1, message = "La prioridad minima es de 1")
    private Integer prioridad;

}
