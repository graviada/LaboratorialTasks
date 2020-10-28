package ru.chalovai.lab12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static boolean regex(String regex, String text) {
        //Note: Use \\ instead of \ in Java
        Pattern pricePattern = Pattern.compile(regex);
        Matcher matcher = pricePattern.matcher(text);
        boolean found = false;
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
            found = true;
        }
        return found;
    }

    public static void main(String[] args) {

        //Задача №1 - Извлечение цен из текста
        String priceRegex = "((?<=\\s)[0-9]\\d*(?:.\\d{0,2})\\s(?:USD|EU|RUB))";
        String priceText = "44.00 45.1 66 ERR, 5.6 0.613 USD ERR 25.98 USD, 44 RUB, 0.004 EU,  456 USD 0.613 USD, RUB, 45.10 EU 0.11 0.0";
        regex(priceRegex, priceText);

        //Задача №2 - Есть ли в тексте цифры, за которыми не стоит "+"
        String positiveNumberRegex = "[+]\\s\\d";
        String otherNumberRegex = "[-*\\/:]\\s\\d";
        String numberText = "(1 + 8) – 9 / 4 ";
        if (regex(positiveNumberRegex, numberText)) {
            System.out.println(regex(otherNumberRegex, numberText));
        }

        //Задача №3 - Валидация даты в формате dd/mm/yyyy (1900-1999)
        String dateRegex = "([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)((1)(9)[0-9]{2}|[2-9][0-9]{3})";
        String dateText = "29/02/2001";
        if (regex(dateRegex, dateText)) {
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            date.setLenient(false);
            try {
                java.util.Date javaDate = date.parse(dateText);
                System.out.println(dateText + " is valid date format");
            } catch (ParseException e) {
                //e.printStackTrace();
                System.out.println(dateText + " is Invalid Date format");
            }
        }

        //Задача №4 - Валидация e-mail адреса (user@mail.ru)
        String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        String emailText = "example@mail.com Julia string google@@@gmail.ru aol@host.com";
        regex(emailRegex, emailText);
    }
}
