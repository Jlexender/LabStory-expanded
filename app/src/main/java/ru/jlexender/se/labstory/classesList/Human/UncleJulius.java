package ru.jlexender.se.labstory.classesList.Human;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.basicClasses.Human;

public class UncleJulius extends Human {
    public UncleJulius() {
        super("Дядя Юлиус");
    }

    public UncleJulius(Mood mood) {
        super("Дядя Юлиус", mood);
    }
}
