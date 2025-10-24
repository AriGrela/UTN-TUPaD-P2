/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces2;

/**
 *
 * @author Kalfito
 */
public class Persona implements Identificable{
      private String DNI;
    
    public Persona(String DNI){
        this.DNI = DNI;
    }
    
    @Override
    public void mostrarIdentificacion(){
        System.out.println(this.DNI);
    }
}
