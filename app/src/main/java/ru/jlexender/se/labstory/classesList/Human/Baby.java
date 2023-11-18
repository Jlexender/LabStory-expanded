package ru.jlexender.se.labstory.classesList.Human;

import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.abstractClasses.Human;

public class Baby extends Human {
    public Baby() {
        super("Малыш");
    }

    public Baby(Mood mood) {
        super("Малыш", mood);
    }
}
