package ru.jlexender.se.labstory.classesList.Human;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.basicClasses.Human;

public class Felle extends Human {
    public Felle() {
        super("Фелле");
    }

    public Felle(Mood mood) {
        super("Фелле", mood);
    }
}
