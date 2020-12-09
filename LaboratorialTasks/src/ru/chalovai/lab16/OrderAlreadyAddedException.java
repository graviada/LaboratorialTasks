package ru.chalovai.lab16;

public class OrderAlreadyAddedException extends Exception{
    OrderAlreadyAddedException(String message){
        super(message);
    }
}
