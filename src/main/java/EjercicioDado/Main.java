/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDado;

/**
 *
 * @author victor
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        //Generamos una lista sin parametros
        LanzarDado lista1 = new LanzarDado();
        System.out.println(lista1);
        
        //Generamos una lista con parametros de 7 tiradas
        LanzarDado lista2 = new LanzarDado(6);
        System.out.println(lista2);
        
        //Llamamos al metodo para contar caras
        try{
        System.out.println("El número 6 ha salido en " + lista2.contarVeces(6) +" tiradas.");
        }catch (Exception v) {System.out.println(v);}
        
        //Llamamos al metodo para borrar determinadas caras
        try{
        lista2.borrarCara(5);
        }catch (Exception v) {System.out.println(v);}
        System.out.println(lista2);
        
    }
    
}
