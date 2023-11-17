package ru.Jlexender.se.labstory.abstractClasses;


public abstract class Place {
    private String name;

    public Place(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }
    
    public static void describe();
}

