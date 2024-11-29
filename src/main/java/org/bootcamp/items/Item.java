package org.bootcamp.items;

import org.bootcamp.enums.ItemType;

public class Item {
    private String name;
    private ItemType itemType;
    private String description;

    //CONSTRUCTOR
    public Item (String name, ItemType itemType, String description) {
        this.name = name;
        this.itemType = itemType;
        this.description = description;
    }

    //GETTERS
    public String getName () {
        return name;
    }

    public ItemType getType () {
        return itemType;
    }

    public String getDescription () {
        return description;
    }

    //SETTERS
    public void setName (String name) {
        this.name = name;
    }

    public void setType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //USE ITEM
    public void useItem () {
        System.out.println("Using " + name + " to " + description);
    }
}
