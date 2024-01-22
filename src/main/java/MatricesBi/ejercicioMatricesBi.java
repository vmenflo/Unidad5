/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi;

import java.util.Scanner;

/**
 *
 * @author Víctor
 */
public class ejercicioMatricesBi {
    public static void main(String[] args) {
        /*Realiza un programa que pida al usario el número de filas y columnas
        de un array bidimensional de números enteros. El programa crea la matriz
        con esos tamaños y debe rellenarlas solicitando al usuario los valores a
        introducir. Una vez esté rellena, se debe mostrar la matriz completa y 
        la suma de sus elementos*/
        //Pedimos al usuario las dimensiones
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas filas quieres hacer la matriz?");
        int numeroFilas=teclado.nextInt();
        System.out.println("¿Y, Cuántas columnas?");
        int numeroColumnas=teclado.nextInt();
        
        //Creamos la matriz
        int[][] matriz = new int[numeroFilas][numeroColumnas];
       //Rellenamos mediante un bucle for
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("Fila " + i + ", columna "+j
                        + " que valor quieres introducir? : ");
                matriz[i][j]=teclado.nextInt();
            }
        }
        
        //Lo mostramos
        System.out.println("Esta es la matriz");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("Fila " + i + ", Fila "+j
                        + " : " + matriz[i][j]);
            }
        }
    }
    
}
