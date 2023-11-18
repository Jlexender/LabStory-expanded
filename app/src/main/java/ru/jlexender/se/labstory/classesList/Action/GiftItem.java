package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Item;
import ru.jlexender.se.labstory.abstractClasses.Action;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class GiftItem extends Action {
    private Item item;
    private Human human;
   
    public GiftItem(Item item, Human human) {
        super("подарить " + item.getName() + ' ' + human.getName());
        this.item = item;
        this.human = human;
    }

    @Override
    protected String describe() {
        return "дарит " + item.getName() + ' ' + human.getName(); 
    }
    
}
