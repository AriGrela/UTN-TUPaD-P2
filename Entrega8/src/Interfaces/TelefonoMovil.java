/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Kalfito
 */
public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje{
    
    public void llamar(){ 
        System.out.println("Llamando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.print("Conectando con la APi de whatsapp para enviar un mensaje que dice: " + mensaje);
    }
    
    
}
