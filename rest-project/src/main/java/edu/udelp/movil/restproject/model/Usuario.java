package edu.udelp.movil.restproject.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String email;
	private String password;
	
	@Transient
	private String code;
	
	@Transient
	private String mensaje;


}
