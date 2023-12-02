package ru.jlexender.se.labstory.actionInterfaces;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.interfaces.IDrinkingItem;

public interface IPour {
    public void pour(IDrinkingItem item, Item liquid);
}
