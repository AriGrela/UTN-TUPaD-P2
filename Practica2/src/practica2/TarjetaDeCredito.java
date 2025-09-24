/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

public class TarjetaDeCredito {
 private String entidadBancaria;
 private String nroTarjeta;
 private double saldo;
 private EntidadFinanciera entidadFinanciera;
 private Persona titular;
 
 public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double Saldo, Persona titular, EntidadFinanciera entidadFinanciera ){
    this.entidadBancaria = entidadBancaria;
    this.nroTarjeta = nroTarjeta;
    this.saldo = saldo;
    this.titular = titular;
    this.entidadFinanciera = entidadFinanciera;
    
 }
 
 public boolean tieneSaldoDisponible(double monto){
     return saldo >= monto;
 }
 
 public void descontar(double monto) {
     saldo = saldo - monto;
     }
 
 public String nombreCompletodeTitular(){
     return titular.nombreCompleto();
 }
}
