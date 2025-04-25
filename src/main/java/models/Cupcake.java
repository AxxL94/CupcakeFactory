package models;

import java.util.List;

public class Cupcake {
    private Ingredient base;
    private Ingredient creme;
    private List<Ingredient> toppings;

    public Cupcake(Ingredient base, Ingredient creme, List<Ingredient> toppings) {
        this.base = base;
        this.creme = creme;
        this.toppings = toppings;
    }

    public double calculatePrice(boolean isCupcakeOfTheDay) {
        double price = base.getPrice() + creme.getPrice();
        toppings.sort((t1, t2) -> Double.compare(t1.getPrice(), t2.getPrice()));

        if (!toppings.isEmpty()) {
            price += toppings.get(0).getPrice() * 0; // premier topping offert
            for (int i = 1; i < toppings.size(); i++) {
                price += toppings.get(i).getPrice();
            }
        }

        return isCupcakeOfTheDay ? price * 0.6 : price;
    }
}
