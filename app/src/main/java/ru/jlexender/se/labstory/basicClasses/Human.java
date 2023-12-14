package ru.jlexender.se.labstory.basicClasses;

import static ru.jlexender.se.labstory.utilityClasses.Printer.print;
import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.actionInterfaces.*;
import ru.jlexender.se.labstory.interfaces.*;
import ru.jlexender.se.labstory.exceptions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Human implements IDoNotListen, IDrinkFromItem, IEat, IForgetToTell, IGoingTo, IHold, ILive, IPour, IRollItem, ISit, IStartThinking, IStopThinking, ITell, IHoldWithToes, IWantToSay, IWear, IInterrupt {
    private final String name;
    private Mood mood;
    private Place location = null;

    public Human(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
    }
    
    public Human(String name, Mood mood, Place location) {
        this.name = name;
        this.mood = mood;
        this.location = location;
    }

    public Human(String name) {
        this(name, Mood.NORMAL);
    }

    public String getName() {
        return name;
    }

    public Mood getMood() {
        return mood;
    }

    protected void setMood(Mood mood) {
        this.mood = mood;
        print(this.getName() + " is " + mood.getValue());
    }

    public Place getLocation() throws UnknownHumanLocationException {
        if (location == null)   throw new UnknownHumanLocationException("Location of " + getName() + " is undefined", this);
        return location;
    }

    protected void setLocation(Place location) {
        this.location = location;
    }

    public void doNotListen() {
        print(this.getName() + " isn't listening to anyone");
    }

    public void doNotListen(Human human) {
        print(this.getName() + " isn't listening to " + human.getName());
    }
    
    public void drinkFromItem(IDrinkingItem item) {
        print(this.getName() + " drinks from " + (((Item)item).getName())); 
    }
    
    public void eat(IFood item) {
        print(this.getName() + " eats " + ((Item)item).getName());
    }

    public void forgetToTell(Human human) {
        print(this.getName() + " has forgotten to tell " + human.getName());
    }

    public void isGoingTo(Place place) {
        print(this.getName() + " is going to " + place.getName());
    }

    public void hold(Item item) {
        print(this.getName() + " holds " + item.getName());
    }

    public void live(Place place) {
        print(this.getName() + " lives in " + place.getName());
    }

    public void pour(IDrinkingItem item, Item liquid) throws ItemIsNotPourableException {
        if (!liquid.isLiquid())     throw new ItemIsNotPourableException("Item " + liquid.getName() + " cannot be poured", liquid);
        print(this.getName() + " pours " + liquid.getName() + " into " + ((Item)item).getName()); 
    }

    public void rollItem(Item item) {
        print(this.getName() + " rolls " + item.getName());
    }

    public void sit() {
        print(this.getName() + " sits");
    }
    
    public void sit(Place place) {
        print(this.getName() + " sits on " + place.getName());
    }

    public void startThinking() {
        print(this.getName() + " has started thinking:");
    }

    public void stopThinking() {
        print(this.getName() + " has finished thinking.");
    }

    public void tell(Human human) {
        print(this.getName() + " tells " + human.getName());
    }
    
    public void tell(Human human, String phrase) {
        print(this.getName() + " tells " + human.getName() + ": " + phrase);
    }

    public void holdWithToes(Item item) {
        print(this.getName() + " holds " + item.getName() + " with toes");
    }

    public void wantToSay(String phrase) {
        print(this.getName() + " want to say: " + phrase);
    }

    public void jumpUp() {
        print(this.getName() + " jumped up ");
        setMood(Mood.WORRIED);
    }

    public void returnBackTo(Place place) {
        print(this.getName() + " returned to " + place.getName());
        setLocation(place);
    }

    public void takeItemOn(IWearable item) {
        print(this.getName() + " took " + ((Item)item).getName() + " on");
    }

    public void takeItemOff(IWearable item) {
        print(this.getName() + " took " + ((Item)item).getName() + " off");
    }

    public void interrupt(Human human) {
        print(this.getName() + " interrupted " + human.getName());
    }
    
    public void interrupt() {
        print(this.getName() + " interrupted somebody");
    }

    @Override
    public boolean equals(Object object) {
        return this.toString() == object.toString();
    }
    
    @Override
    public String toString() {
        if (location != null)
            return "Human{"
                   + "name='" + name + '\'' 
                   + ", mood=" + mood
                   + ", location=" + location.toString()
                   + '}';
        return "Human{"
               + "name='" + name + '\'' 
               + ", mood=" + mood
               + ", location='null'}";
    } 

    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }

}

