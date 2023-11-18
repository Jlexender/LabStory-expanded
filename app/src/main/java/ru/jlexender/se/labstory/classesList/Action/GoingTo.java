package ru.jlexender.se.labstory.classesList.Action;

import ru.jlexender.se.labstory.basicClasses.Place;
import ru.jlexender.se.labstory.basicClasses.Action;

public class GoingTo extends Action {
    private Place place;
   
    public GoingTo(Place place) {
        super("собираться в " + place.getName());
        this.place = place;
    }

    @Override
    protected String describe() {
        return "собирается в " + place.getName(); 
    }
    
}
