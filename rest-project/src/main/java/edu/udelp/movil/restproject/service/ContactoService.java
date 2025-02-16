package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Contacto;
import java.util.List;

public interface ContactoService {
	Contacto save(Contacto contacto);
    List<Contacto> findAll();
    Contacto findById(Long id);
    void remove(Long id);
}
