package com.someexp.DesignPatternLearning;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Hello world!
 *
 */
class App 
{
    public static void main( String... args )
    {
        new Son();
        Vector<String> vsStirngs = new Vector<String>();
        vsStirngs.add("a:");
        vsStirngs.add("b");
        vsStirngs.add("c");
        for(String string : vsStirngs) {
            System.out.println(string);
        }
        
    }
}
