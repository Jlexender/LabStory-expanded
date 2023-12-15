package ru.jlexender.se.labstory.actionInterfaces;

import ru.jlexender.se.labstory.basicClasses.Item;
import ru.jlexender.se.labstory.basicClasses.Human.Limb;
import ru.jlexender.se.labstory.exceptions.WrongHumanLimbException;

public interface IHoldWithLimb {
    public void holdWithLimb(Item item, Limb ... limb) throws WrongHumanLimbException;
}
