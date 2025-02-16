package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
