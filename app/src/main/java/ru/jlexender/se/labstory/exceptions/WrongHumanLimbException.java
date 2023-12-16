package ru.jlexender.se.labstory.exceptions;

import ru.jlexender.se.labstory.basicClasses.Human;

public class WrongHumanLimbException extends RuntimeException {
    Human subject;

    public WrongHumanLimbException(String message, Human subject) {
        super(message);
        this.subject = subject;
    }

    public Human getHuman() { return subject; }
}
