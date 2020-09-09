package ru.chalovai.lab3;

public class TestFurniture {
    public static void main (String []args) {
        Furniture chair = new Chair("oak");
        System.out.println(chair);

        Furniture armchair = new Armchair("ash");
        System.out.println(armchair);

        FurnitureShop order = new FurnitureShop();
        order.checkFurniture();
    }
}
