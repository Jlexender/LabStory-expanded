package ru.Jlexender.se.labstory.abstractClasses;

import ru.Jlexender.se.labstory.enums.Mood;

public abstract class Human {
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
    
    public static void describe();
}

