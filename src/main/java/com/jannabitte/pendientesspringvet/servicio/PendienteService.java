package com.jannabitte.pendientesspringvet.servicio;

import com.jannabitte.pendientesspringvet.modelo.Pendiente;

import java.util.List;

public interface PendienteService {

    void agregarPendiente(Pendiente pendiente);

    List<Pendiente> listarPendientes();
}