package ru.jlexender.se.labstory.classesList.Item;

import ru.jlexender.se.labstory.abstractClasses.Item;
import ru.jlexender.se.labstory.interfaces.IFood;

public class Buns extends Item implements IFood {
    private String name;

    public Buns() {
        super("булочки");
    }

}
