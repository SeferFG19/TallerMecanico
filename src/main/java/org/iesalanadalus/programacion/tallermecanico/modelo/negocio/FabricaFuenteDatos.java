package org.iesalanadalus.programacion.tallermecanico.modelo.negocio;

import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.ficheros.FuenteDatosFicheros;
import org.iesalanadalus.programacion.tallermecanico.modelo.negocio.mariadb.FuenteDatosMariaDb;

public enum FabricaFuenteDatos {

    FICHEROS {
        @Override
        public IFuenteDatos crear() {
            return new FuenteDatosFicheros();
        }
    }, MARIADB {
        @Override
        public IFuenteDatos crear() {
            return new FuenteDatosMariaDb();
        }
    };

    public abstract IFuenteDatos crear();
}
