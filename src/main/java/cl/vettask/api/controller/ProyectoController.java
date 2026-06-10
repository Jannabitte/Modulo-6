package cl.vettask.api.controller;

import cl.vettask.api.model.Proyecto;
import cl.vettask.api.service.ProyectoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping
    public List<Proyecto> listarProyectos() {
        return proyectoService.listarProyectos();
    }

    @GetMapping("/{id}")
    public Proyecto obtenerProyectoPorId(@PathVariable Long id) {
        return proyectoService.obtenerProyectoPorId(id);
    }

    @PostMapping
    public Proyecto crearProyecto(@Valid @RequestBody Proyecto proyecto) {
        return proyectoService.crearProyecto(proyecto);
    }

    @PutMapping("/{id}")
    public Proyecto actualizarProyecto(
            @PathVariable Long id,
            @Valid @RequestBody Proyecto proyecto
    ) {
        return proyectoService.actualizarProyecto(id, proyecto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProyecto(@PathVariable Long id) {
        proyectoService.eliminarProyecto(id);
    }
}