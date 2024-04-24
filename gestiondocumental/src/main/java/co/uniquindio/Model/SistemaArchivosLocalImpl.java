package co.uniquindio.Model;

public class SistemaArchivosLocalImpl implements SistemaArchivosLocal {

    @Override
    public void guardarArchivoLocal(String nombreArchivo) {
        System.out.println(nombreArchivo + "Se ha guardado Localmente");
    }

    @Override
    public void eliminarArchivoLocal(String nombreArchivo) {
        System.out.println(nombreArchivo + "Se ha eliminado Localmente");
    }
}
