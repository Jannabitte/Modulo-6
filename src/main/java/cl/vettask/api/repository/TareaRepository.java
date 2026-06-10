package cl.vettask.api.repository;

import cl.vettask.api.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

    List<Tarea> findByProyectoId(Long proyectoId);
}