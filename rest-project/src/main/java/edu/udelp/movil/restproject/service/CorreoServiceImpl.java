package edu.udelp.movil.restproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CorreoServiceImpl implements CorreoService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void enviarCorreoSimple(String destino, String asunto, String mensaje) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(destino);
        mail.setSubject(asunto);
        mail.setText(mensaje);
        mailSender.send(mail);
    }

    @Override
    public void enviarCorreo(List<String> correos, String asunto, String mensaje) {
        for (String correo : correos) {
            enviarCorreoSimple(correo, asunto, mensaje);
        }
    }
}
