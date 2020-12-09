package ru.chalovai.lab16;

// Класс Dish сделайте неизменяемым (аналогично Drink).
// Конструктор классов Drink и Dish должен выбрасывать исключение java.lang.IllegalArgumentException при попытке создать
// блюдо или напиток со стоимостью меньше 0, без имени или описания (если параметры имя и описание - пустые строки).

public final class Dish extends MenuItem {
    // Конструктор:
    // −принимающий три параметра – стоимость, название и описание.
    public Dish(String name, String description, double price) throws Exception {
        super(price, name, description);
        if (name.equals("") || description.equals("") || price == 0)
            // Исключение java.lang.IllegalArgumentException
            throw new Exception("java.lang.IllegalArgumentException ");
    }
}

