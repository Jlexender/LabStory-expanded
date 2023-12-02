package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;

public final class PourDrinkingItem extends Action {
    private IDrinkingItem item;
    private Item liquid;
   
    public PourDrinkingItem(IDrinkingItem item, Item liquid) {
        super("pour " + liquid.getName() + " into " + ((Item)item).getName());
        this.item = item;
        this.liquid = liquid;
    }

    @Override
    protected String describe() {
        return "pours " + liquid.getName() + " into " + ((Item)item).getName(); 
    }
    
}
