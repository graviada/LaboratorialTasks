package ru.chalovai.lab12;


public class Date {
    public static void main(String[] args) {
        String date = "29/05/2001";
        String pattern = "(0[1-9]|1[1-9]|2[1-9]\\d|3[01])/([0][1-9]|1[0-2])/((?:19|[2-9]\\d)\\d{2})$";
        System.out.print(date.matches(pattern));
    }
}
