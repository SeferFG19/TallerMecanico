package org.iesalanadalus.programacion.tallermecanico.vista;

import org.iesalanadalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalanadalus.programacion.tallermecanico.modelo.dominio.TipoTrabajo;
import org.iesalanadalus.programacion.tallermecanico.modelo.dominio.Trabajo;
import org.iesalanadalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import org.iesalanadalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalanadalus.programacion.tallermecanico.vista.eventos.GestorEventos;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface Vista {
    GestorEventos getGestorEventos();

    void comenzar();

    void terminar();

    Cliente leerCliente();

    Cliente leerClienteDni();

    String leerNuevoNombre();

    String leerNuevoTelefono();

    Vehiculo leerVehiculo();

    Vehiculo leerVehiculoMatricula();

    Trabajo leerRevision();

    Trabajo leerMecanico();

    Trabajo leerTrabajoVehiculo();

    int leerHoras();

    float leerPrecioMaterial();

    LocalDate leerFechaCierre();

    LocalDate leerMes();

    void notificarResultado(Evento evento, String texto, boolean exito);

    void mostrarCliente(Cliente cliente);

    void mostrarVehiculo(Vehiculo vehiculo);

    void mostrarTrabajo(Trabajo trabajo);

    void mostrarClientes(List<Cliente> clientes);

    void mostrarVehiculos(List<Vehiculo> vehiculos);

    void mostrarTrabajos(List<Trabajo> trabajos);

    default void mostrarTrabajosCliente(List<Trabajo> trabajos) {
        mostrarTrabajos(trabajos);
    }

    default void mostrarTrabajosVehiculo(List<Trabajo> trabajos) {
        mostrarTrabajos(trabajos);
    }

    void mostrarEstadisticasMensuales(Map<TipoTrabajo, Integer> estadisticas);

}