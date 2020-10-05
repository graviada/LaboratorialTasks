package ru.chalovai.lab9;

public class Example4_ThrowsDemo1 {
    public void getDetails(String key) {
        try {
            if (key == "0") {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Doing something with the key");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    public static void main (String []args) throws NullPointerException {
        Example4_ThrowsDemo1 ex = new Example4_ThrowsDemo1();
        // ? почему, когда в key пусто, все равно работает Doing something?
        ex.getDetails("0");
    }
}

