package main;

import models.*;
import services.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CupcakeFactory factory = new CupcakeFactory();

        Menu menu = factory.getMenu();
        System.out.println("Cupcakes du jour :");
        menu.getCupcakesOfTheDay().forEach(c -> System.out.println(" - " + c));

        System.out.println("Ingrédients disponibles :");
        menu.getAvailableIngredients().forEach(i -> System.out.println(" - " + i.getName()));

        // Exemple de commande
        Order order = new Order();
        Cupcake cupcake = new Cupcake(menu.getAvailableIngredients().get(0),
                menu.getAvailableIngredients().get(1),
                List.of(menu.getAvailableIngredients().get(2)));

        order.addCupcake(cupcake);

        factory.sell(order);
        System.out.println("Prix total : " + order.calculateTotal());
        System.out.println("Gains totaux : " + factory.getTotalEarnings());
    }
}
