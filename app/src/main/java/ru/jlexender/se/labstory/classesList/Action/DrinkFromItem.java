package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;

public class DrinkFromItem extends Action {
    private IDrinkingItem item;
   
    public DrinkFromItem(IDrinkingItem item) {
        super("выпить из " + ((Item)item).getName());
        this.item = item;
    }

    @Override
    protected String describe() {
        return "пьёт из " + ((Item)item).getName(); 
    }
    
}
