/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsYComparator;

import java.util.Objects;

/**
 *
 * @author victor
 */
public class Libro {
    
    //Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int numPag;

    //Metodo que hace una copia
    
    public Libro(Libro origen) {
        this.autor = origen.autor;
        this.editorial=origen.editorial;
        this.isbn=origen.isbn;
        this.numPag=origen.numPag;
        this.titulo=origen.titulo;
        
    }
    
    // Constructor
    public Libro(String isbn, String titulo, String autor, String editorial, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPag = numPag;
    }

    public Libro() {
    }

    
    //Getter and Setters
    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
    // To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("isbn=").append(isbn);
        sb.append(", titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", editorial=").append(editorial);
        sb.append(", numPag=").append(numPag);
        sb.append('}');
        return sb.toString();
    }
    
    //Equals y HashCode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.isbn);
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.autor);
        hash = 97 * hash + Objects.hashCode(this.editorial);
        hash = 97 * hash + this.numPag;
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
        final Libro other = (Libro) obj;
        if (this.numPag != other.numPag) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.editorial, other.editorial);
    }
    
    
    
}
