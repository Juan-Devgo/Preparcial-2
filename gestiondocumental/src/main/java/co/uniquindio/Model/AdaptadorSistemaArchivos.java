package co.uniquindio.Model;

public class AdaptadorSistemaArchivos implements SistemaArchivos {
    private SistemaArchivosLocal sistemaLocal;
    private SistemaArchivosNube sistemaNube;

    public AdaptadorSistemaArchivos(SistemaArchivosLocal sistemaLocal, SistemaArchivosNube sistemaNube) {
        assert sistemaLocal != null;
        assert sistemaNube != null;

        this.sistemaLocal = sistemaLocal;
        this.sistemaNube = sistemaNube;
    }

    @Override
    public void guardarArchivo(String nombreArchivo) {
        
        sistemaLocal.guardarArchivoLocal(nombreArchivo);
        sistemaNube.guardarArchivoNube(nombreArchivo);
    }

    @Override
    public void eliminarArchivo(String nombreArchivo) {
        sistemaLocal.eliminarArchivoLocal(nombreArchivo);  
        sistemaNube.eliminarArchivoNube(nombreArchivo);      
    }
}
