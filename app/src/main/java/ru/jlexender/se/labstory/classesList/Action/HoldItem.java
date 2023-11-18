package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;

public class HoldItem extends Action {
    private Item item;
   
    public HoldItem(Item item) {
        super("to hold " + item.getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "holds " + item.getName(); 
    }
    
}
