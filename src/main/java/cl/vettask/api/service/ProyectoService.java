package cl.vettask.api.service;

import cl.vettask.api.model.Proyecto;
import cl.vettask.api.repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private final ProyectoRepository proyectoRepository;

    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto obtenerProyectoPorId(Long id) {
        return proyectoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proyecto no encontrado con ID: " + id));
    }

    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public Proyecto actualizarProyecto(Long id, Proyecto proyectoActualizado) {
        Proyecto proyectoExistente = obtenerProyectoPorId(id);

        proyectoExistente.setNombre(proyectoActualizado.getNombre());
        proyectoExistente.setDescripcion(proyectoActualizado.getDescripcion());
        proyectoExistente.setAreaVeterinaria(proyectoActualizado.getAreaVeterinaria());

        return proyectoRepository.save(proyectoExistente);
    }

    public void eliminarProyecto(Long id) {
        Proyecto proyecto = obtenerProyectoPorId(id);
        proyectoRepository.delete(proyecto);
    }
}