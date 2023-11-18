package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.enums.Mood;

public class StopThinking extends Action {

    public StopThinking() {
        super("to stop thinking");
    }

    public StopThinking(Mood mood) {
        super("to stop thinking", mood);
    }

    @Override
    protected String describe() {
        return "has stopped thinking";
    }
    
}

