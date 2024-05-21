package org.iesalanadalus.programacion.tallermecanico.modelo.negocio.ficheros;

import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.IClientes;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.IFuenteDatos;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.ITrabajos;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.IVehiculos;

public class FuenteDatosFicheros implements IFuenteDatos {
    @Override
    public IClientes crearClientes() {
        return Clientes.getInstancia();
    }

    @Override
    public IVehiculos crearVehiculos() {
        return Vehiculos.getInstancia();
    }

    @Override
    public ITrabajos crearTrabajos() {
        return Trabajos.getInstancia();
    }
}
