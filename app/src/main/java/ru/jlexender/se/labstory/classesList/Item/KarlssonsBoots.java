package ru.jlexender.se.labstory.classesList.Item;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.interfaces.IWearable;
import ru.jlexender.se.labstory.enums.Color;

public class KarlssonsBoots extends Item implements IWearable {
    private String name;
    
    public KarlssonsBoots(Color color) {
        super(color.getValue() + " Karlsson's Boots", 30, false);
    }

    public KarlssonsBoots() {
        super("Karlsson's Boots", 30, false);
    }
}
