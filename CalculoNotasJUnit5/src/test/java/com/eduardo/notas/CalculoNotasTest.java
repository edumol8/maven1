
package com.eduardo.notas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
//Eduardo Molina parcial 2
public class CalculoNotasTest {

    @Test
    void promedioNotasNormales() {
        double[] notas = {8, 9, 10};
        assertEquals(9.0, CalculoNotas.promedio(notas));
    }

    @Test
    void promedioUnaNota() {
        double[] notas = {7};
        assertEquals(7.0, CalculoNotas.promedio(notas));
    }

    @ParameterizedTest
    @CsvSource({
            "5,5,5,5",
            "10,8,6,8"
    })
    void promedioParametrizado(double n1, double n2, double n3, double esperado) {
        double[] notas = {n1, n2, n3};
        assertEquals(esperado, CalculoNotas.promedio(notas));
    }

    @Test
    void arregloVacioLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> CalculoNotas.promedio(new double[]{}));
    }

    @ParameterizedTest
    @CsvSource({
            "8.5, 9.5, 9.0",
            "6.0, 7.5, 6.75"
    })
    void promedioConNotasDecimales(double n1, double n2, double esperado) {
        double[] notas = {n1, n2};
        assertEquals(esperado, CalculoNotas.promedio(notas));
    }

}
