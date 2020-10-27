package ru.chalovai.lab12;

import java.util.regex.*;
public class Example2 {
    public static void main(String[] args) {
        String input = "abdcxyz";
        myMatches("([a-z]*)([a-z]+)", input);
        myMatches("([a-z]?)([a-z]+)", input);
        myMatches("([a-z]+)([a-z]*)", input);
        myMatches("([a-z]?)([a-z]?)", input);
    }
    public static void myMatches(String regex,
                                 String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println("First group: "
                    + matcher.group(1));
            System.out.println("Second group: "
                    + matcher.group(2));
        } else
            System.out.println("nothing");
        System.out.println();
    }}

