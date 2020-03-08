package com.someexp.DesignPatternLearning;

import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void name(Son a) {
        a.setX(66);
        a.setY(66);
        a = new Son(88, 88);
    }
    public static void main( String... args )
    {
        System.out.println( "Hello World!" );
        Son parent = new Son(1, 1);
        name(parent);
        System.out.println(parent.getX() + "---" + parent.getY());
//        parent.sayHello();
    }
}
