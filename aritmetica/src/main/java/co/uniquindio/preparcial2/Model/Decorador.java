package co.uniquindio.preparcial2.Model;

public abstract class Decorador implements OperacionAritmetica {
    protected OperacionAritmetica operacion;

    public Decorador(OperacionAritmetica operacion) {
        assert operacion != null;
        this.operacion = operacion;
    }
}