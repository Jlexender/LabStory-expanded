package ru.jlexender.se.labstory.classesList.Human;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class FrokenBock extends Human {
    public FrokenBock() {
        super("Фрекен Бок");
    }

    public FrokenBock(Mood mood) {
        super("Фрекен Бок", mood);
    }
}
