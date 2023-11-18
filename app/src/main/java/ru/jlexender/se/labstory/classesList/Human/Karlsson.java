package ru.jlexender.se.labstory.classesList.Human;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class Karlsson extends Human {
    public Karlsson() {
        super("Карлсон");
    }

    public Karlsson(Mood mood) {
        super("Карлсон", mood);
    }
}
