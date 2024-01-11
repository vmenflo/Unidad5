/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author victor
 */
public class CatalogoLibros {
    public static void main(String[] args) {
        //Creamos un objeto
        Libro l1= new Libro("123", "platero y yo", "RJR", 
                "planeta", 123);
        Libro l3= new Libro("13", "platero y yo", "RJR", 
                "planeta", 123);
        
        //Hacer copia sin alias
        Libro l2 = new Libro(l1);
        
          /*
        System.out.println(l2);
        System.out.println("Son iguales L1 y L2? " + l1.equals(l2));
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        
        //L3 es distinto por tanto:
        System.out.println("Son iguales l1 y l3 ? " + l1.equals(l3));
        System.out.println(l1.hashCode());
        System.out.println(l3.hashCode());*/
        
        //Hacemos una lista de libros
        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Libro("123", "platero y yo", "Aiman", 
                "planeta", 123));
        lista.add(new Libro("321", "Quijote", "RJR", 
                "planeta", 50));
        lista.add(new Libro("13", "Caperucita", "Manolo", 
                "planeta", 125));
        
        lista.forEach(System.out::println);
        
        //Vamos a ordenarlos por isb
        /*
        Expresión Lambda con Collections

        Parámetros → Función
        (Libro e1, Libro e2)*El ya sabe que son libros, porque la lista contiene libros*  → 
        (e1.e2) → e1.getIsbn().compareToIgnoreCase(e2.getIsbn());

        *Está comparando un String (Isbn) con otro String(Isbn), si el Isbn de 1 es más grande que Isbn de 2, lo cambia de sitio*

        */
        System.out.println("-----------------");
        Collections.sort(lista, 
                (e1,e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        lista.forEach(System.out::println);
        
        // Lo ordenamos por numero de paginas, al tratarse de Integer
        // Podemos hacerlo de las siguientes formas:
        //Opcion 1
        /*
        Collections.sort(lista, 
                (k1,k2)-> k1.getNumPag() - k2.getNumPag());*/
        //Opcion 2 
        Collections.sort(lista, 
                (k1,k2)-> Integer.compare(k1.getNumPag(), k2.getNumPag()));
        
        System.out.println("---------- Ordenar por NumPaginas");
        lista.forEach(System.out::println);
        
        //Ordenamos por autor
        System.out.println("Ordenamos por el autor------------");
        Collections.sort(lista, 
                (e1,e2)->e1.getAutor().compareToIgnoreCase(e2.getAutor()));
        lista.forEach(System.out::println);
        
        //Para poder usar un criterio como ordenar por autor, creamos un comparator
        Comparator<Libro> criterioAutor = (e1,e2)->e1.getAutor().compareToIgnoreCase(e2.getAutor());
        //Es la condicion de antes pero metido en la variable criterioAutor
        //Para ordenador por ejemplo de mayor a menor. De tal forma:
        //Usamos el collections para ordenar, usamos el criterio por autor 
        // (menor a mayor) y luego le aplicamos reversed para que lo haga de mayor a menor
        Collections.sort(lista, criterioAutor.reversed());
        System.out.println("Ordenamos por el autor de mayor a menor------------");
        lista.forEach(System.out::println);
        
        //Recibe la lista donde buscar, un objeto del mismo tipo que contiene la lista
        //Con la clave a buscar y el criterio de ordenacion de la lista:
        /*
        Búsqueda Binaria
        Collections.BinarySearch(
        1- lista
        2- objeto con el atributo a buscar
        3- Criterio por algún atributo el mismo que estoy buscando
        )
        PREVIAMENTE LA LISTA DEBE ESTAR ORDENADA POR 3
        
        */
        //Antes los ordenamos por isbn
        
        Collections.sort(lista, 
                (e1,e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        Libro x = new Libro();
        x.setIsbn("Hola");
        int posicion = Collections.binarySearch(
                lista, 
                x, 
                (e1,e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        
        System.out.println("El libro de isb hola esta en " + posicion);
    }
}
