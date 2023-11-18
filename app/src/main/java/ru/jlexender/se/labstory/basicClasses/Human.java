package ru.jlexender.se.labstory.basicClasses;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.utilityClasses.Printer;

public class Human {
    private final String name;
    private Mood mood;
    
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
        Printer printer = new Printer(this.getName() + " is " + mood.getValue());
        printer.print();
    }

    public void doAction(Action action) {
        action.applyChanges(this);
        Printer printer = new Printer(this.getName() + ' ' + action.describe());
        printer.print();
    }
}

