package calculadora;

public class Calculadora {
    private double unNumero;
    private double otroNumero;
    private double resultado;

    public Calculadora(double unNumero, double otroNumero) {
        this.unNumero = unNumero;
        this.otroNumero = otroNumero;
    }

    public double getUnNumero() {
        return unNumero;
    }

    public void setUnNumero(double unNumero) {
        this.unNumero = unNumero;
    }

    public double getOtroNumero() {
        return otroNumero;
    }

    public void setOtroNumero(double otroNumero) {
        this.otroNumero = otroNumero;
    }
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }
}
