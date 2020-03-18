package com.someexp.DesignPatternLearning;

public class Son {

    {
        System.out.println("Son instance block");
    }
    
    public Son() {
        this(1);
        System.out.println("Son()");
    }
    
    public Son(int i) {
        System.out.printf("Son(int %d)\n", i);
    }
    
}
