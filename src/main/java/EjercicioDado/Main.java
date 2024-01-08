/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDado;

/**
 *
 * @author victor
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Generamos una lista sin parametros
        LanzarDado lista1 = new LanzarDado();
        System.out.println(lista1);
        
        //Generamos una lista con parametros de 7 tiradas
        LanzarDado lista2 = new LanzarDado(7);
        System.out.println(lista2);
        
        
    }
    
}
