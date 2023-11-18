package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Human;

public class DoNotListen extends Action {
    private Human human; 
    private boolean ignoringAll;

    public DoNotListen(Human human) {
        super("do not listen to" + human.getName());
        this.human = human;
        ignoringAll = false;
    }

    public DoNotListen() {
        super("isn't listening to anyone");
        ignoringAll = true;
    }

    @Override
    protected String describe() {
        if (ignoringAll) return "isn't listening to anyone";
        else return "isn't listening to " + human.getName(); 
    }
    
}
