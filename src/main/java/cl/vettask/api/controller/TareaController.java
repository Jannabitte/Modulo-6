package cl.vettask.api.controller;

import cl.vettask.api.model.Tarea;
import cl.vettask.api.service.TareaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping
    public List<Tarea> listarTareas() {
        return tareaService.listarTareas();
    }

    @GetMapping("/{id}")
    public Tarea obtenerTareaPorId(@PathVariable Long id) {
        return tareaService.obtenerTareaPorId(id);
    }

    @GetMapping("/proyecto/{proyectoId}")
    public List<Tarea> listarTareasPorProyecto(@PathVariable Long proyectoId) {
        return tareaService.listarTareasPorProyecto(proyectoId);
    }

    @PostMapping("/proyecto/{proyectoId}")
    public Tarea crearTarea(
            @PathVariable Long proyectoId,
            @Valid @RequestBody Tarea tarea
    ) {
        return tareaService.crearTarea(proyectoId, tarea);
    }

    @PutMapping("/{id}")
    public Tarea actualizarTarea(
            @PathVariable Long id,
            @Valid @RequestBody Tarea tarea
    ) {
        return tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}