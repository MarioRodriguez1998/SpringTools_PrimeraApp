package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Tarea;

import java.util.List;

public interface TareaService {

    Tarea save(Tarea tarea);
    List<Tarea> findAll();
    Tarea findById(Long id);
    void remove(Long id);
}
