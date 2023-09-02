package principal;

import pizza.base.Pizza;
import pizza.base.Topping;
import pizza.especialidades.PizzaItaliana;
import pizza.interfaces.PizzaBase;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1
//        Pizza pizza = new Pizza("Pizza de Peperoni", 12.50);
//        pizza.addTopping(new Topping("Peperoni"));
//        pizza.addTopping(new Topping("Queso"));
//        pizza.addTopping(new Topping("Tomate"));
//         pizza.prepare();

        //EJERCICIO 2
//        pizza.removeTopping(1);
//        pizza.prepare();

    //EJERCICIO 3
//        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 12.50, "Salsa de tomate");
//        pizzaItaliana.addTopping(new Topping("Peperoni"));
//        pizzaItaliana.addTopping(new Topping("Queso"));
//        pizzaItaliana.addTopping(new Topping("Tomate"));
//        System.out.println("Salsa: " + pizzaItaliana.getSalsa());
//        pizzaItaliana.prepare();

//        PizzaBase pizzaBase = new PizzaBase("Pizza Base", 12.50);
//
//        pizzaBase.prepare();

        //EJERCICIO 4

        Pizza pizza = new Pizza("Pizza de Peperoni");
        pizza.addTopping(new Topping("Peperoni", 14));
        pizza.addTopping(new Topping("Queso", 4));
        pizza.addTopping(new Topping("Tomate", 6));
        pizza.prepare();

    }
}