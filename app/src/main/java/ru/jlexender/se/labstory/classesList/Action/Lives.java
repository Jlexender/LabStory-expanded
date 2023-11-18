package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Place;
import ru.jlexender.se.labstory.basicClasses.Action;

public class Lives extends Action {
    private Place place;
   
    public Lives(Place place) {
        super("to live in " + place.getName());
        this.place = place;
    }

    @Override
    protected String describe() {
        return "lives in " + place.getName(); 
    }
    
}
