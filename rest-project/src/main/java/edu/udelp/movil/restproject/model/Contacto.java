package edu.udelp.movil.restproject.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name = "contacto")
@Data
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Campo Obligatorio")
    private Long idUsuarioRelacion;


    @NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
    private String nombre;

    private String apellidos;

    @Email(message = "Introdusca un correo valido")
    @NotNull(message = "El correo no puede estar vacío")
    private String correo;

    @Pattern(regexp = "^[0-9]{10}$", message = "El teléfono solo puede contener números y debe tener exactamente 10 dígitos")
    @Column(length = 10)
    private String telefonoPrincipal;

    private String direccion;

    @ElementCollection
    private List<String> telefonosAdicionales;

    @ElementCollection
    private List<String> correosAdicionales;
}

