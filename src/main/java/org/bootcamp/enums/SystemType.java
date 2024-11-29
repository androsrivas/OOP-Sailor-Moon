package org.bootcamp.enums;

public enum SystemType {
    INNERSOLARSYSTEM("Inner Solar System"),
    OUTTERSOLARSYSTEM("Outer Solar System"),
    KINMOKUSYSTEM("Kinmoku System"),
    SHADOWGALACTICA("Shadow Galactica"),
    DISTANTFUTURE("Distant Future"),
    UNKNOWN("Unknown");

    private final String description;

    //CONSTRUCTOR
    SystemType(String description) {
        this.description = description;
    }

    //GETTER
    public String getDescription () {
        return description;
    }
}
