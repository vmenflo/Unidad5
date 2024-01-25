/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Víctor
 */
public class MetodosEjercicioMatrizChar {

    //Método para pedir numero filas y columnas y devuelve una matriz
    public static char[][] generarMatrizChar() {
        //Pedimos datos para crear la matriz
        int num = 0;
        boolean valido = false;
        do {//Controlamos que el numero este entre 0 y 10, y posible excepcion
            try {
                num = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Indica número"));
                if(num>0&&num<=10){
                    valido=true;
                }            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Dato introducido incorrecto" + e);
            }
        } while (!valido);
        
        //Creamos raiz para rellenarla de char aleatorios
        char[][] matriz = new char[num][num];
        //Creamos objeto aleatorio
        Random r = new Random();
        int charAleatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Relenamos con chars aleatorios
                int charFinal = 0;
                //Genera 0 o 1 para luego crear minusculas o mayusculas
                charAleatorio = r.nextInt(0, 2);
                if (charAleatorio == 0) {
                    charFinal = r.nextInt(65, 91);//AZ
                } else {
                    charFinal = r.nextInt(97, 123);//az
                }
                //Convertimos el int en un char para almacenarlo
                matriz[i][j] = (char) charFinal;
            }
        }
        return matriz;
    }

    //Metodo que recibe matriz y muestra forma tabulada
    public static void matrizTabulada(char[][] matriz) {
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "  ");  
            }
            System.out.println();
        }
    }
    //Preguntar por char que se desea buscar
    public static char preguntarChar(){
        String caracterString="aey";
        char caracter='a';
        while(caracterString.length()>1){//Controlar solo un digito
            caracterString = JOptionPane.showInputDialog(
                    "¿Cúal caracter deseas encontrar?");
            caracter = caracterString.charAt(0);
        }
        return caracter;
    }
    //Método que recibe la matriz y un char y devuelve una lista de objetos
    //Celda indicando las casillas donde se encuentra ese char dentro de la matriz.
    public static ArrayList<String> buscarChar(char[][] matriz, char caracter){
    ArrayList<String> lista = new ArrayList<>();//Crear ArrayList
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]==caracter){
                    lista.add("Fila " + (i+1) + " Columna " + (j+1));
                }
            }
        }//Bucle para buscar en la matriz el caracter  que deseamos
    //Si está vacío, informa de que no se ha encontrado el elemento
    if(lista.isEmpty()){
        lista.add("No se ha encontrado ningún elemento");
    }
    return lista;
    }
}
