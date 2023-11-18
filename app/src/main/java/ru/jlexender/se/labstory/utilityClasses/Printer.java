package ru.jlexender.se.labstory.utilityClasses;

import ru.jlexender.se.labstory.abstractClasses.*;

public class Printer {
    
    private String printString;

    public Printer(Human human, String actionDescription) {
        printString = human.getName() + ' ' + actionDescription;    
    }

    public void print() {
        System.out.println(printString);
    }
}
