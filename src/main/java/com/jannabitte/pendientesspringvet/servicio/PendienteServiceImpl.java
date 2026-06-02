package com.jannabitte.pendientesspringvet.servicio;

import com.jannabitte.pendientesspringvet.modelo.Pendiente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PendienteServiceImpl implements PendienteService {

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