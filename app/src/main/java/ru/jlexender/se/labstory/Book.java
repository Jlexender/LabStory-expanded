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

    Porch porch = new Porch(Place.Weather.THUNDER);
    Place rulleHome = new RulleHome();
    Place filleHome = new FilleHome();
    Place babyHome = new BabyHome();
    Place porchPlace = new PorchPlace();

    Glass glass = new Glass(Color.LIGHTBLUE);
    Juice juice = new Juice();
    Buns buns = new Buns();
    KarlssonsBoots karlssonsBoots = new KarlssonsBoots();

    public Book() {}

    public void go() {
       try {
            rulle.jumpUp();
            fille.jumpUp();
            fille.wantToSay("Рулле, нас нет");
            fille.tell(rulle, "Нулле, рас нет");
            karlsson.returnBackTo(porchPlace);
            baby.returnBackTo(porchPlace);
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
            karlsson.takeItemOff(karlssonsBoots);
            karlsson.rollItem(glass);
            karlsson.holdWithToes(glass);
            karlsson.holdWithToes(glass);
            karlsson.interrupt();
       } catch(Exception e){
           e.printStackTrace();
       }
    }
}
