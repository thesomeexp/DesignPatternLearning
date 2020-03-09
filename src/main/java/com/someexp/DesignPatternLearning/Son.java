package com.someexp.DesignPatternLearning;

public class Son extends Parent{
    private int sonValue;
    
    private Son son;
    
    public int getSonValue() {
        return sonValue;
    }

    public void setSonValue(int sonValue) {
        this.sonValue = sonValue;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }
    
    
    
}
