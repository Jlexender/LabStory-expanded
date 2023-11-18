package ru.jlexender.se.labstory.basicClasses;

public abstract class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        return this == object;
    }
    
    @Override
    public String toString() {
        return "Item{"
               + "name='" + name + '\'' 
               + '}';
    }
}
