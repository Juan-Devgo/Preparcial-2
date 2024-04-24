package co.uniquindio.Model;

public class FachadaSistemaArchivos implements SistemaArchivos{
    private AdaptadorSistemaArchivos adaptador;

    public FachadaSistemaArchivos(AdaptadorSistemaArchivos adaptador){
        assert adaptador != null;
        this.adaptador = adaptador;
    }

    @Override
    public void guardarArchivo(String nombreArchivo) {
        adaptador.guardarArchivo(nombreArchivo);
    }

    @Override
    public void eliminarArchivo(String nombreArchivo) {
        adaptador.eliminarArchivo(nombreArchivo);        
    }
}