package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Recordatorio;
import edu.udelp.movil.restproject.repository.RecordatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordatorioServiceImpl implements RecordatorioService {

    @Autowired
    private RecordatorioRepository repository;

    @Override
    public Recordatorio save(Recordatorio recordatorio) {
        return repository.save(recordatorio);
    }
    
    @Override
    public Recordatorio findByTipoAndIdTipo(String tipo, Long idTipo) {
        return repository.findByTipoAndIdTipo(tipo, idTipo);
    }

    @Override
    public List<Recordatorio> findAll() {
        return repository.findAll();
    }

    @Override
    public Recordatorio findById(Long id) {
        return repository.findById(id).orElse(new Recordatorio());
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
