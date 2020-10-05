package ru.chalovai.lab6;

public class IntLogic {

    public IntLogic(){
    }

    public static int getNum(){
        return (int)(Math.random() * 20);
    }

    public static int isRight(int num, int realNum){
        if (num == realNum)
            return 0;
        else if(num < realNum)
            return -1;
        else
            return 1;
    }
}
