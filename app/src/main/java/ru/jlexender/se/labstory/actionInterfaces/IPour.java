package ru.jlexender.se.labstory.actionInterfaces;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;
import ru.jlexender.se.labstory.exceptions.ItemIsNotPourableException;

public interface IPour {
    public void pour(IDrinkingItem item, Item liquid) throws ItemIsNotPourableException;
}
