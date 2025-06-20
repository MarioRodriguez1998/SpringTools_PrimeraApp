package edu.udelp.movil.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.udelp.movil.restproject.model.Evento;
import edu.udelp.movil.restproject.service.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    EventoService service;

    @PostMapping("/")
    public List<Evento> getAll() {
        return service.findAll();
    }

    @PostMapping("/add")
    public Evento add(@RequestBody Evento evento) {
        return service.save(evento);
    }

    @PostMapping("/edit/{id}")
    public Evento edit(@RequestBody Evento evento, @PathVariable Long id) {
        evento.setId(id);
        return service.save(evento);
    }

    @PostMapping("/get/{id}")
    public Evento get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        service.remove(id);
    }

    @PostMapping("/usuario")
    public ResponseEntity<List<Evento>> getByUsuario(@RequestBody Long userId) {
        List<Evento> eventos = service.findByUsuarioId(userId);
        return ResponseEntity.ok(eventos);
    }

    @PostMapping("/actualizar")
    public ResponseEntity<Evento> actualizar(@RequestBody Evento evento) {
        Evento actualizado = service.save(evento);
        return ResponseEntity.ok(actualizado);
    }
}

