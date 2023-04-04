package calculosTest;

import calculos.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
            public void sumandoDosNumeros() {


        Calculadora probando = new Calculadora();
        Assertions.assertEquals(26.1,probando.sumar(24.0,2.1));
        Assertions.assertEquals(10,probando.restar(20,10));
        Assertions.assertEquals(20,probando.dividir(20,1));
        Assertions.assertEquals(50,probando.multiplicar(2,25));
    }

}
