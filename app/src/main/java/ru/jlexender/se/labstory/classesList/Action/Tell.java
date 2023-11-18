package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Human;

public final class Tell extends Action {
    private Human human;
   
    public Tell(Human human) {
        super("tell to " + human.getName());
        this.human = human;
    }

    @Override
    protected String describe() {
        return "talks to " + human.getName(); 
    }
    
}
