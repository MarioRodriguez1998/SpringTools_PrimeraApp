package edu.udelp.movil.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.udelp.movil.restproject.model.Contacto;

@Repository

public interface ContactoRepository extends JpaRepository<Contacto, Long>{
}
