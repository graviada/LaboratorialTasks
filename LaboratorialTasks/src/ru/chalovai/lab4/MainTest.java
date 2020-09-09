package ru.chalovai.lab4;

public class MainTest {
    public static void main (String []args) {
        Book book = new Book("Гарри Поттер и узник Азкабана","Джоан Роулинг", 1999);
        book.getPrice();

        Car car = new Car("RollsRoyce", 1997);
        car.getPrice();

        Flat flat = new Flat("ЦАО");
        flat.getPrice();
    }
}
