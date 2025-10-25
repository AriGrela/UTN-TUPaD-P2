
package Ejercicio04;

public class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Muuu!");
    }

    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato(), new Vaca() };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("------");
        }
    }
}