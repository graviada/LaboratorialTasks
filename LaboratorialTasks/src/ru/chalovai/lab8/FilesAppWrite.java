package ru.chalovai.lab8;

import java.io.*;
public class FilesAppWrite {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("D:\\Documents\\3 семестр\\Java programming\\text1.text", false))
        {
            // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);

            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
