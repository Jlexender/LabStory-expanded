package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;

public final class DrinkFromItem extends Action {
    private IDrinkingItem item;
   
    public DrinkFromItem(IDrinkingItem item) {
        super("drink from " + ((Item)item).getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "drinks from " + ((Item)item).getName(); 
    }
    
}
