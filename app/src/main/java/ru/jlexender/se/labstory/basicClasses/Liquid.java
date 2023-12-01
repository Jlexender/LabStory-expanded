package ru.jlexender.se.labstory.basicClasses;

public abstract class Liquid {
    private final String name;

    public Liquid(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object object) {
        return this.toString() == object.toString();
    }

    @Override
    public String toString() {
        return "Liquid{"
               + "name='" + name + '\'' 
               + '}';
    }
    
    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }
}
