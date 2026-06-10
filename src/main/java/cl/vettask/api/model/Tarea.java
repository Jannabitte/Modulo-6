package cl.vettask.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "tareas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título de la tarea es obligatorio")
    private String titulo;

    private String descripcion;

    private boolean completada;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;
}