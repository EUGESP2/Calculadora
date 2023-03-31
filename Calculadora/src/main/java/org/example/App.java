package org.example;

import calculadora.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     double resultado;

        Calculadora calculo = new Calculadora(2.0,5.0);
resultado =  calculo.sumar(calculo.getUnNumero(), calculo.getOtroNumero());
        System.out.println( "Hello World! aca va la suma" + resultado );
    }
}
