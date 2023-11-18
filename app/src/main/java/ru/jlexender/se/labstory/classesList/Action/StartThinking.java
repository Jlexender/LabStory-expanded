package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.enums.Mood;

public class StartThinking extends Action {

    public StartThinking() {
        super("начать думать");
    }
    
    public StartThinking(Mood mood) {
        super("начал думать", mood);
    }

    @Override
    protected String describe() {
        return "начал думать:";
    }
    
}
