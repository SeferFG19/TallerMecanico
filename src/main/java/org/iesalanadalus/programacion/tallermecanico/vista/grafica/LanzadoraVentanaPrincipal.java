package org.iesalanadalus.programacion.tallermecanico.vista.grafica;

import javafx.application.Application;
import javafx.stage.Stage;
import org.iesalanadalus.programacion.tallermecanico.vista.grafica.utilidades.Controlador;
import org.iesalanadalus.programacion.tallermecanico.vista.grafica.utilidades.Controladores;

public class LanzadoraVentanaPrincipal extends Application {

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Controlador ventanaPrincipal = Controladores.get("/vistas/prueba.fxml","Taller mecánico",null);
        VistaGrafica.getInstancia().setVentanaPrincipal(ventanaPrincipal);
        ventanaPrincipal.getEscenario().show();
    }

    public static void comenzar() {
        launch(LanzadoraVentanaPrincipal.class);
    }
}
