package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Item;
import ru.jlexender.se.labstory.abstractClasses.Action;

public class HoldItem extends Action {
    private Item item;
   
    public HoldItem(Item item) {
        super("держать" + item.getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "держит " + item.getName(); 
    }
    
}
