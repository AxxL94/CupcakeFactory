package models;

public class Ingredient {
    public enum Type { BASE, CREME, TOPPING }

    private String name;
    private Type type;
    private double price;
    private int stock;

    public Ingredient(String name, Type type, double price, int stock) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public Type getType() { return type; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public void reduceStock() { if (stock > 0) stock--; }
    public boolean isAvailable() { return stock > 0; }
}
