/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author USUARIO
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal objAnimal=new Animal();
        objAnimal.crearAnimal("huzky","negro","Luna");
        
        System.out.println("Animal creado");
        System.out.println("raza: "+ objAnimal.getRaza());
        System.out.println("color: "+ objAnimal.getColor());
        System.out.println("Nombre: "+ objAnimal.getNombre());
        
        objAnimal.crearAnimal("dalmata","blanco","Manchas");
        System.out.println("Animal creado");
        System.out.println("raza: "+ objAnimal.getRaza());
        System.out.println("color: "+ objAnimal.getColor());
        System.out.println("Nombre: "+ objAnimal.getNombre());
    }
    
}
