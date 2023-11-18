package ru.jlexender.se.labstory.abstractClasses;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.utilityClasses.Printer;

public class Human {
    String name;
    Mood mood;
    
    public Human(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
    }

    public Human(String name) {
        this(name, Mood.NORMAL);
    }

    public String getName() {
        return name;
    }

    public Mood getMood() {
        return mood;
    }

    protected void setMood(Mood mood) {
        this.mood = mood;
        Printer printer = new Printer(this, mood.getValue());
        printer.print();
    }

    public void doAction(Action action) {
        action.applyChanges(this);
        // System.out.print(getName() + " " + action.describe()); // SRP VIOLATION! 
        Printer printer = new Printer(this, action.describe());
        printer.print();
    }
}

