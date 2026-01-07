/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo044 {

    public static void main(String[] args) {

        int[][] arreglo1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] arreglo2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] arreglo3 = llenarMatriz(arreglo1, arreglo2);

        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
    }

    public static int[][] llenarMatriz(int[][] x, int[][] y) {
        int[][] z = new int[3][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                z[i][j] = obtenerMultiplicacion(x[i][j], y[i][j]);
            }
        }
        return z;
    }

    public static void obtenerReporte(int[][] arreglo) {
        String cadena = "";

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                cadena += arreglo[i][j] + "\t";
            }
            cadena += "\n";
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        return a * b;
    }
}
