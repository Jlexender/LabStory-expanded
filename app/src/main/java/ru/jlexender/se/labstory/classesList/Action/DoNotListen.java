package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Action;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class DoNotListen extends Action {
    private Human human; 
    private boolean ignoringAll;

    public DoNotListen(Human human) {
        super("не слушать" + human.getName());
        this.human = human;
        ignoringAll = false;
    }

    public DoNotListen() {
        super("не слушать никого");
        ignoringAll = true;
    }

    @Override
    protected String describe() {
        if (ignoringAll) return "не слушает никого";
        else return "не слушает " + human.getName() + "(a)"; 
    }
    
}
