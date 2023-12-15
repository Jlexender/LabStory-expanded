package ru.jlexender.se.labstory.actionInterfaces;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.exceptions.ItemTooLargeException;

public interface IRollItem {
    public void rollItem(Item item) throws ItemTooLargeException;
}
