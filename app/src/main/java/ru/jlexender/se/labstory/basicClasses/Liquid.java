package ru.jlexender.se.labstory.basicClasses;

public abstract class Liquid {
    private final String name;

    public Liquid(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
