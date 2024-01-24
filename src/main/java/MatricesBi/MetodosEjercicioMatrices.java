/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi;

/**
 *
 * @author Víctor
 *
 *
 * """"""""""""""""""""""""""""""n columnas""""""""""" suma de esa colunmas
 */
public class MetodosEjercicioMatrices {

    //Metodo que recibe matriz y muestra forma tabulada
    public static void matrizTabulada(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.printf("%-5d", matriz1[j]);
            }
            System.out.println(); // Nueva línea para cada fila
        }
    }

    //Método para hacer la sumatoria de los numeros de la raiz
    public static int sumatoria(int[][] matriz) {
        int sumatoria = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumatoria += matriz[i][j];
            }
        }
        return sumatoria;
    }

    //Metodo qu reciba la matriz, n filas y devuelva la suma de esa fila
    public static int sumarfilas(int[][] matriz, int numFilas) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[numFilas][j];
        }
        return suma;
    }

    //Método para que reciba la columna y sume los números
    public static int sumarColumnas(int[][] matriz, int numColum) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][numColum];
        }
        return suma;
    }
}
