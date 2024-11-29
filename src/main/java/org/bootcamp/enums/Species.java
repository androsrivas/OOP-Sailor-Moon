package org.bootcamp.enums;

public enum Species {
    HUMAN("Human"),
    EXTRATERRESTRIAL("Extraterrestrial"),
    HUMANOID("Humanoid");

    private final String description;

    //CONSTRUCTOR
    Species(String description) {
        this.description = description;
    }

    //GETTER
    public String getDescription () {
        return description;
    }
}
