package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.IFood;

public class EatItem extends Action {
    private IFood item;
   
    public EatItem(IFood item) {
        super("eat " + ((Item)item).getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "eats " + ((Item)item).getName(); 
    }
    
}
