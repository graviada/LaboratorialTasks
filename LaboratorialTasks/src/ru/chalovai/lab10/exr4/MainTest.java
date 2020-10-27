package ru.chalovai.lab10.exr4;

import java.io.IOException;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws IOException {
        Generics<Integer> gen = new Generics<>();
        Integer [] arrInt = {5555, 4, 3, 2, 1};
        //вывод массива
        for (int i = 0; i < 5; i++) {
            System.out.print(arrInt[i] + " ");
        }
        List<Integer> list = gen.arrayToList(arrInt);
        //вывод списка
        System.out.println(list);

        gen.getList();
    }
}
