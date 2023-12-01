package ru.jlexender.se.labstory.basicClasses;

import static ru.jlexender.se.labstory.utilityClasses.Printer.print;
import ru.jlexender.se.labstory.enums.Mood;

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
        print(this.getName() + " is " + mood.getValue());
    }

    public void doAction(Action action) {
        print(this.getName() + ' ' + action.describe());
        action.applyChanges(this);
    }
    
    @Override
    public boolean equals(Object object) {
        return this.toString() == object.toString();
    }
    
    @Override
    public String toString() {
        return "Human{"
               + "name='" + name + '\'' 
               + ", mood=" + mood
               + '}';
    } 

    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }

}

