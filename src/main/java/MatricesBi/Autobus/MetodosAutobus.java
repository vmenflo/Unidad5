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

    //Mostrar matriz
    public static void mostrarMatriz(Asiento[][] matriz) {
        System.out.println("------VicoBUS------");
        String libre = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isLibre()) {
                    libre = "(L)";
                } else {
                    libre = "(R)";
                }
                System.out.print(matriz[i][j].getAsiento() + "" + matriz[i][j].getLetra() + libre + " ");
            }
            System.out.println();
        }

    }

    //Método para coger asiento
    public static void cogerAsiento(Asiento[][] matriz) {
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;//Control bucle
        int fila = 0;
        int columna = 0;
        do {
            //Preguntamos al usuario por el asiento
            System.out.println("Selecciona el Numero (1-48) que esté Libre (L)");
            try {
                int asiento = teclado.nextInt();
                fila = (asiento - 1) / 4;
                columna = (asiento - 1) % 4;//Nos devuelve 0, 1, 2 , 3
                //Si asiento esta entre 1 y 48, y está libre sigue
                if ((asiento >= 1 && asiento <= 48) && (matriz[fila][columna].isLibre())) {
                    System.out.println("¿Tienes móvilidad reducida?");
                    System.out.println("1-Si / 2-No");
                    int numero = teclado.nextInt();
                    switch (numero) {
                        case 1 -> {//Caso de que tengas movilidad reducida
                            //Comprobaciones subyacentes al asiento
                            if (columna == 0) {//Controlo que no se salga de la matriz
                                if (fila == 0) {
                                    // Verificar asientos adyacentes para la esquina superior izquierda
                                    if (matriz[fila][columna + 1].isLibre()
                                            && matriz[fila + 1][columna].isLibre()
                                            && matriz[fila + 1][columna + 1].isLibre()) {
                                        // Reservar asientos
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila][columna + 1].setLibre(false);
                                        matriz[fila + 1][columna].setLibre(false);
                                        matriz[fila + 1][columna + 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }
                                } else if (fila == 11) {
                                    // Verificar asientos adyacentes para la esquina inferior izquierda
                                    if (matriz[fila][columna + 1].isLibre()
                                            && matriz[fila - 1][columna].isLibre()
                                            && matriz[fila - 1][columna + 1].isLibre()) {
                                        // Reservar asientos
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila][columna + 1].setLibre(false);
                                        matriz[fila - 1][columna].setLibre(false);
                                        matriz[fila - 1][columna + 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }/*OJOOOOO*/
                                } 
                                
                                   else if (matriz[fila][columna + 1].isLibre()
                                            && matriz[fila + 1][columna + 1].isLibre()
                                            && matriz[fila + 1][columna].isLibre()
                                            && matriz[fila - 1][columna + 1].isLibre()
                                            && matriz[fila - 1][columna].isLibre()) {
                                        //Reservo las plazas
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila][columna + 1].setLibre(false);
                                        matriz[fila + 1][columna + 1].setLibre(false);
                                        matriz[fila + 1][columna].setLibre(false);
                                        matriz[fila - 1][columna + 1].setLibre(false);
                                        matriz[fila - 1][columna].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar"
                                                + " este asiento debido a la ubicación.");
                                    }
                                
                                
                            } else if (columna == 3) {
                                if (fila == 0) {
                                    // Verificar asientos adyacentes para la esquina superior derecha
                                    if (matriz[fila][columna - 1].isLibre()
                                            && matriz[fila + 1][columna].isLibre()
                                            && matriz[fila + 1][columna - 1].isLibre()) {
                                        // Reservar asientos
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila][columna - 1].setLibre(false);
                                        matriz[fila + 1][columna].setLibre(false);
                                        matriz[fila + 1][columna - 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }
                                } else if (fila == 11) {
                                    // Verificar asientos adyacentes para la esquina inferior derecha
                                    if (matriz[fila][columna - 1].isLibre()
                                            && matriz[fila - 1][columna].isLibre()
                                            && matriz[fila - 1][columna - 1].isLibre()) {
                                        // Reservar asientos
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila][columna - 1].setLibre(false);
                                        matriz[fila - 1][columna].setLibre(false);
                                        matriz[fila - 1][columna - 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }
                                }   
                                /*OJOOOOOOO*/
                                else{
                                if (matriz[fila][columna - 1].isLibre()
                                        && matriz[fila + 1][columna - 1].isLibre()
                                        && matriz[fila + 1][columna].isLibre()
                                        && matriz[fila - 1][columna - 1].isLibre()
                                        && matriz[fila - 1][columna].isLibre()) {
                                    //Reservo las plazas
                                    matriz[fila][columna].setLibre(false);
                                    matriz[fila][columna - 1].setLibre(false);
                                    matriz[fila + 1][columna - 1].setLibre(false);
                                    matriz[fila + 1][columna].setLibre(false);
                                    matriz[fila - 1][columna - 1].setLibre(false);
                                    matriz[fila - 1][columna].setLibre(false);

                                    correcto = true;
                                } else {
                                    System.out.println("No se puede "
                                            + "seleccionar este asiento "
                                            + "debido a la ubicación.");
                                }
                                }
                            } else {
                                System.out.println("Lo siento, no puedes "
                                        + "seleccionar un asiento de pasillo.");

                            }
                            if (fila == 0) {//Controlo que no se salga de la matriz
                                if(columna==0){
                                if (matriz[fila][columna + 1].isLibre()
                                        && matriz[fila + 1][columna + 1].isLibre()
                                        && matriz[fila + 1][columna].isLibre()) {
                                    //Reservamos
                                    matriz[fila][columna].setLibre(false);
                                    matriz[fila][columna + 1].setLibre(false);
                                    matriz[fila + 1][columna + 1].setLibre(false);
                                    matriz[fila + 1][columna].setLibre(false);
                                    correcto = true;
                                }/* else {
                                    System.out.println("No se puede seleccionar"
                                            + " este asiento debido a la ubicación.");
                                }*/
                                }
                                else if(columna==3){
                                if (matriz[fila][columna - 1].isLibre()
                                        && matriz[fila + 1][columna - 1].isLibre()
                                        && matriz[fila + 1][columna].isLibre()) {
                                    //Reservamos
                                    matriz[fila][columna].setLibre(false);
                                    matriz[fila][columna - 1].setLibre(false);
                                    matriz[fila + 1][columna - 1].setLibre(false);
                                    matriz[fila + 1][columna].setLibre(false);
                                    correcto = true;
                                }/* else {
                                    System.out.println("No se puede seleccionar"
                                            + " este asiento debido a la ubicación.");
                                }*/
                                }
                            } else if (fila == 11) {
                                //Esquina inferior izquierda
                                if (columna == 0) {
                                    if (matriz[fila][columna + 1].isLibre()
                                            && matriz[fila - 1][columna + 1].isLibre()
                                            && matriz[fila - 1][columna].isLibre()) {
                                        //Reservamos
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila - 1][columna].setLibre(false);
                                        matriz[fila][columna + 1].setLibre(false);
                                        matriz[fila - 1][columna + 1].setLibre(false);

                                        correcto = true;
                                    } /*else {
                                        System.out.println("No se puede seleccionar"
                                                + " este asiento debido a la ubicación.");
                                    }*/
                                } else if (columna == 3) {
                                    //Esquina inferior derecha
                                    if (matriz[fila][columna - 1].isLibre()
                                            && matriz[fila - 1][columna - 1].isLibre()
                                            && matriz[fila - 1][columna].isLibre()) {
                                        //Reservamos
                                        matriz[fila][columna].setLibre(false);
                                        matriz[fila - 1][columna].setLibre(false);
                                        matriz[fila][columna - 1].setLibre(false);
                                        matriz[fila - 1][columna - 1].setLibre(false);

                                        correcto = true;
                                    } /*else {
                                        System.out.println("No se puede seleccionar"
                                                + " este asiento debido a la ubicación.");
                                    }*/
                                }
                            }
                        }
                        case 2 -> {//Si no tiene movilidad reducida directamente lo coge
                            matriz[fila][columna].setLibre(false);
                            correcto = true;
                        }

                    }

                } else {
                    System.out.println("El asiento no está disponible");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al introducir el dato");
            }
        } while (!correcto);

    }
}
