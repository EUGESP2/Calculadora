package calculosTest;

import calculos.Calculadora;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    @

            public void haciendoCalculos() {


        Calculadora probando = new Calculadora();


        Assertions.assertEquals(80,probando.dividir( probando.sumar(150,180),3));


        Assertions.assertEquals(140,probando.multiplicar(80,3));
        Assertions.assertEquals(650,probando.multiplicar(probando.restar(90,50),15));

        Assertions.assertEquals(2700,probando.multiplicar(25,probando.sumar(70,40)));

    }

}
