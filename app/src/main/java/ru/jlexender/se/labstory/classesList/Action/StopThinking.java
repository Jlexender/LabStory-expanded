package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.enums.Mood;

public class StopThinking extends Action {

    public StopThinking() {
        super("закончить думать");
    }

    public StopThinking(Mood mood) {
        super("закончил думать", mood);
    }

    @Override
    protected String describe() {
        return "закончил думать";
    }
    
}

