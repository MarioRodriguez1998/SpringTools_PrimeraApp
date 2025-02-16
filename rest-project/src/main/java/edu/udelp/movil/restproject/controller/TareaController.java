package edu.udelp.movil.restproject.controller;

import edu.udelp.movil.restproject.model.Tarea;
import edu.udelp.movil.restproject.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaController {
    @Autowired
    TareaService service;

    @PostMapping("/")
    public List<Tarea> getAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public  Tarea add(@RequestBody Tarea tarea) {
        return service.save(tarea);
    }

    @PostMapping("/edit/{id}")
    public Tarea edit(@RequestBody Tarea tarea, @PathVariable Long id){
        tarea.setId(id);
        return service.save(tarea);
    }
    
    @PostMapping("/get/{id}")
    public Tarea get(@PathVariable Long id){
        return service.findById(id);        
    }
    
    @PostMapping("/remove/{id}")
    public void remove(@PathVariable Long id){
         service.remove(id);        
    }
}
