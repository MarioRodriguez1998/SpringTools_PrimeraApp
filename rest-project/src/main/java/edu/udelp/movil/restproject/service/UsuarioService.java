package edu.udelp.movil.restproject.service;

import java.util.List;
import edu.udelp.movil.restproject.model.Usuario;

public interface UsuarioService {
	
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    Usuario findById(Long id);
    void remove(Long id); 
	boolean existsByEmailAndPassword(String email, String password);
	
	Usuario findByEmail(String email);
	
	
	Usuario recuperarPassword(Usuario usuario);
	
}
