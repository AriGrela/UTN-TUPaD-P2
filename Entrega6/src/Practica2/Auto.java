package Practica2;


public class Auto {

    private String patente;
    private String color;
    private int kmsRecorridos;
    
    public Auto(String patente, String color, int kmsRecorridos){
        this.patente = patente;
        this.color = color;
        this.kmsRecorridos = kmsRecorridos;
        
    }

    public String getPatente() {
        return patente;
    }

    
    public int getKmsRecorridos() {
        return kmsRecorridos;
    }
    
    
    
    @Override
    public String toString(){
        return "Auto{" + "patente=" + patente + ", color=" + color + "}";
    }

    
}