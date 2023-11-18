package ru.jlexender.se.labstory.enums;

public enum Color {
    NONE("no color"),
    RED("red"),
    BLUE("blue"),
    LIGHTBLUE("light blue"),
    GREEN("greeen"),
    YELLOW("yellow"),
    ORANGE("orange"),
    PINK("pink"),
    WHITE("white"),
    BLACK("black");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
