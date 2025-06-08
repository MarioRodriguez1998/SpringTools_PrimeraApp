package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Evento;
import edu.udelp.movil.restproject.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository repository;

    @Override
    public Evento save(Evento evento) {
        return repository.save(evento);
    }

    @Override
    public List<Evento> findAll() {
        return repository.findAll();
    }

    @Override
    public Evento findById(Long id) {
        return repository.findById(id).orElse(new Evento());
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Evento> findByUsuarioId(Long userId) {
        // ✅ Aquí debes llamar al método correcto del repositorio:
        return repository.findByIdUsuarioRelacion(userId);
    }
}
