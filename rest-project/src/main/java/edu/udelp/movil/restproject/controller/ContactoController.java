package edu.udelp.movil.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.udelp.movil.restproject.model.Contacto;
import edu.udelp.movil.restproject.service.ContactoService;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
	
	@Autowired 
	ContactoService service;
	
	@PostMapping("/")
    public List<Contacto> getAll(){
        return service.findAll();
    }
	
	@PostMapping("/add")
    public  Contacto add(@RequestBody Contacto contacto) {
        return service.save(contacto);
    }
	
	@PostMapping("/edit/{id}")
	public Contacto edit(@RequestBody Contacto contacto, @PathVariable Long id) {
		contacto.setId(id);
		return service.save(contacto);
	}
	
	@PostMapping("/get/{id}") 
	public Contacto get(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/remove/{id}")
		public void remove(@PathVariable Long id){
	         service.remove(id); 
	}
    
}
