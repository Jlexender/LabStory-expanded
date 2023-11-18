package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Item;
import ru.jlexender.se.labstory.abstractClasses.Action;
import ru.jlexender.se.labstory.interfaces.IFood;

public class EatItem extends Action {
    private IFood item;
   
    public EatItem(IFood item) {
        super("есть " + ((Item)item).getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "ест " + ((Item)item).getName(); 
    }
    
}
