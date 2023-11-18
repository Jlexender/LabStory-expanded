package ru.jlexender.se.labstory.utilityClasses;

import ru.jlexender.se.labstory.basicClasses.*;

public class Printer {
    
    private String printString;

    public Printer(String printString) {
        this.printString = printString;
    }

    public void print() {
        System.out.println(printString);
    }
}
