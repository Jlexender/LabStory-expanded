package ru.jlexender.se.labstory.basicClasses;

public abstract class Item {
    private final String name;
    private final int size;
    private boolean liquid;

    public Item(String name, int size, boolean liquid) {
        this.name = name;
        this.size = size;
        this.liquid = liquid;
    }
    
    public String getName() {
        return name;
    }

    public boolean isLiquid() {
        return liquid;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object object) {
        return this.toString() == object.toString();
    }
    
    @Override
    public String toString() {
        return String.format("Item{name='%s', size='%d', liquid='%b'}", name, size, liquid);
    }

    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }
}
