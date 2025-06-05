package edu.udelp.movil.restproject.scheduled;

import edu.udelp.movil.restproject.model.Recordatorio;
import edu.udelp.movil.restproject.repository.RecordatorioRepository;
import edu.udelp.movil.restproject.service.CorreoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class RecordatorioScheduler {

    @Autowired
    private RecordatorioRepository repository;

    @Autowired
    private CorreoServiceImpl correoService;

    @Scheduled(fixedRate = 60000) // cada 60 segundos
    public void revisarYEnviarRecordatorios() {
        Date ahora = new Date();
        List<Recordatorio> pendientes = repository.findByFechaHoraBefore(ahora);
        for (Recordatorio recordatorio : pendientes) {
            correoService.enviarCorreo(
                recordatorio.getCorreos(),
                "Recordatorio automático",
                recordatorio.getMensaje()
            );
            // (Opcional) eliminar o marcar como enviado si no quieres repetir
            repository.delete(recordatorio);
        }
    }
}
