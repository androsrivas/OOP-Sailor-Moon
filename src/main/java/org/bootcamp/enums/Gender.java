package org.bootcamp.enums;

public enum Gender {
    FEMALE("Female"),
    MALE("Male"),
    NONBINARY("Non-binary"),
    UNKOWN("Unknown");

    private final String description;

    //CONSTRUCTOR
    Gender(String description) {
        this.description = description;
    }

    //GETTER
    public String getDescription () {
        return description;
    }
}
