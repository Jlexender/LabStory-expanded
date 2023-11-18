package ru.jlexender.se.labstory.classesList.Human;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class Rulle extends Human {
    public Rulle() {
        super("Рулле");
    }

    public Rulle(Mood mood) {
        super("Рулле", mood);
    }
}
