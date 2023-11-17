package ru.Jlexender.se.labstory.enums;

public enum Mood {
    NORMAL("нормальный"),
    HAPPY("весёлый"),
    ANGRY("злой"),
    SAD("грустный"),
    WORRIED("взволнованный");

    private String value;

    private Mood(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
