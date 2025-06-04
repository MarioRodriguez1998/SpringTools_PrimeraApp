package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Recordatorio;
import java.util.List;

public interface RecordatorioService {

    Recordatorio save(Recordatorio recordatorio);
    List<Recordatorio> findAll();
    Recordatorio findById(Long id);
    void remove(Long id);
    public Recordatorio findByTipoAndIdTipo(String tipo, Long idTipo);

}
