package ru.jlexender.se.labstory.basicClasses;

import ru.jlexender.se.labstory.enums.Mood;

public abstract class Action {
    private String description;
    private Mood mood;
    private boolean moodChanging;
    
    public Action(String description) {
        this.description = description;
        moodChanging = false;
    }

    public Action(String description, Mood mood) {
        this.description = description;
        this.mood = mood;
        moodChanging = true;
    }
    
    protected void applyChanges(Human human) {
        if (moodChanging) human.setMood(mood); 
    }

    protected String describe() { return "Something has happened"; } 

    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return "Action{"
               + "description='" + description + '\'' 
               + ", mood=" + mood
               + ", moodChanging=" + moodChanging
               + '}';
    }

    @Override 
    public int hashCode() {
        return this.toString().hashCode();
    }
}
