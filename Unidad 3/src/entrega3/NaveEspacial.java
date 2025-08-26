package entrega3;

public class NaveEspacial {
    
    private String nombre;
    private double combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= 100){
        this.combustible = combustible;
     }
    }
    
    public void despegar(){
        if (combustible >= 1){
            System.out.println("Despegando en 3.. 2.. 1..");
        }else{
            System.out.println("No hay combustible para despegar.");
        }
    }
    
    public void avanzar(double distancia){
        if (combustible < distancia ){
            System.out.println("No tenes suficiente combustible para avanzar.");
        }else {
            combustible = combustible - distancia;
            System.out.println("Avanzando " + distancia + " unidades");
        }
    }
    
    public void recargarCombustible(double cantidad){
        if ((combustible + cantidad) <= 100){
            combustible = combustible + cantidad;
            System.out.println("Recargando " + cantidad + " de combustible" );
        }else {
            System.out.println("Esto supera el tope del tanque");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " + nombre + "\nCombustible: " + combustible);
    }
    
}

