package ru.chalovai.lab10;

public class Example3_GenericBox<E> {
    // Private переменная класса
    private E content;

    // конструктор
    public Example3_GenericBox(E content) {
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public String toString() {
        return content + " (" + content.getClass() + ")";
    }

    // В следующем примере мы создаем GenericBoxes с различными типами (String, Integer и Double)
    public static void main(String[] args) {
        Example3_GenericBox<String> box1 = new Example3_GenericBox<String>("Hello");
        String str = box1.getContent(); // явного понижающего преобразования (downcast) не требуется
        System.out.println(box1);
        Example3_GenericBox<Integer> box2 = new Example3_GenericBox<Integer>(123);  //автоупаковка типа int в тип Integer
        int i = box2.getContent();       // (downcast) понижающее преобр. к типу Integer, автоупаковка в тип int
        System.out.println(box2);
        Example3_GenericBox<Double> box3 = new Example3_GenericBox<Double>(55.66);  ////автоупаковка типа double в тип  Double
        double d = box3.getContent();     // (downcast) понижающее преобр.  к типу Double,
        // автоупаковка в тип double
        System.out.println(box3);
    }

}

