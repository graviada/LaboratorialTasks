package ru.chalovai.lab3;

import java.util.Scanner;

public class FurnitureShop {
    public static void checkFurniture() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your furniture.");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("Your order is Chair. Thank you for choosing us!");
        }
        else if (choice == 2) {
            System.out.println("Your order is Armchair. Thank you for choosing us!");
        }
    }
}
