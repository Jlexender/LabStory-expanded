package ru.jlexender.se.labstory;

import ru.jlexender.se.labstory.basicClasses.*;
import ru.jlexender.se.labstory.classesList.Place.*;
import ru.jlexender.se.labstory.classesList.Item.*;
import ru.jlexender.se.labstory.interfaces.*;
import ru.jlexender.se.labstory.enums.*;


public class Book {

    Human karlsson = new Human("Karlsson");
    Human baby = new Human("Baby");
    Human rulle = new Human("Rulle");
    Human fille = new Human("Fille");
    Human frokenBock = new Human("Froken Bock");
    Human uncleJulius = new Human("uncle Julius");

    Porch porch = new Porch();
    Place rulleHome = new RulleHome();
    Place filleHome = new FilleHome();
    Place babyHome = new BabyHome();

    Glass glass = new Glass(Color.LIGHTBLUE);
    Juice juice = new Juice();
    Buns buns = new Buns();

    public Book() {}

    public void go() {
       karlsson.sit(porch);
       baby.sit(porch);
       baby.startThinking();
       rulle.live(rulleHome);
       fille.live(filleHome);
       frokenBock.isGoingTo(babyHome);
       uncleJulius.isGoingTo(babyHome);
       baby.stopThinking();
       baby.forgetToTell(karlsson);
       baby.tell(karlsson);
       karlsson.doNotListen(baby);
       karlsson.eat(buns);
       karlsson.pour(glass, juice);
       karlsson.drinkFromItem(glass);
       karlsson.hold(glass);
       karlsson.rollItem(glass);
    }
}
