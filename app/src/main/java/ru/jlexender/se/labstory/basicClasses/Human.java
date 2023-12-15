package ru.jlexender.se.labstory.basicClasses;

import ru.jlexender.se.labstory.utilityClasses.Printer;
import ru.jlexender.se.labstory.utilityInterfaces.INamed;
import ru.jlexender.se.labstory.enums.Mood;
import ru.jlexender.se.labstory.actionInterfaces.*;
import ru.jlexender.se.labstory.interfaces.*;
import ru.jlexender.se.labstory.exceptions.*;
import java.util.List;

public class Human implements IDoNotListen, IDrinkFromItem, IEat, IForgetToTell, IGoingTo, IHold, ILive, IPour, IRollItem, ISit, IThink, ITell, IHoldWithLimb, IWantToSay, IWear, IJumpUp, IReturnBackTo, IInterrupt, INamed {
    private final String name;
    private Mood mood;
    private Place location = null;

    public Limb leftArm;
    public Limb rightArm;
    public Limb leftLeg;
    public Limb rightLeg;
    public Limb rightFingers;
    public Limb leftFingers;
    public Limb rightToes;
    public Limb leftToes;

    public class Limb implements INamed {
        private String name;
        private Human owner = Human.this;

        private Limb(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private Human getOwner() {
            return owner;
        }
    }
    
    public Human(String name, Mood mood, Place location) {
        this.name = name;
        this.mood = mood;
        this.location = location;
        leftArm = new Limb("left arm");
        rightArm = new Limb("right arm");
        leftLeg = new Limb("left leg");
        rightLeg = new Limb("right leg");
        rightFingers = new Limb("right fingers");
        leftFingers = new Limb("left fingers");
        rightToes = new Limb("right toes");
        leftToes = new Limb("left toes");
    }

    public Human(String name, Mood mood) {
        this(name, mood, null);
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

    public void changeMood(Mood mood) {
        this.mood = mood;
        Printer.describeAction(this.getName() + " is " + mood.getValue());
    }

    public Place getLocation() throws UnknownHumanLocationException {
        if (location == null)   throw new UnknownHumanLocationException("Location of " + getName() + " is undefined", this);
        return location;
    }

    protected void setLocation(Place location) {
        this.location = location;
    }

    public void doNotListen() {
        Printer.describeAction(this.getName() + " isn't listening to anyone");
    }

    public void doNotListen(Human human) {
        Printer.describeAction(this.getName() + " isn't listening to " + human.getName());
    }
    
    public void drinkFromItem(IDrinkingItem item) {
        Printer.describeAction(this.getName() + " drinks from " + (((Item)item).getName())); 
    }
    
    public void eat(IFood item) {
        Printer.describeAction(this.getName() + " eats " + ((Item)item).getName());
    }

    public void forgetToTell(Human human) {
        Printer.describeAction(this.getName() + " has forgotten to tell " + human.getName());
    }

    public void isGoingTo(Place place) {
        Printer.describeAction(this.getName() + " is going to " + place.getName());
    }

    public void hold(Item item) {
        Printer.describeAction(this.getName() + " holds " + item.getName());
    }

    public void live(Place place) {
        Printer.describeAction(this.getName() + " lives in " + place.getName());
    }

    public void pour(IDrinkingItem item, Item liquid) throws ItemIsNotPourableException, ItemTooLargeException {
        if (!liquid.isLiquid())     throw new ItemIsNotPourableException("Item " + liquid.getName() + " cannot be poured", liquid);
        if (liquid.getSize() > ((Item)item).getSize()) throw new ItemTooLargeException("Item " + liquid.getName() + " is too large", liquid);
        Printer.describeAction(this.getName() + " pours " + liquid.getName() + " into " + ((Item)item).getName()); 
    }

    public void rollItem(Item item) throws ItemTooLargeException {
        Printer.describeAction(this.getName() + " rolls " + item.getName());
    }

    public void sit() {
        Printer.describeAction(this.getName() + " sits");
    }
    
    public void sit(Place place) {
        Printer.describeAction(this.getName() + " sits on " + place.getName());
    }

    public void think(String content) {
       record Thought(String content) {
           public String getContent() {
               return content;
           }
       } 
       Thought thought = new Thought(content);
       Printer.describeAction(this.getName() + " thinks: " + thought.getContent());
    }




    public void tell(Human human) {
        Printer.describeAction(this.getName() + " tells " + human.getName());
    }
    
    public void tell(Human human, String phrase) {
        Printer.describeAction(this.getName() + " tells " + human.getName() + ": " + phrase);
    }

    public void holdWithLimb(Item item, Limb ... limb) throws WrongHumanLimbException {
        for (Limb l: limb) {
            if (l.getOwner() != this) throw new WrongHumanLimbException(l.getName() + " of " + l.getOwner() + " is not available for " + this, this);
        }
        Printer.describeAction(this.getName() + " holds " + item.getName() + " with " + Printer.formatList(limb));
    }

    public void wantToSay(String phrase) {
        Printer.describeAction(this.getName() + " want to say: " + phrase);
    }

    public void jumpUp() {
        Printer.describeAction(this.getName() + " jumped up ");
        changeMood(Mood.WORRIED);
    }

    public void returnBackTo(Place place) {
        Printer.describeAction(this.getName() + " returned to " + place.getName());
        setLocation(place);
    }

    public void takeItemOn(IWearable item) {
        Printer.describeAction(this.getName() + " took " + ((Item)item).getName() + " on");
    }

    public void takeItemOff(IWearable item) {
        Printer.describeAction(this.getName() + " took " + ((Item)item).getName() + " off");
    }

    public void interrupt(Human human) {
        Printer.describeAction(this.getName() + " interrupted " + human.getName());
    }
    
    public void interrupt() {
        Printer.describeAction(this.getName() + " interrupted somebody");
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

