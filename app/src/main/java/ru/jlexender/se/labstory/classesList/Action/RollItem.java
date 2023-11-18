package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.IRollable;

public class RollItem extends Action {
    private IRollable item;
   
    public RollItem(IRollable item) {
        super("катать " + ((Item)item).getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "катает " + ((Item)item).getName(); 
    }
    
}
