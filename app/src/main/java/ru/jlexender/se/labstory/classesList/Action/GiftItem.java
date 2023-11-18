package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Human;
import ru.jlexender.se.labstory.basicClasses.Time;

public class GiftItem extends Action {
    private Item item;
    private Human human;
    private Time time;
    boolean timeAgo;
   
    public GiftItem(Item item, Human human) {
        super("подарить " + item.getName() + ' ' + human.getName());
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
        if (timeAgo) return "дарит " + item.getName() + ' ' + human.getName() + ' '
            + time.getYears() + " года и " + time.getMonths() + " месяца назад"; 
        else return "дарит " + item.getName() + ' ' + human.getName();
    }
    
}
