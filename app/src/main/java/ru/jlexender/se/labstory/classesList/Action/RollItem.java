package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.IRollable;

public final class RollItem extends Action {
    private IRollable item;
   
    public RollItem(IRollable item) {
        super("to roll " + ((Item)item).getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "rolls " + ((Item)item).getName(); 
    }
    
}
