package ru.chalovai.lab16;

// Создайте класс Drink – напитка. Класс описывает сущность – напиток и характеризуется следующими свойствами - стоимостью,
// названием и описанием. Класс должен быть определен как неизменяемый (Immutable class).
// Для этого обозначим его как final, и все поля так же сделаем неизменяемыми.
// Конструктор классов Drink и Dish должен выбрасывать исключение java.lang.IllegalArgumentException при попытке создать
// блюдо или напиток со стоимостью меньше 0, без имени или описания (если параметры имя и описание - пустые строки).

public final class Drink extends MenuItem {
    // Конструктор:
    // −принимающий три параметра – стоимость, название и описание.
    public Drink(String name, String description, double price, DrinkTypeEnum type) throws Exception {
        super(price, name, description);
        if (name.equals("") || description.equals("") || price == 0)
            // Исключение java.lang.IllegalArgumentException
            throw new Exception("java.lang.IllegalArgumentException ");
    }
}

