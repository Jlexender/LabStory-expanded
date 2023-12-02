package ru.jlexender.se.labstory.basicClasses;

import static ru.jlexender.se.labstory.utilityClasses.Printer.print;
import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.actionInterfaces.*;
import ru.jlexender.se.labstory.interfaces.*;

public class Human implements IDoNotListen, IDrinkFromItem, IEat, IForgetToTell, IGoingTo, IHold, ILive, IPour, IRollItem, ISit, IStartThinking, IStopThinking, ITell {
    private final String name;
    private Mood mood;
    
    public Human(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
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
        print(this.getName() + "has forgotten to tell " + human.getName());
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

    public void pour(IDrinkingItem item, Item liquid) {
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
        print(this.getName() + " has started thinking ===");
    }

    public void stopThinking() {
        print(this.getName() + " has stopped thinking ===");
    }

    public void tell(Human human) {
        print(this.getName() + " talks to " + human.getName());
    }


    @Override
    public boolean equals(Object object) {
        return this.toString() == object.toString();
    }
    
    @Override
    public String toString() {
        return "Human{"
               + "name='" + name + '\'' 
               + ", mood=" + mood
               + '}';
    } 

    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }

}

