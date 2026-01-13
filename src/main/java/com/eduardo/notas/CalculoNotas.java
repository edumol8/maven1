
package com.eduardo.notas;

public class CalculoNotas {

    public static double promedio(double[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("El arreglo de notas no puede ser nulo o vacío");
        }

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }
}

//Eduardo Molina Evaluación Parcial 2