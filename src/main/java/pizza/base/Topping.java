package pizza.base;

import java.util.ArrayList;

public class Topping {
    private String nombre; // Nombre del topping
    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void agregarIngrediente(String ingrediente, double price) {
        this.ingredientes.add(ingrediente);
        this.price = price;
    }

    public Topping(String nombre, double precioIngrediente) {
        this.nombre = nombre;
        this.price = precioIngrediente;
    }

    @Override
    public String toString() {
        return "Topping{" + "nombre='" + nombre + '\'' + ", ingredientes=" + ingredientes + '}';
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

}
