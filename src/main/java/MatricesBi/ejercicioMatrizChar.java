/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi;

import java.util.ArrayList;

/**
 *
 * @author Víctor
 */
public class ejercicioMatrizChar {

    public static void main(String[] args) {
        //Creamos matriz y la rellenamos con char aleatorios
        char[][] matriz = MetodosEjercicioMatrizChar.generarMatrizChar();
        //La mostramos
        MetodosEjercicioMatrizChar.matrizTabulada(matriz);
        //Método para buscar un char concreto
        ArrayList<String> lista;
        lista = MetodosEjercicioMatrizChar.buscarChar(
                matriz, MetodosEjercicioMatrizChar.preguntarChar());
        //Mostramos la lista
        System.out.println(lista);
    }

}
