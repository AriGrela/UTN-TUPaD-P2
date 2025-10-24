/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;


public class Main {
    public static void main(String[] args){
        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();
        
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new Persona());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        
        p.hacerCampania();
        
        
    }
}
