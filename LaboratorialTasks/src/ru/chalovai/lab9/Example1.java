package ru.chalovai.lab9;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException(); // Возбуждаем новое исключение типа RuntimeException()
            }
            // Следующая команда не выполнена, т. к. мы перехватили исключение
            System.err.print(" 1");
        } catch (Exception e) {  // // В блок catch заключаем код по обработке исключения Exception,
            // которое перехватывает созданное ранее исключение типа RuntimeException()
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
}
