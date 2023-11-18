package ru.jlexender.se.labstory.enums;

public enum Color {
    NONE("без цвета"),
    RED("красный"),
    BLUE("синий"),
    LIGHTBLUE("голубой"),
    GREEN("зелёный"),
    YELLOW("жёлтый"),
    ORANGE("оранжевый"),
    PINK("розовый"),
    WHITE("белый"),
    BLACK("чёрный");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
