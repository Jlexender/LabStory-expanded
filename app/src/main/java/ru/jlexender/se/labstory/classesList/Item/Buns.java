package ru.jlexender.se.labstory.classesList.Item;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.interfaces.IFood;
import ru.jlexender.se.labstory.interfaces.IRollable;

public class Buns extends Item implements IFood, IRollable {
    private String name;

    public Buns() {
        super("buns");
    }

}
