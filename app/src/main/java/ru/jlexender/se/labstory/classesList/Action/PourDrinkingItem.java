package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Liquid;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;

public class PourDrinkingItem extends Action {
    private IDrinkingItem item;
    private Liquid liquid;
   
    public PourDrinkingItem(IDrinkingItem item, Liquid liquid) {
        super("налить в " + ((Item)item).getName() + ' ' + liquid.getName());
        this.item = item;
        this.liquid = liquid;
    }

    @Override
    protected String describe() {
        return "наливает в " + ((Item)item).getName() + ' ' + liquid.getName(); 
    }
    
}
