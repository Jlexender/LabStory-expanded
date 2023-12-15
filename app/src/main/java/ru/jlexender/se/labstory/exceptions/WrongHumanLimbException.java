package ru.jlexender.se.labstory.exceptions;

import ru.jlexender.se.labstory.basicClasses.Human;

public class WrongHumanLimbException extends Exception {
    Human subject;

    public WrongHumanLimbException(String message, Human subject) {
        super(message);
        this.subject = subject;
    }

    public Human getHuman() { return subject; }
}
