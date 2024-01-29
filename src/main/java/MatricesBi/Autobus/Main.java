/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi.Autobus;

import java.util.Scanner;

/**
 *
 * @author Víctor
 */
public class Main {
    public static void main(String[] args) {
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);
        /*
        //Generar Matriz Autobus
        Asiento[][] autobus=MetodosAutobus.generarMatrizAsientos();
        //Mostrar
        
        */
        //Creamos el objeto autobus
        Autobus autobus = new Autobus();
        
        do{
        System.out.println(autobus);
        autobus.cogerAsiento(autobus);
        System.out.println(autobus);
        System.out.println("Quieres salir? 1 Si / 2 No");
        int eleccion = teclado.nextInt();
        if(eleccion==1){
            salir=true;
        }
        }while(!salir);
    }
}
