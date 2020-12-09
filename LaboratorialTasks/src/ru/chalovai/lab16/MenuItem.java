package ru.chalovai.lab16;

public class MenuItem {
    private double price;
    private String name;
    private String description;

    public MenuItem(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", Цена: " + price ;
    }

}
