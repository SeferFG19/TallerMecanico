package org.iesalanadalus.programacion.tallermecanico.controlador;

import org.iesalanadalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalanadalus.programacion.tallermecanico.vista.eventos.ReceptorEventos;

public interface IControlador extends ReceptorEventos {
    void comenzar();

    void terminar();

    @Override
    void actualizar(Evento evento);
}
