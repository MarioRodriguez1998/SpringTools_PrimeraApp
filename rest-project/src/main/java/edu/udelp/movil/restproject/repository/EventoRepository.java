package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Evento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    List<Evento> findByIdUsuarioRelacion(Long userId);
}
