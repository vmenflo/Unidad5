/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EstructurasDatos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author victor
 */
public class EstructurasDatos {

    public static void main(String[] args) {
        //Es una lista dinamica. La lista tiene tamaño 0 y sin elementos.
        //Entre los diamantes no se pueden poner primitivos, solo objetos
        ArrayList<Integer> lista = new ArrayList<>();
        //Mostrar el tamaño (size)
        System.out.println("Tamaño " + lista.size());
        //Añadimos un elemento al final de la lista
        lista.add(12);
        lista.add(14);
        lista.add(16);
        lista.add(18);
        
        System.out.println("Tamaño " + lista.size());
        System.out.println(lista);
        
        //Obtener el elemento de la posicion 2
        System.out.println("Elemento posicion 2 " + lista.get(2));
        try{//Try para controlar que no salté la excepcion porque el tamaño es 4 no 10
        System.out.println("Elemento posicion 10: " + lista.get(10));
        } catch(IndexOutOfBoundsException a) {
            System.out.println("Te has salido de los indices");
        }
        
        // add(int index, Integer element) añade elemento en la posicion indicada
        // la posicion debe ser >= 0 y <= tamaño
        lista.add(2, 20);
        System.out.println(lista);
        
        //Como cambiar un dato
        System.out.println("Cambiamos el 12 por un 10");
        lista.set(0, 10);
        System.out.println(lista);
        
        //Nos dice si esta vacia o llena el isEmpty
        if(lista.isEmpty()){
            System.out.println("La lista esta vacía");
        }else {System.out.println("La lista llena");}
        
        System.out.println("Elemento 18 en la lista: " + lista.contains(18));
        System.out.println("Posición donde esta el elemento 10 -> " + lista.indexOf(10));
        
        // Borrar elementos por objeto
        lista.remove(Integer.valueOf(20));
        //lista.remove(2); lo que hace es borrar la posicion 2 que es el valor 20
        System.out.println(lista);
        
        //Formas de recorrer una lista:
        //Bucle for
        System.out.println("Bucle for, da mas fuego porque puedes usar i");
        for(int i=0;i< lista.size();i++){
            System.out.println("En la posicion " + i + " se encuentra el número " 
                    + lista.get(i));
        }
        
        //Foreach
        System.out.println("Foreach, para mostrar es cómodo pero esta mas "
                + "limitado ya que no puedes usar la posicion");
        for(Integer aux:lista){
            System.out.println("Número: " + aux);
        }
        
        //Iterador, es una estructura que recorre los elementos de una coleccion tipo set, map o list
        System.out.println("Mostrar con Iterador");
        Iterator<Integer> it = lista.iterator();
        while(it.hasNext()){ //Mientras halla elementos
            System.out.println(it.next()); //muestra el elemento
        }
        
        System.out.println("----------------------------------");
        //Mostramos con una expresion Lambda y api Steam
        //Por cada elemento, muestra el elemento
        lista.forEach(e->System.out.println("El elemento es: " + e));
        // Esto es el resumen de la sentencia anterior, es lo mismo pero mas corto
        lista.forEach(System.out::println);
        
        
    }
}
