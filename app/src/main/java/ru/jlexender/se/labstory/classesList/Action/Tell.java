package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Human;

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
