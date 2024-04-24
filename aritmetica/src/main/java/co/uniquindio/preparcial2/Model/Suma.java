package co.uniquindio.preparcial2.Model;

public class Suma implements OperacionAritmetica {
    @Override
    public double realizarOperacion(double num1, double num2) {
        return num1 + num2;
    }
}