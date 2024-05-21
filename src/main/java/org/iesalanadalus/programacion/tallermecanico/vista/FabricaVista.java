package org.iesalanadalus.programacion.tallermecanico.vista;

import org.iesalanadalus.programacion.tallermecanico.vista.grafica.VistaGrafica;
import org.iesalanadalus.programacion.tallermecanico.vista.texto.VistaTexto;

public enum FabricaVista {

    TEXTO {
        @Override
        public Vista crear() {
            return new VistaTexto();
        }
    },
    GRAFICA {
        @Override
        public Vista crear() {
            return VistaGrafica.getInstancia();
        }
    },
    VENTANAS {
        @Override
        public Vista crear() {
            return new VistaTexto();
        }
    };

    public abstract Vista crear();
}
