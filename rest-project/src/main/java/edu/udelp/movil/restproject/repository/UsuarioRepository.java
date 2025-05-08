package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	boolean existsByEmailAndPassword(String email, String password);
	
	Optional<Usuario> findByEmail(String email);
	
	boolean existsByEmail(String email);
}
