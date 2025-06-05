package edu.udelp.movil.restproject.controller;

import edu.udelp.movil.restproject.service.CorreoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/correo")
public class CorreoController {

    @Autowired
    private CorreoService correoService;

    @PostMapping("/enviar")
    public String enviarCorreo(@RequestParam String destino) {
        correoService.enviarCorreoSimple(destino, "Recordatorio", "Este es un mensaje de prueba de recordatorio.");
        return "Correo enviado a " + destino;
    }
}
