/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsYComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author victor
 */
public class GuiaSeries {

    public static void main(String[] args) {
        //Creo 3 series
        Series serie1 = new Series("Los Soprano", "HBO",
                10, "Tony Soprano");
        Series serie2 = new Series("Narcos", "Netflix",
                4, "Pablo Escobar");
        Series serie3 = new Series("El Mandaloriano", "Disney",
                3, "Mandaloriano");
        Series serie4 = new Series("The bear", "GMX",
                2, "Carmen");

        //Creamos una Array de objetos series
        ArrayList<Series> guia = new ArrayList<>();
        guia.add(serie1);
        guia.add(serie2);
        guia.add(serie3);
        guia.add(serie4);

        guia.forEach(System.out::println);

        //Vamos a almacenar en variables los distintos criterios por donde podemos ordenar
        Comparator<Series> ordenarTitulo = (e1, e2)
                -> e1.getTítulo().compareToIgnoreCase(e2.getTítulo());
        Comparator<Series> ordenarProductora = (e1, e2)
                -> e1.getProductora().compareToIgnoreCase(e2.getProductora());
        Comparator<Series> ordenarTemporadas = (e1, e2)
                -> Integer.compare(e1.getTemporadas(), e2.getTemporadas());
        Comparator<Series> ordenarPrincipal = (e1, e2)
                -> e1.getActorPrincipal().compareToIgnoreCase(e2.getActorPrincipal());
        //Ordenamos por diferentes criterios y mostramos
        System.out.println(" ");
        System.out.println("---------Ordenar por título");
        Collections.sort(guia, ordenarTitulo);
        guia.forEach(System.out::println);
        
        System.out.println(" ");
        System.out.println("---------Ordenar por Productora");
        Collections.sort(guia, ordenarProductora);
        guia.forEach(System.out::println);
        
        System.out.println(" ");
        System.out.println("---------Ordenar por Temporadas");
        Collections.sort(guia, ordenarTemporadas);
        guia.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------Ordenar por Actor Principal");
        Collections.sort(guia, ordenarPrincipal);
        guia.forEach(System.out::println);

        //Hacemos una busqueda especifica con binary search, para ello antes 
        //hay que ordenarlos del mismo atributo que lo vas a buscar
        //Vamos a buscar por titulo
        Collections.sort(guia, ordenarTitulo);
        Series x = new Series();
        x.setTítulo("The bear");
        int posicion = Collections.binarySearch(guia,
                x,
                ordenarTitulo);
        
        System.out.println(" ");
        System.out.println(serie4.getTítulo() + " se encuentra en la posición "
                + (posicion+1));
        //Criterio teniendo en cuenta titulo y temporadas
        Comparator<Series> criterioTituloTemporada = ordenarTitulo.thenComparing(ordenarTemporadas);
    }
}
