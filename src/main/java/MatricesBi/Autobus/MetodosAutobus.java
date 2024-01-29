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
public class MetodosAutobus {

    //Método generar matriz y rellenarla de asientos
    public static Asiento[][] generarMatrizAsientos() {
        Asiento asiento;
        Asiento[][] matriz = new Asiento[12][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                asiento = new Asiento();
                matriz[i][j] = asiento;
            }
        }
        return matriz;
    }
}
