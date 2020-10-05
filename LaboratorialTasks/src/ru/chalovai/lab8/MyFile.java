package ru.chalovai.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {

        try(FileReader reader2 = new
                FileReader("D:\\Documents\\3 семестр\\Java programming\\text1.text"))
        {
            // читаем посимвольно
            int c;
            while((c=reader2.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("\n------------------------");

        try(FileWriter writer = new FileWriter("D:\\Documents\\3 семестр\\Java programming\\text1.text", true))
        {
            // запись строки с клавиатуры
            String text = "\nВсем привет в этом чатике!";
            writer.write(text);

            // Используется для очистки писателя
            writer.flush();

            writer.close();

            try(FileReader reader1 = new
                    FileReader("D:\\Documents\\3 семестр\\Java programming\\text1.text"))
            {
                // читаем посимвольно
                int c;
                while((c=reader1.read())!=-1){
                    System.out.print((char)c);
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
