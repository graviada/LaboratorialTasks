package ru.chalovai.lab4;

public class Car implements Priceable {
    private String brand;
    private int year;

    public Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public void getPrice() {
        int price = 400;
        int b = this.year;
        int rand = 10 + (int) Math.random()*20;

        if (brand == "Bentley" || brand == "RollsRoyce" || brand == "Cadillac") {
            price = price*rand + year*(rand + 1);
        }
        else if (brand == "Volkswagen" || brand == "BMW") {
            price *= price*(rand - 3) + year*3;
        }
        else {
            price = price*2 + year;
        }

        System.out.printf("Стоимость автомобиля марки '%s' (год %s) составляет %s тысяч руб.\n",
                brand, year, price);
    }
}
