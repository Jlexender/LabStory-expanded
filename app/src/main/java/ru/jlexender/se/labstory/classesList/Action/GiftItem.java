package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Human;
import ru.jlexender.se.labstory.basicClasses.Time;

public final class GiftItem extends Action {
    private Item item;
    private Human human;
    private Time time;
    boolean timeAgo;
   
    public GiftItem(Item item, Human human) {
        super("gift " + item.getName() + ' ' + human.getName());
        this.item = item;
        this.human = human;
        timeAgo = false;
    }

    public GiftItem(Item item, Human human, Time time) {
        this(item, human);
        this.time = time;
        timeAgo = true;
    }
    
    @Override
    protected String describe() {
        if (timeAgo) return "gifted " + item.getName() + " to " + human.getName() + " "
            + time.getYears() + " years and " + time.getMonths() + " months ago"; 
        else return "gifts " + item.getName() + " to " + human.getName();
    }
    
}
