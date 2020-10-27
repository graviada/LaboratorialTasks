package ru.chalovai.lab10;

// Динамически выделяемый массив, содержащий коллекцию, без использования обощений (generics)

public class Example2_MyArrayList {
    private int size; // Количество элементов – размер коллекции
    private Object[] elements;

    public Example2_MyArrayList() {  // Конструктор
        elements = new Object[10];  // Начальная инициализация емкостью 10 элементов
        size = 0;
    }

    public void add(Object o) {
        if (size < elements.length) {
            elements[size] = o;
        } else {
            // выделить массив большего размера и добавить элемент,
        }
        ++size;
    }

    public Object get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elements[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        // Intends to hold a list of Strings, but not type-safe
        Example2_MyArrayList strLst = new Example2_MyArrayList();
        // добавление элементов строк (типа String) –это повышающее или
        // расширяющее преобразование (upcasting) к типу Object

        strLst.add("alpha");
        strLst.add("beta");
        // при получении – необходимо явное понижающее преобразование (downcasting) назад к String
        for (int i = 0; i < strLst.size(); ++i) {
            String str = (String) strLst.get(i);
            System.out.println(str);
        }

        // случайно добавленный не-String объект, произойдет вызов во время выполнения
        // ClassCastException. Компилятор не может отловить ошибку.

        strLst.add(new Integer(1234));   // компиляция/выполнение - не можем обнаружить эту ошибку
        for (int i = 0; i < strLst.size(); ++i) {
            String str = (String) strLst.get(i);  // компиляция ok,  при выполнении (runtime) ClassCastException
            System.out.println(str);
        }
    }
}

