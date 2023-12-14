package ru.jlexender.se.labstory.exceptions;

import ru.jlexender.se.labstory.basicClasses.Item;

public class ItemIsNotPourableException extends RuntimeException {
    private Item subject;

    public ItemIsNotPourableException(String message, Item subject) {
        super(message);
        this.subject = subject;
    }
    
    public Item getProblematicItem() {
        return subject;
    }
}
