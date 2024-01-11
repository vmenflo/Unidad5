/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPropuestoListas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Víctor
 *
 * En un programa nuevo, crea dos listas de tamaño aleatorio de letras entre la
 * 'a' y la 'z'. Estas listas deben tener entre 10 y 20 elementos. Una vez
 * creadas las listas, imprime por pantalla sus elementos usando un foreach.
 * Crea una tercera lista con los elementos de la primera que no están en la
 * segunda. Imprime el resultado usando API Stream y lambdas.
 */
public class Main {

    public static void main(String[] args) {
        //Generamos lista 1 y 2 de Characters
        ArrayList<Character> lista = generarArrayList();
        ArrayList<Character> lista2 = generarArrayList();
        //Lo mostramos usando un foreach
        System.out.println("Lista 1: ");
        for (Character aux : lista) {
            System.out.println(aux);
        }
        //Lo mostramos usando un foreach
        System.out.println("Lista 2: ");
        for (Character aux : lista2) {
            System.out.println(aux);
        }

        //Generamos la lista 3
        ArrayList<Character> lista3 = generarArraySobrante(lista, lista2);
        //Lo mostramos usando Lambda
        System.out.println("Lista 3: ");
        lista3.forEach(e->System.out.println(e));;

    }

    //Crear Arraylist aleatorias
    public static ArrayList<Character> generarArrayList() {
        //Creo la ArrayList de Character
        ArrayList<Character> lista = new ArrayList<>();
        //Creo objeto random
        Random r = new Random(); 
        int tamañoAleatorio = r.nextInt(10, 21);
        
        //Bucle para rellenar la lista
        for (int i = 0; i < tamañoAleatorio; i++) {
            char aleatorioLetra = (char) r.nextInt(97, 123);
            //Selecciona aleatoriamente un entero que equivale a una letra char
            lista.add(aleatorioLetra);
        }
        return lista;
    }

    //Método para crear una lista con char que no han salido aún
    public static ArrayList<Character> generarArraySobrante(
            ArrayList<Character> lista1, ArrayList<Character> lista2) {
        ArrayList<Character> lista = new ArrayList<>();
        char letra = 'a';
        for (int i = 0; i < 25; i++) {
            if ((lista1.contains(letra)) && !(lista2.contains(letra))) {
                lista.add(letra);
            }//Si la letra esta en la lista1 y no en la lista2, la añade
            letra++;//La sumo para que elija la próxima letra
        }
        return lista;
    }
}
