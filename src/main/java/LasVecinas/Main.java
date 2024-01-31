/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LasVecinas;

import MatricesBi.Autobus.Autobus;

/**
 *
 * @author Víctor
 */
public class Main {
    public static void main(String[] args) {
        Autobus bus = new Autobus();
        System.out.println(bus);
        
        
        bus.getAutobus()[0][1].setLibre(false);
        System.out.println(bus);
        
        lasVecinas.mostrarVecinas(bus, 1, 0);
        
    }
}
