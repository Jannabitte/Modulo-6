package com.jannabitte.pendientesspringvet.controlador;

import com.jannabitte.pendientesspringvet.modelo.Pendiente;
import com.jannabitte.pendientesspringvet.servicio.PendienteService;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PendienteControllerTest {

    @Test
    public void testMostrarFormulario() {
        PendienteService pendienteService = new ServicioPrueba();
        PendienteController controller = new PendienteController(pendienteService);

        Model model = new ConcurrentModel();

        String vista = controller.mostrarFormulario(model);

        assertEquals("formulario", vista);
        assertTrue(model.containsAttribute("pendiente"));
    }

    @Test
    public void testGuardarPendiente() {
        ServicioPrueba pendienteService = new ServicioPrueba();
        PendienteController controller = new PendienteController(pendienteService);

        Pendiente pendiente = new Pendiente(
                "Vacunar paciente canino",
                "Revisar carnet y confirmar tutor",
                "2026-06-04"
        );

        String resultado = controller.guardarPendiente(pendiente);

        assertEquals("redirect:/lista", resultado);
        assertEquals(1, pendienteService.listarPendientes().size());
    }

    @Test
    public void testListarPendientes() {
        ServicioPrueba pendienteService = new ServicioPrueba();
        PendienteController controller = new PendienteController(pendienteService);

        Pendiente pendiente = new Pendiente(
                "Control veterinario",
                "Revisar evolución del paciente",
                "2026-06-10"
        );

        pendienteService.agregarPendiente(pendiente);

        Model model = new ConcurrentModel();

        String vista = controller.listarPendientes(model);

        assertEquals("lista", vista);
        assertTrue(model.containsAttribute("pendientes"));
    }

    static class ServicioPrueba implements PendienteService {

        private final List<Pendiente> pendientes = new ArrayList<>();

        @Override
        public void agregarPendiente(Pendiente pendiente) {
            pendientes.add(pendiente);
        }

        @Override
        public List<Pendiente> listarPendientes() {
            return pendientes;
        }
    }
}