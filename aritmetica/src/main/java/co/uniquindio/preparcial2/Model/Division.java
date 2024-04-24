package co.uniquindio.preparcial2.Model;

public class Division extends Decorador {
    
    public Division(OperacionAritmetica operacion) {
        super(operacion);
    }

    @Override
    public double realizarOperacion(double num1, double num2) {
        return operacion.realizarOperacion(num1, num2) / num2;
    }
}