package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {
	
	Recordatorio findByTipoAndIdTipo(String tipo, Long idTipo);
}
