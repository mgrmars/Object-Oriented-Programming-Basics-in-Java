package OOP_Basics;

// La clase la cuadrupeda hereda los atributos y métodos de la clase animales
// por lo tanto los datos atributos de animales y sus métodos estan disponibles en esta clase (clase Terrestres).
public class Terrestrials extends Animals {

    public void run() {
        System.out.println(this.name + " is running");
    }
}
