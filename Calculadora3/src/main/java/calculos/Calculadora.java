package calculos;

public class Calculadora {
private double numero1;
private double numero2;

private double resultado;

    public Calculadora() {

    }
//
//    public double getNumero1() {
//        return numero1;
//    }
//
//    public void setNumero1(double numero1) {
//        this.numero1 = numero1;
//    }
//
//    public double getNumero2() {
//        return numero2;
//    }

//    public void setNumero2(double numero2) {
//        this.numero2 = numero2;
//    }

    public double sumar(double unNumero, double otroNumero){

        resultado = unNumero + otroNumero;
        return resultado;
    }

    public double restar(double unNumero, double otroNumero) {

        resultado = unNumero - otroNumero;
        return resultado;
    }


        public double multiplicar(double unNumero, double otroNumero){

            resultado = unNumero * otroNumero;
            return resultado;
        }
        public double dividir(double unNumero, double otroNumero){
            resultado = unNumero / otroNumero;
            return resultado;
        }
    }

