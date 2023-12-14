package ru.jlexender.se.labstory.actionInterfaces;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.interfaces.IWearable;

public interface IWear {
    public void takeItemOn(IWearable item);
    public void takeItemOff(IWearable item);
}
