package edu.udelp.movil.restproject.service;

import java.util.List;

public interface CorreoService {
    void enviarCorreoSimple(String destino, String asunto, String mensaje);
    void enviarCorreo(List<String> correos, String asunto, String mensaje);
}
