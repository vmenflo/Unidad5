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
public class lasVecinas {
    /* public static void comprobarVecinas(Autobus autobus, int fila, int columna){
        int iniciof=fila-1;
        int finf=fila+1;
        int inicioC=columna-1;
        int finC=columna+1;
        if(fila==0){iniciof=0;}
        if(fila==11){finf=11;}
        if(columna==0){inicioC=0;}
        if(columna==3){finC=3;}
        if(fila==0&&columna==0){
            iniciof=0;
            finf=1;
            inicioC=0;
            }
        if(fila==0&&columna==3){
            iniciof=0;
            finf=1;
            finC=3;
            }
        if(fila==11&&columna==0){
            iniciof=10;
            finf=11;
            inicioC=0;
            }
        if(fila==11&&columna==3){
            iniciof=10;
            finf=11;
            finC=3;
            }
        
        for(int i= iniciof;i<=finf;i++){//Bucle para recorrer las vecinas
            for(int j=inicioC;j<=finC;j++){
                System.out.println(autobus.getAutobus()[i][j]);
            }
        }
        
    }*/
    
    public static void mostrarVecinas(Autobus bus, int fila, int columna){
        for(int i=(fila-1);i<=(fila+1);i++){
            if(!(i<0||i>=bus.getAutobus().length)){
                for(int j=(columna-1);j<=(columna+1);j++){
                    if(!(j<0||j>=bus.getAutobus()[i].length)){
                        if(!(1==(fila)&&j==(columna))){
                            System.out.println(bus.getAutobus()[i][j]);
                        }
                            
                    }
                }
            }
        }
    }
}
