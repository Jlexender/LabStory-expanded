package ru.jlexender.se.labstory.basicClasses;

import ru.jlexender.se.labstory.enums.Weather;

public abstract class Place {
    private final String name;
    private Weather weather;

    public Place(String name) {
        this.name = name;
        this.weather = Weather.CLOUDY;
    }

    public Place(String name, Weather weather) {
        this(name);
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public String getWeather() {
        return weather.getValue();
    }
    
    @Override
    public boolean equals(Object object) {
        return this == object;
    }
    
    @Override
    public String toString() {
        return "Place{"
               + "name='" + name + '\'' 
               + ", weather=" + weather 
               + '}';
    }

    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }
}

