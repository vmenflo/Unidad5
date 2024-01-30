/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesBi.Autobus;

/**
 *
 * @author Víctor
 */
public class Asiento {
    //Atributos
    private static int contador=1;
    private static char contadorChar=65;
    private int asiento;
    private char letra;
    private boolean libre;
    
    //Constructor
    public Asiento() {
        //Va añadiendo los asientos de forma automatica
        this.asiento= contador++;//Controlar limite
        if(contadorChar>68){
            contadorChar=65;
        }
        this.letra = contadorChar++;
        this.libre = true;
    }
    //GETTER AND SETTER
    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
    //TO STRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asiento{");
        sb.append("asiento=").append(asiento);
        sb.append(", letra=").append(letra);
        sb.append(", libre=").append(libre);
        sb.append('}');
        return sb.toString();
    }
    
    //EQUALS Y HASH
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.contador;
        hash = 29 * hash + this.contadorChar;
        hash = 29 * hash + this.asiento;
        hash = 29 * hash + this.letra;
        hash = 29 * hash + (this.libre ? 1 : 0);
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
        final Asiento other = (Asiento) obj;
        if (this.contador != other.contador) {
            return false;
        }
        if (this.contadorChar != other.contadorChar) {
            return false;
        }
        if (this.asiento != other.asiento) {
            return false;
        }
        if (this.letra != other.letra) {
            return false;
        }
        return this.libre == other.libre;
    }
    
}
