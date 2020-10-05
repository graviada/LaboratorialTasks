package ru.chalovai.lab7;

public class TestArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> states = new java.util.ArrayList<String>();

        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-гo объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }

        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
}
