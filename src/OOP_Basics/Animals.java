package OOP_Basics;

public class Animals {

    // protected: la variable no podrá ser modificada directamente.
    protected int age;
    protected String name;
    protected String feeding;

    // Constructor: función con la que se creara el objeto.
    public Animals(int age, String name, String feeding) {

        // Age es mayor o igual a 0
        if (age >= 0) {
            this.age = age;
        }

        // Name no está vacio
        if (!name.isBlank()) {
            this.name = name;
        }

        // Feeding no está vacio
        if (!feeding.isBlank()) {
            this.feeding = feeding;
        }
    }

    // Pueden haber varios métodos/constructores con el mismo nombre
    // pero no pueden tener los mismos argumentos.
    public Animals(String name) {
        this.name = name;
    }

    // El constructor puede estar vacio.
    public Animals() {

    }

    // Setters: métodos para asignar valor a las variables.
    // ej: setEdad, setNombre
    public void setAge(int age) {
        this.age = age;
    }

    // Getters: métodos para obtener el valor de las variables
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getFeeding() {
        return this.feeding;
    }

    /**
     * Incrementa la edad del animal en 1.
     */
    public void age() {
        this.age++;
    }

    /**
     *
     */
    public void eat() {
        System.out.println(this.name + " is eating");
    }
}
