package ru.chalovai.lab10;

import java.util.*;
public class Example1 {
    public static void main(String[] args) {
        List strLst = new ArrayList();  // List и ArrayList содержит Object
        strLst.add("alpha");            // Ссылаемся со String на родителя Object неявно
        strLst.add("beta");
        strLst.add("charlie");
        Iterator iter = strLst.iterator();
        while (iter.hasNext()) {
            String str = (String)iter.next(); // Нужно явно "опустить" с Object обратно в String
            System.out.println(str);
        }
        strLst.add(new Integer(1234));       // Compiler/runtime cannot detect this error
        String str = (String)strLst.get(3);  // compile ok, but runtime ClassCastException
    }
}

// Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be
// cast to class java.lang.String (java.lang.Integer and java.lang.String are in module
// java.base of loader 'bootstrap')