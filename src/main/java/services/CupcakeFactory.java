package services;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class CupcakeFactory {
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Cupcake> cupcakesOfTheDay = new ArrayList<>();
    private double totalEarnings = 0.0;

    public CupcakeFactory() {
        // Initialisation des ingrédients
        ingredients.add(new Ingredient("Nature", Ingredient.Type.BASE, 1.0, 50));
        ingredients.add(new Ingredient("Vanille", Ingredient.Type.CREME, 1.0, 50));
        ingredients.add(new Ingredient("Chocolat", Ingredient.Type.TOPPING, 0.5, 100));

        // Initialisation cupcakes du jour (exemple)
        cupcakesOfTheDay.add(new Cupcake(ingredients.get(0), ingredients.get(1), List.of(ingredients.get(2))));
    }

    public Menu getMenu() {
        return new Menu(cupcakesOfTheDay, ingredients);
    }

    public void sell(Order order) {
        totalEarnings += order.calculateTotal();
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }
}
