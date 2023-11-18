package ru.jlexender.se.labstory.enums;

public enum Mood {
    NORMAL("normal"),
    HAPPY("happy"),
    ANGRY("angry"),
    SAD("sad"),
    WORRIED("worried");

    private String value;

    private Mood(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
