package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Action;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class Tell extends Action {
    private Human human;
   
    public Tell(Human human) {
        super("говорить " + human.getName());
        this.human = human;
    }

    @Override
    protected String describe() {
        return "говорит " + human.getName() + "(у)"; 
    }
    
}
