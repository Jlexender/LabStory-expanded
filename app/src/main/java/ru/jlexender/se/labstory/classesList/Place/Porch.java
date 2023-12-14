package ru.jlexender.se.labstory.classesList.Place;

import ru.jlexender.se.labstory.basicClasses.Place;
import ru.jlexender.se.labstory.interfaces.ISeat;

public final class Porch extends Place implements ISeat {

    public Porch(Weather weather) {
        super("porch", weather);
    }

    public Porch() {
        super("porch");
    }
}

