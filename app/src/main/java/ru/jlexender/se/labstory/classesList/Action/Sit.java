package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Place;
import ru.jlexender.se.labstory.basicClasses.Action;
import ru.jlexender.se.labstory.interfaces.ISeat;

public final class Sit extends Action {
    private ISeat place;
   
    public Sit(ISeat place) {
        super("sit on " + ((Place)place).getName());
        this.place = place;
    }

    @Override
    protected String describe() {
        return "sat on " + ((Place)place).getName(); 
    }
    
}
