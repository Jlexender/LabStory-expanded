package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Place;
import ru.jlexender.se.labstory.basicClasses.Action;

public final class GoingTo extends Action {
    private Place place;
   
    public GoingTo(Place place) {
        super("to be going to " + place.getName());
        this.place = place;
    }

    @Override
    protected String describe() {
        return "is going to " + place.getName(); 
    }
    
}
