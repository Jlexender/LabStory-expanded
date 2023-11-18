package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.abstractClasses.Place;
import ru.jlexender.se.labstory.abstractClasses.Action;

public class Lives extends Action {
    private Place place;
   
    public Lives(Place place) {
        super("жить в " + place.getName());
        this.place = place;
    }

    @Override
    protected String describe() {
        return "живёт в " + place.getName(); 
    }
    
}
