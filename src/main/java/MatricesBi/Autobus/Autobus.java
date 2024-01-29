/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi.Autobus;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Víctor
 */
public class Autobus {
   //Atributos
    private Asiento[][] autobus;
    
    //Constructor
    public Autobus() {
        this.autobus = MetodosAutobus.generarMatrizAsientos();
    }
    
    //Getter And SETTER
    public Asiento[][] getAutobus() {
        return autobus;
    }

    public void setAutobus(Asiento[][] autobus) {
        this.autobus = autobus;
    }
    
    //To string
    @Override
    public String toString() {
        String libre;
        StringBuilder sb = new StringBuilder();
        sb.append("-------Autobus-------\n");
        for(int i = 0; i < autobus.length; i++) {
            for (int j = 0; j < autobus[i].length; j++) {
                if (autobus[i][j].isLibre()) {
                   libre = "(L)";
                } else {
                   libre = "(R)";
                }
                sb.append(autobus[i][j].getAsiento()).append("").append(autobus[i][j].getLetra()).append(libre).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    //Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Arrays.deepHashCode(this.autobus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autobus other = (Autobus) obj;
        return Arrays.deepEquals(this.autobus, other.autobus);
    }
    
    //Método para coger asiento
    //Método para coger asiento
    public void cogerAsiento(Autobus autobus) {
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
                if ((asiento >= 1 && asiento <= 48) && (autobus.getAutobus()[fila][columna].isLibre())) {
                    System.out.println("¿Tienes móvilidad reducida?");
                    System.out.println("1-Si / 2-No");
                    int numero = teclado.nextInt();
                    switch (numero) {
                        case 1 -> {//Caso de que tengas movilidad reducida
                            //Comprobaciones subyacentes al asiento
                            if (columna == 0) {//Controlo que no se salga de la matriz
                                if (fila == 0) {
                                    // Verificar asientos adyacentes para la esquina superior izquierda
                                    if (autobus.getAutobus()[fila][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila + 1][columna].isLibre()
                                            && autobus.getAutobus()[fila + 1][columna + 1].isLibre()) {
                                        // Reservar asientos
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna + 1].setLibre(false);
                                        autobus.getAutobus()[fila + 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila + 1][columna + 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }
                                } else if (fila == 11) {
                                    // Verificar asientos adyacentes para la esquina inferior izquierda
                                    if (autobus.getAutobus()[fila][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna + 1].isLibre()) {
                                        // Reservar asientos
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna + 1].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna + 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }/*OJOOOOO*/
                                } 
                                
                                   else if (autobus.getAutobus()[fila][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila + 1][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila + 1][columna].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna].isLibre()) {
                                        //Reservo las plazas
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna + 1].setLibre(false);
                                        autobus.getAutobus()[fila + 1][columna + 1].setLibre(false);
                                        autobus.getAutobus()[fila + 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna + 1].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar"
                                                + " este asiento debido a la ubicación.");
                                    }
                                
                                
                            } else if (columna == 3) {
                                if (fila == 0) {
                                    // Verificar asientos adyacentes para la esquina superior derecha
                                    if (autobus.getAutobus()[fila][columna - 1].isLibre()
                                            && autobus.getAutobus()[fila + 1][columna].isLibre()
                                            && autobus.getAutobus()[fila + 1][columna - 1].isLibre()) {
                                        // Reservar asientos
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna - 1].setLibre(false);
                                        autobus.getAutobus()[fila + 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila + 1][columna - 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }
                                } else if (fila == 11) {
                                    // Verificar asientos adyacentes para la esquina inferior derecha
                                    if (autobus.getAutobus()[fila][columna - 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna - 1].isLibre()) {
                                        // Reservar asientos
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna - 1].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna - 1].setLibre(false);
                                        correcto = true;
                                    } else {
                                        System.out.println("No se puede seleccionar este asiento debido a la ubicación.");
                                    }
                                }   
                                /*OJOOOOOOO*/
                                else{
                                if (autobus.getAutobus()[fila][columna - 1].isLibre()
                                        && autobus.getAutobus()[fila + 1][columna - 1].isLibre()
                                        && autobus.getAutobus()[fila + 1][columna].isLibre()
                                        && autobus.getAutobus()[fila - 1][columna - 1].isLibre()
                                        && autobus.getAutobus()[fila - 1][columna].isLibre()) {
                                    //Reservo las plazas
                                    autobus.getAutobus()[fila][columna].setLibre(false);
                                    autobus.getAutobus()[fila][columna - 1].setLibre(false);
                                    autobus.getAutobus()[fila + 1][columna - 1].setLibre(false);
                                    autobus.getAutobus()[fila + 1][columna].setLibre(false);
                                    autobus.getAutobus()[fila - 1][columna - 1].setLibre(false);
                                    autobus.getAutobus()[fila - 1][columna].setLibre(false);

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
                                if (autobus.getAutobus()[fila][columna + 1].isLibre()
                                        && autobus.getAutobus()[fila + 1][columna + 1].isLibre()
                                        && autobus.getAutobus()[fila + 1][columna].isLibre()) {
                                    //Reservamos
                                    autobus.getAutobus()[fila][columna].setLibre(false);
                                    autobus.getAutobus()[fila][columna + 1].setLibre(false);
                                    autobus.getAutobus()[fila + 1][columna + 1].setLibre(false);
                                    autobus.getAutobus()[fila + 1][columna].setLibre(false);
                                    correcto = true;
                                }/* else {
                                    System.out.println("No se puede seleccionar"
                                            + " este asiento debido a la ubicación.");
                                }*/
                                }
                                else if(columna==3){
                                if (autobus.getAutobus()[fila][columna - 1].isLibre()
                                        && autobus.getAutobus()[fila + 1][columna - 1].isLibre()
                                        && autobus.getAutobus()[fila + 1][columna].isLibre()) {
                                    //Reservamos
                                    autobus.getAutobus()[fila][columna].setLibre(false);
                                    autobus.getAutobus()[fila][columna - 1].setLibre(false);
                                    autobus.getAutobus()[fila + 1][columna - 1].setLibre(false);
                                    autobus.getAutobus()[fila + 1][columna].setLibre(false);
                                    correcto = true;
                                }/* else {
                                    System.out.println("No se puede seleccionar"
                                            + " este asiento debido a la ubicación.");
                                }*/
                                }
                            } else if (fila == 11) {
                                //Esquina inferior izquierda
                                if (columna == 0) {
                                    if (autobus.getAutobus()[fila][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna + 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna].isLibre()) {
                                        //Reservamos
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna + 1].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna + 1].setLibre(false);

                                        correcto = true;
                                    } /*else {
                                        System.out.println("No se puede seleccionar"
                                                + " este asiento debido a la ubicación.");
                                    }*/
                                } else if (columna == 3) {
                                    //Esquina inferior derecha
                                    if (autobus.getAutobus()[fila][columna - 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna - 1].isLibre()
                                            && autobus.getAutobus()[fila - 1][columna].isLibre()) {
                                        //Reservamos
                                        autobus.getAutobus()[fila][columna].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna].setLibre(false);
                                        autobus.getAutobus()[fila][columna - 1].setLibre(false);
                                        autobus.getAutobus()[fila - 1][columna - 1].setLibre(false);

                                        correcto = true;
                                    } /*else {
                                        System.out.println("No se puede seleccionar"
                                                + " este asiento debido a la ubicación.");
                                    }*/
                                }
                            }
                        }
                        case 2 -> {//Si no tiene movilidad reducida directamente lo coge
                            autobus.getAutobus()[fila][columna].setLibre(false);
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
