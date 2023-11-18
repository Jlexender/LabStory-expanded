package ru.jlexender.se.labstory.basicClasses;

public class Time {
    private final int months, years;

    public Time(int years, int months) {
        this.months = months;
        this.years = years;
    }

    public Time(int months) {
        this.months = months;
        this.years = 0;
    }    
    
    public int getMonths() { return months; }
    public int getYears() { return years; }

    @Override
    public boolean equals(Object object) {
        return this == object;
    }
    
    @Override
    public String toString() {
        return "Time{"
               + "years=" + years + '\'' 
               + ", months=" + months + '\'' 
               + '}';
    }

    @Override
   public int hashCode() {
       return this.toString().hashCode();
   } 
}

