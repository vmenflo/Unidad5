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
public class Autobus {
    public static void main(String[] args) {
        //Generar Matriz Autobus
        Asiento[][] autobus=MetodosAutobus.generarMatrizAsientos();
        //Mostrar
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);
        do{
        MetodosAutobus.mostrarMatriz(autobus);
        MetodosAutobus.cogerAsiento(autobus);
        MetodosAutobus.mostrarMatriz(autobus);
        System.out.println("Quieres salir? 1 Si / 2 No");
        int eleccion = teclado.nextInt();
        if(eleccion==1){
            salir=true;
        }
        }while(!salir);
        
    }
}
