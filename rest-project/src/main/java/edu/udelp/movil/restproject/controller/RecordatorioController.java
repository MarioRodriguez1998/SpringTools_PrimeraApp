package edu.udelp.movil.restproject.controller;

import edu.udelp.movil.restproject.model.Recordatorio;
import edu.udelp.movil.restproject.service.RecordatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recordatorio")
@CrossOrigin(origins = "*") // Agrega esto si accedes desde frontend separado
public class RecordatorioController {

    @Autowired
    private RecordatorioService service;

    @PostMapping("/")
    public List<Recordatorio> getAll() {
        return service.findAll();
    }

    @GetMapping("/getByTipo/{tipo}/{idTipo}")
    public ResponseEntity<Recordatorio> getByTipo(@PathVariable String tipo, @PathVariable Long idTipo) {
        Recordatorio r = service.findByTipoAndIdTipo(tipo, idTipo);
        if (r != null) {
            return ResponseEntity.ok(r);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public Recordatorio add(@RequestBody Recordatorio recordatorio) {
        return service.save(recordatorio);
    }

    @PostMapping("/edit/{id}")
    public Recordatorio edit(@RequestBody Recordatorio recordatorio, @PathVariable Long id) {
        recordatorio.setId(id);
        return service.save(recordatorio);
    }

    @PostMapping("/get/{id}")
    public Recordatorio get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        service.remove(id);
    }

    //Obtener recordatorios por ID de usuario
    @PostMapping("/usuario")
    public ResponseEntity<List<Recordatorio>> getByUsuario(@RequestBody Long usuarioId) {
        List<Recordatorio> recordatorios = service.findByUsuarioId(usuarioId);
        return ResponseEntity.ok(recordatorios);
    }

    //Actualizar recordatorio (equivalente a "update" completo)
    @PostMapping("/actualizar")
    public ResponseEntity<Recordatorio> actualizar(@RequestBody Recordatorio recordatorio) {
        Recordatorio actualizado = service.save(recordatorio);
        return ResponseEntity.ok(actualizado);
    }
}



