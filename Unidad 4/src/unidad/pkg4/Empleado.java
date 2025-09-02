package unidad.pkg4;
import java.util.Random;

public class Empleado {
    
   private int id;
   private String nombre;
   private String puesto;
   private double salario;
   private static int totalEmpleados = 0;
   
   //CONSTRUCTORES
   
   public Empleado(int id, String nombre, String puesto, double salario) {
       setId(id);
       setNombre(nombre);
       setPuesto(puesto);
       setSalario(salario);
       totalEmpleados ++;
       }
   
   
   //ya que uno referencia a otro no s eusa dos veces totalEmpleados
   
   public Empleado(String nombre, String puesto){
       this(Empleado.generarIdAleatorio(),nombre, puesto, 1000000 );
  }
   
    //ID ALEATORIO
   public static int generarIdAleatorio() {
        Random random = new Random();
        return random.nextInt(10000); 
    }
   
   
   //Metodos sobrecargados
   
   public void actualizarSalario(double porcentaje){
      salario += salario * porcentaje;
   }
   
   public void actualizarSalario(int cantidadFija){
      salario += cantidadFija;
   }
   
    //toString aplicado
    
    @Override
    public String toString(){
    return "Empleado[ID=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
        
    }
   
    // Mostrarempleados Estatico
    
   public static int mostrarTotalEmpleados(){
      return Empleado.totalEmpleados;
   }
   
   public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
   
}
