package ru.jlexender.se.labstory;

import ru.jlexender.se.labstory.abstractClasses.*;
import ru.jlexender.se.labstory.classesList.Place.*;
import ru.jlexender.se.labstory.classesList.Human.*;
import ru.jlexender.se.labstory.classesList.Action.*;
import ru.jlexender.se.labstory.classesList.Item.*;
import ru.jlexender.se.labstory.classesList.Liquid.*;
import ru.jlexender.se.labstory.interfaces.*;
import ru.jlexender.se.labstory.enums.*;


public class Book {

    Human karlsson = new Human("Карлсон");
    Human baby = new Human("Малыш");
    Human rulle = new Human("Рулле");
    Human fille = new Human("Филле");
    Human frokenBock = new Human("Фрекен Бок");
    Human uncleJulius = new Human("Дядя Юлиус");

    Porch porch = new Porch();
    Place rulleHome = new RulleHome();
    Place filleHome = new FilleHome();
    Place babyHome = new BabyHome();

    Glass glass = new Glass(Color.LIGHTBLUE);
    Juice juice = new Juice();
    Buns buns = new Buns();

    public Book() {}

    public void go() {
       karlsson.doAction(new Sit(porch));
       baby.doAction(new Sit(porch));
       baby.doAction(new StartThinking());
       rulle.doAction(new Lives(rulleHome));
       fille.doAction(new Lives(filleHome));
       frokenBock.doAction(new GoingTo(babyHome));
       uncleJulius.doAction(new GoingTo(babyHome));
       baby.doAction(new ForgotToTell(karlsson));
       baby.doAction(new StopThinking(Mood.WORRIED));
       baby.doAction(new Tell(karlsson));
       karlsson.doAction(new DoNotListen(baby));
       karlsson.doAction(new EatItem(buns));
       karlsson.doAction(new PourDrinkingItem(glass, juice));
       karlsson.doAction(new DrinkFromItem(glass));
       baby.doAction(new GiftItem(glass, karlsson));
       karlsson.doAction(new HoldItem(glass));
       karlsson.doAction(new RollItem(glass));
    }
}
