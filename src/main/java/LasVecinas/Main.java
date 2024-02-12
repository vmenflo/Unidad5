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
public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int acumulador=0;
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=++acumulador;
            }
        }
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
       
        LasVecinas.lasVecinas.mostrarVecinas(matriz, 2, 2);
    }
}
