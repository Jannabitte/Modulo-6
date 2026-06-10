package cl.vettask.api.service;

import cl.vettask.api.model.Proyecto;
import cl.vettask.api.model.Tarea;
import cl.vettask.api.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;
    private final ProyectoService proyectoService;

    public TareaService(TareaRepository tareaRepository, ProyectoService proyectoService) {
        this.tareaRepository = tareaRepository;
        this.proyectoService = proyectoService;
    }

    public List<Tarea> listarTareas() {
        return tareaRepository.findAll();
    }

    public List<Tarea> listarTareasPorProyecto(Long proyectoId) {
        return tareaRepository.findByProyectoId(proyectoId);
    }

    public Tarea obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada con ID: " + id));
    }

    public Tarea crearTarea(Long proyectoId, Tarea tarea) {
        Proyecto proyecto = proyectoService.obtenerProyectoPorId(proyectoId);
        tarea.setProyecto(proyecto);
        tarea.setCompletada(false);
        return tareaRepository.save(tarea);
    }

    public Tarea actualizarTarea(Long id, Tarea tareaActualizada) {
        Tarea tareaExistente = obtenerTareaPorId(id);

        tareaExistente.setTitulo(tareaActualizada.getTitulo());
        tareaExistente.setDescripcion(tareaActualizada.getDescripcion());
        tareaExistente.setCompletada(tareaActualizada.isCompletada());

        return tareaRepository.save(tareaExistente);
    }

    public void eliminarTarea(Long id) {
        Tarea tarea = obtenerTareaPorId(id);
        tareaRepository.delete(tarea);
    }
}