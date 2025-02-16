package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Tarea;
import edu.udelp.movil.restproject.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TareaServiceImpl implements TareaService{
    @Autowired
    private TareaRepository repository;

    @Override
    public Tarea save(Tarea tarea) {
        return repository.save(tarea);
    }

    @Override
    public List<Tarea> findAll() {
        return repository.findAll();
    }

    @Override
	public Tarea findById(Long id) {
		return repository.findById(id).orElse(new Tarea());
	}

	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}
}
