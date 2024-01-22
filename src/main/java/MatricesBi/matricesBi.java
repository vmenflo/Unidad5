/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi;

/**
 *
 * @author Víctor
 */
public class matricesBi {
    public static void main(String[] args) {
        //Matriz de 2x2 de int
        int[][] matrizInt = new int[2][2];
        //Inicialización de valores mutuamente
        
        /*
                Col1    Col2
        Fila 1 --> 3    5
        Fila 2 --> 1    9
        */
        matrizInt[0][0]=3;
        matrizInt[0][1]=5;
        matrizInt[1][0]=1;
        matrizInt[1][1]=9;
        
        System.out.println("Elemento d1 c1 : " + matrizInt[0][0]);
        
        int[][] matrizInt2={
            {3,4,5},
            {6,7,8},
            {9,10,11},
            {0,0,0}
        };
        
        System.out.println("Filas de matriz2: " +matrizInt2.length);
        System.out.println("Colmnas de matriz2 fila 2: " +matrizInt2[1].length);
        
        //Recorrido de todos los elemento de la matriz
        //Recorremos las filas(matrizInt2.length)
        //en cada fila recorremos las columnas (matrizInt2.length)
        
        for(int i=0;i<matrizInt2.length;i++){
            for(int j=0;j<matrizInt2[i].length;j++){
                System.out.println("Elemento i,j " + i + ","+j+ " : " + matrizInt2[i][j]);
            }
        }
    }
}
