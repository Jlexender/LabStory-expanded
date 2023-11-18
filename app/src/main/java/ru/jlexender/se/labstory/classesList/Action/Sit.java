package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Place;
import ru.jlexender.se.labstory.abstractClasses.Action;
import ru.jlexender.se.labstory.interfaces.ISeat;

public class Sit extends Action {
    private ISeat place;
   
    public Sit(ISeat place) {
        super("сесть на " + ((Place)place).getName());
        this.place = place;
    }

    @Override
    protected String describe() {
        return "сел на " + ((Place)place).getName(); 
    }
    
}
