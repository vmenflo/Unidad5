/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsYComparator;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author victor
 */
public class Series {
    
    //Atributos
    private String título;
    private String productora;
    private int temporadas;
    private String actorPrincipal;
    
    //Método copia
    public Series(Series original) {
        this.título = original.título;
        this.productora = original.productora;
        this.temporadas = original.temporadas;
        this.actorPrincipal = original.actorPrincipal;
    }
    
    
    //Constructor
    public Series() {
    }

    
    public Series(String título, String productora, int temporadas, String actorPrincipal) {
        this.título = título;
        this.productora = productora;
        this.temporadas = temporadas;
        this.actorPrincipal = actorPrincipal;
    }
    
    //Getter and Setters

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }
    
    //To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Series{");
        sb.append("t\u00edtulo=").append(título);
        sb.append(", productora=").append(productora);
        sb.append(", temporadas=").append(temporadas);
        sb.append(", actorPrincipal=").append(actorPrincipal);
        sb.append('}');
        return sb.toString();
    }
    
    //HashCode y Equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.título);
        hash = 41 * hash + Objects.hashCode(this.productora);
        hash = 41 * hash + this.temporadas;
        hash = 41 * hash + Objects.hashCode(this.actorPrincipal);
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
        final Series other = (Series) obj;
        if (this.temporadas != other.temporadas) {
            return false;
        }
        if (!Objects.equals(this.título, other.título)) {
            return false;
        }
        if (!Objects.equals(this.productora, other.productora)) {
            return false;
        }
        return Objects.equals(this.actorPrincipal, other.actorPrincipal);
    }
    
    
}
