package org.iesalanadalus.programacion.tallermecanico.modelo.negocio.mariadb;

import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.IClientes;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.IFuenteDatos;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.ITrabajos;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.IVehiculos;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.ficheros.Vehiculos;

public class FuenteDatosMariaDb implements IFuenteDatos {

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
