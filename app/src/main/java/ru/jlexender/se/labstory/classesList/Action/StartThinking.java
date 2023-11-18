package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.enums.Mood;

public final class StartThinking extends Action {

    public StartThinking() {
        super("to start thinking");
    }
    
    public StartThinking(Mood mood) {
        super("to start thinking", mood);
    }

    @Override
    protected String describe() {
        return "has started to think ---";
    }
    
}
