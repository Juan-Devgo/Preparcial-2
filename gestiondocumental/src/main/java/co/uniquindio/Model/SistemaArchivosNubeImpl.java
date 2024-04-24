package co.uniquindio.Model;

public class SistemaArchivosNubeImpl implements SistemaArchivosNube {

    @Override
    public void guardarArchivoNube(String nombreArchivo) {
        System.out.println(nombreArchivo + "Se ha guardado en la nube");
    }

    @Override
    public void eliminarArchivoNube(String nombreArchivo) {
        System.out.println(nombreArchivo + "Se ha eliminado de la nube");
    }
}