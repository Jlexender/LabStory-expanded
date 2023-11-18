package ru.jlexender.se.labstory.classesList.Item;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.interfaces.IRollable;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;
import ru.jlexender.se.labstory.enums.Color;

public class Glass extends Item implements IRollable, IDrinkingItem {
    private String name;
    
    public Glass(Color color) {
        super(color.getValue() + " стакан");
    }

    public Glass() {
        super("стакан");
    }

}
