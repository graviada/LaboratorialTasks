package ru.chalovai.lab9;

import java.util.Scanner;

public class Example3_Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }
        // Если создаем общее исключение класса Exception, то последующие исключения нет необходимости
        // объявлять, они уже пойманы
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        //catch (ArithmeticException ar_e) {
            //System.out.println("Attempted division by zero");
        //}
        //catch (NumberFormatException num_e) {
           // System.out.println("Wrong number format");
        //}
        finally { // Блок, который отработает в любом случае
            System.out.println("I hope we didn't disappoint you");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}

