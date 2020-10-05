package ru.chalovai.lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyCollection {
    public static void main(String[] args) {

        ArrayList<String> solarSystemPlanets = new ArrayList<>(Arrays.asList("Neptune", "Mars",
                "Jupiter", "Earth", "Saturn", "Uranus", "Venus", "Mercury"));

        solarSystemPlanets.add(8, "Pluto");

        if(solarSystemPlanets.contains("Pluto")){
            System.out.println("\n Список содержит псевдопланету Плутон.");
            System.out.println("------------------------");
        }

        System.out.println("Начальный набор:");
        System.out.println(solarSystemPlanets);

        System.out.println("------------------------ \n Перемешанный набор:");
        Collections.shuffle(solarSystemPlanets);
        System.out.println(solarSystemPlanets);

        System.out.println("------------------------ \n Отсортированный набор:");
        Collections.sort(solarSystemPlanets);
        System.out.println(solarSystemPlanets);

        System.out.println("------------------------ \n Набор элементов с 0 индекса по 5:");

        // Удаляем нулевой элемент
        solarSystemPlanets.remove(0);

        // Получает набор элементов, которые находятся в списке между индексами start и end
        System.out.println(solarSystemPlanets.subList(0, 5));

        System.out.println("------------------------");

        Object[] realPlanets = solarSystemPlanets.toArray();
        for(Object realPlanet : realPlanets){
            System.out.print(realPlanet);
            System.out.print(" ");
        }
    }
}
