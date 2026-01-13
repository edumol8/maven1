// Eduardo Antonio Molina Zambrano
package tarea;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    static Calculadora calc;

    @BeforeAll
    static void initAll() { calc = new Calculadora(); }

    @AfterAll
    static void tearAll() {}

    @BeforeEach
    void init() {}

    @AfterEach
    void tear() {}

    @Test
    void testSumar() { assertEquals(5, calc.sumar(2,3)); }

    @Test
    void testRestar() { assertNotEquals(0, calc.restar(5,3)); }

    @Test
    void testEsParTrue() { assertTrue(calc.esPar(4)); }

    @Test
    void testEsParFalse() { assertFalse(calc.esPar(5)); }

    @Test
    void testDividirException() { assertThrows(ArithmeticException.class, () -> calc.dividir(5,0)); }

    @Test
    void testNotNull() { assertNotNull(calc); }

    @Test
    void testAssertAll() {
        assertAll(
            () -> assertEquals(10, calc.sumar(7,3)),
            () -> assertEquals(4, calc.restar(7,3))
        );
    }
}
