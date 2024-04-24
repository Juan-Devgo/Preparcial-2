package co.uniquindio.preparcial2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import co.uniquindio.Model.AdaptadorSistemaArchivos;
import co.uniquindio.Model.FachadaSistemaArchivos;
import co.uniquindio.Model.SistemaArchivos;
import co.uniquindio.Model.SistemaArchivosLocal;
import co.uniquindio.Model.SistemaArchivosLocalImpl;
import co.uniquindio.Model.SistemaArchivosNube;
import co.uniquindio.Model.SistemaArchivosNubeImpl;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        SistemaArchivosLocal sistemaLocal = new SistemaArchivosLocalImpl();
        SistemaArchivosNube sistameNube = new SistemaArchivosNubeImpl();

        AdaptadorSistemaArchivos adaptador = new AdaptadorSistemaArchivos(sistemaLocal, sistameNube);
        FachadaSistemaArchivos fachada = new FachadaSistemaArchivos(adaptador);

        fachada.guardarArchivo("Anita lava la tina");
        fachada.eliminarArchivo("Anita lava la tina");

    }

}