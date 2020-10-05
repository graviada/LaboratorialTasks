package ru.chalovai.lab9;

import java.util.Scanner;

public class Example6_ThrowsDemo3 {
    public void getKey() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a key: ");
            String key = myScanner.nextLine();
            printDetails(key);
        }
        catch (Exception e) {
            System.out.println( "You caused an exception in getKey()" );
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main (String []args) {
        Example6_ThrowsDemo3 ex = new Example6_ThrowsDemo3();
        ex.getKey();
    }
}

