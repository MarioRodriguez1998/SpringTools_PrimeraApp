package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Recordatorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {
	
	Recordatorio findByTipoAndIdTipo(String tipo, Long idTipo);
	List<Recordatorio> findByFechaHoraBefore(Date date);
}
