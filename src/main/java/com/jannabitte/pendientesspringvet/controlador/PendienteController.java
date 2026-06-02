package com.jannabitte.pendientesspringvet.controlador;

import com.jannabitte.pendientesspringvet.modelo.Pendiente;
import com.jannabitte.pendientesspringvet.servicio.PendienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PendienteController {

    private final PendienteService pendienteService;

    public PendienteController(PendienteService pendienteService) {
        this.pendienteService = pendienteService;
    }

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pendiente", new Pendiente());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarPendiente(Pendiente pendiente) {
        pendienteService.agregarPendiente(pendiente);
        return "redirect:/lista";
    }

    @GetMapping("/lista")
    public String listarPendientes(Model model) {
        model.addAttribute("pendientes", pendienteService.listarPendientes());
        return "lista";
    }
}