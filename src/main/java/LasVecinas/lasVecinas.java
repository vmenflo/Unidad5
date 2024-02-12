/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LasVecinas;

import MatricesBi.Autobus.Autobus;

/**
 *
 * @author Víctor
 */
public class lasVecinas {

    public static void mostrarVecinas(int[][] matriz, int fila, int columna) {
        for (int i = (fila - 1); i <= (fila + 1); i++) {
            if (!(i < 0 || (i >= matriz.length))) {
                for (int j = (columna - 1); j <= (columna + 1); j++) {
                    if (!(j < 0 || j >= matriz[i].length)) {
                        if (!(i == (fila) && j == (columna))) {
                            System.out.print(matriz[i][j]+" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
