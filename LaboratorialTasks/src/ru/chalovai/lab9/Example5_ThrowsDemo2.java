package ru.chalovai.lab9;

import java.util.Scanner;

// Везде стоит throws, так как ни один метод не обрабатывает исключение, но может его выбросить

public class Example5_ThrowsDemo2 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails(key);
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main (String []args) throws Exception {
        Example5_ThrowsDemo2 ex = new Example5_ThrowsDemo2();
        ex.getKey();
    }
}

