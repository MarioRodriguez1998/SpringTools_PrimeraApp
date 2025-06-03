package edu.udelp.movil.restproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

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

    @Max(value = 5, message = "La prioridad máxima es 5")
    @Min(value = 1, message = "La prioridad mínima es 1")
    private Integer prioridad;

    @Column(length = 20)
    private String estado;

    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    @ElementCollection
    private List<String> etiquetas;
}

