package ru.chalovai.lab12;

import java.util.StringTokenizer;

public class Example3 {
    public Example3() {
    }

    public static void main(String[] args) {
        Example3 test = new Example3();
        String toParse = " word1; word2; word3; word4";
        StringTokenizer st = new StringTokenizer(toParse, ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
