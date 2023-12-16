package ru.jlexender.se.labstory.exceptions;

import ru.jlexender.se.labstory.basicClasses.Human;

public class UnknownHumanLocationException extends Exception {
    Human subject;

    public UnknownHumanLocationException(String message, Human subject) {
        super(message);
        this.subject = subject;
    }

    public Human getHuman() { return subject; }
}
