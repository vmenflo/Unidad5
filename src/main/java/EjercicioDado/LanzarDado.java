/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author victor
 */
public class LanzarDado {

    //Atributos
    private final int NUM_MIN = 1;
    private final int NUM_MAX = 7;
    final int NUMERO_LIMITE_1000 = 1000;
    private ArrayList<Integer> lista; //Array
    private int aleatorio = 0;
    private Random r = new Random(); //Creamos el objeto aleatorio

    //Constructor con 1_000 lanzamientos
    public LanzarDado() {
        this.lista = new ArrayList<>();
        for (int i = 0; i < NUMERO_LIMITE_1000; i++) {
            aleatorio = r.nextInt(NUM_MIN, NUM_MAX);

            this.lista.add(aleatorio);
        }

    }

    //Contructor parametrizado
    public LanzarDado(int numero) {
        this.lista = new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            aleatorio = r.nextInt(NUM_MIN, NUM_MAX);
            //Me genera un aleatorio y lo añade a la lista
            this.lista.add(aleatorio);
        }
    }

    //Getter and Setters
    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    //To_String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LanzarDado{");
        //sb.append("Lista=").append(lista);
        for (int i = 0; i < lista.size(); i++) {
            sb.append("\n Posicion: " + i);
            sb.append(" - Número: " + lista.get(i));
        }
        sb.append('}');
        return sb.toString();
    }

    //Método para contar las veces que ha salido un determinado número
    public int contarVeces(int entero) throws Exception {

        if (entero < 1 || entero > 6) {//Lanza excepcion si el numero esta fuera del dado
            throw new Exception("Solo números entre 1 y 6");
        }

        int repetido = 0;//Para contar las veces que se repite
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == entero) {
                ++repetido;
            }
        }
        return repetido;
    }

    //Método para borrar las posiciones con una determinada cara
    
    public void borrarCara(int entero)throws Exception {
        if (entero < 1 || entero > 6) {//Lanza excepcion si el numero esta fuera del dado
            throw new Exception("Solo números entre 1 y 6");
        }
        //Creamos el objeto iterator
        Iterator<Integer> it = lista.iterator();
        //Bucle- mientras halla elemento, si el numero es igual eliminalo
        while(it.hasNext()){ //Mientras halla elementos
            int numero = it.next();
            if(numero==entero){
                //Si coincide lo borra
                it.remove();
            }
           
        }
    }
}
