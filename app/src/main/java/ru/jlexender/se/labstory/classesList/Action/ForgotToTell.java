package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.basicClasses.Human;

public class ForgotToTell extends Action {
    private Human human;
        
    public ForgotToTell(Human human) {
        super("to forget to tell " + human.getName());
        this.human = human;
    }
    
    @Override
    protected String describe() {
        return "has forgotten to tell " + human.getName();
    }
    
}
