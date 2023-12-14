package ru.jlexender.se.labstory.exceptions;

import ru.jlexender.se.labstory.basicClasses.Item;

public class ItemTooLargeException extends Exception {
    private Item subject;

    public ItemTooLargeException(String message, Item subject) {
        super(message);
        this.subject = subject;
    }
    
    public int getProblematicItem() {
        return subject.getSize();
    }
}
