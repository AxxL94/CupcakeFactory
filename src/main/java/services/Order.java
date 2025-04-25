package services;

import models.Cupcake;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Cupcake> cupcakes = new ArrayList<>();

    public void addCupcake(Cupcake cupcake) {
        if (cupcake != null) {
            cupcakes.add(cupcake);
        }
    }

    public double calculateTotal() {
        double total = cupcakes.stream().mapToDouble(c -> c.calculatePrice(false)).sum();
        if (cupcakes.size() >= 6) {
            total -= cupcakes.stream().mapToDouble(c -> c.calculatePrice(false)).min().orElse(0);
        }
        return total;
    }
}
