package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Contacto;
import edu.udelp.movil.restproject.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContactoServiceImpl implements ContactoService {
	
	@Autowired
    private ContactoRepository repository;

	@Override
	public Contacto save(Contacto contacto) {
		return repository.save(contacto);
	}

	@Override
	public List<Contacto> findAll() {
		return repository.findAll();
	}

	@Override
	public Contacto findById(Long id) {
		return repository.findById(id).orElse(new Contacto());
	}

	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}
	
	
	
}
