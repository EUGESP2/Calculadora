package calculosTest;

import calculos.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
            public void sumandoDosNumeros() {


        Calculadora probandoSuma = new Calculadora();
        Assertions.assertEquals(26.1,probandoSuma.sumar(24.0,2.1));
    }

}
