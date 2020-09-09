package ru.chalovai.lab4;

public class Book implements Priceable {
    private String name, author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void getPrice() {
        int a = 300; // Начальное значение диапазона - "от"
        int b = this.year; // Конечное значение диапазона - "до"

        int price = a + (int) (Math.random() * b);

        System.out.printf("Стоимость книги '%s' (автор %s) составляет %s руб.\n",
                name, author, price);
    }
}
