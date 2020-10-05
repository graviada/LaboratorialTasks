package ru.chalovai.lab8;

import java.io.*;

public class FilesAppRead {
    public static void main(String[] args) {
        try(FileReader reader = new
                FileReader("D:\\Documents\\3 семестр\\Java programming\\text1.text"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
