package models;

import java.util.List;

public class Menu {
    private List<Cupcake> cupcakesOfTheDay;
    private List<Ingredient> ingredients;

    public Menu(List<Cupcake> cupcakesOfTheDay, List<Ingredient> ingredients) {
        this.cupcakesOfTheDay = cupcakesOfTheDay;
        this.ingredients = ingredients;
    }

    public List<Cupcake> getCupcakesOfTheDay() { return cupcakesOfTheDay; }
    public List<Ingredient> getAvailableIngredients() {
        return ingredients.stream().filter(Ingredient::isAvailable).toList();
    }
}
