package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Evento;
import java.util.List;

public interface EventoService {

    Evento save(Evento evento);
    List<Evento> findAll();
    Evento findById(Long id);
    void remove(Long id);
}
