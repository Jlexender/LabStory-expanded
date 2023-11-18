package ru.jlexender.se.labstory.enums;

public enum Weather {
    CLOUDY("cloudy"),
    SUNNY("sunny"),
    SNOWY("snowy"),
    RAINY("rainy"),
    THUNDER("thunder");
    
    private String value;
    
    private Weather(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;            
    }

}
