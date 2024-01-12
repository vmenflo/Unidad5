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

  
}
