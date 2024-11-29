package org.bootcamp.enums;

public enum ItemType {
    TOOL("Tool"),
    WEAPON("Weapon"),
    DEVICE("Device");

    private final String description;

    //CONSTRUCTOR
    ItemType(String description) {
        this.description = description;
    }

    //GETTER
    public String getDescription () {
        return description;
    }
}
