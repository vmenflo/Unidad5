/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package CollectionsYComparator;

/**
 *
 * @author victor
 *
 * Para manipular grandes volumnes de informacion y no hay que tratar esos datos
 */
//Con esto ya tenemos todo la clase objeto de libro con getter, setter, constructor ...
public record NewRecord(String isbn, String titulo, String autor,
        String editorial, int numPag) {

    //CONTRUCTOR
    public NewRecord(String isbn, String titulo, String autor, String editorial, int numPag) {    
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPag = numPag;
    }
    //CONSTRUCTOR POR DEFECTO
    //Es correcto pero no el mejor
    public NewRecord() {
        this("","","","",0);
    }
    //Es mejor de esta forma
    public static NewRecord crearPorDefecto(){
        return new NewRecord("","","","",0);
    }
    //Es aún mejor así
    public static NewRecord crearLibroyISBN(String isbn) {
        return new NewRecord(isbn,"","","",0);
    }
    // Método para hacer una copia
    public static NewRecord copia(NewRecord origen){
        return new NewRecord(origen.isbn,origen.titulo,
                origen.autor,origen.editorial, origen.numPag());
    }

    //GETTER
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumPag() {
        return numPag;
    }

    
}
