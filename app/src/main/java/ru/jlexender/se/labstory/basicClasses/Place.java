package ru.jlexender.se.labstory.basicClasses;

public abstract class Place {
    private final String name;
    
    private Weather weather = Weather.CLOUDY;
    
    public static enum Weather { 
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
    
    public Place(String name) {
        this(name, Weather.CLOUDY);
    }

    public Place(String name, Weather weather) {
        this.name = name;
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
        return this.toString() == object.toString();
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

