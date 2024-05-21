package org.iesalanadalus.programacion.tallermecanico.modelo.negocio;

public interface IFuenteDatos {
    IClientes crearClientes();

    IVehiculos crearVehiculos();

    ITrabajos crearTrabajos();
}
