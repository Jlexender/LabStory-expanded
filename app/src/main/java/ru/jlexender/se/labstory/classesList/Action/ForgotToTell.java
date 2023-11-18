package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Action;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class ForgotToTell extends Action {
    private Human human;
        
    public ForgotToTell(Human human) {
        super("забыл сказать " + human.getName());
        this.human = human;
    }
    
    @Override
    protected String describe() {
        return "забыл сказать " + human.getName();
    }
    
}
