// Eduardo Antonio Molina Zambrano
package tarea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraParametrosTest {

    Calculadora calc = new Calculadora();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    void testEsPar(int n) {
        assertTrue(calc.esPar(n));
    }

    @ParameterizedTest
    @CsvSource({"1,2,3","5,5,10","3,7,10"})
    void testSumarCsv(int a, int b, int r) {
        assertEquals(r, calc.sumar(a,b));
    }
}
