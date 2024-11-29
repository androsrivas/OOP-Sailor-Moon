package org.bootcamp.characters;

import org.bootcamp.enums.Gender;
import org.bootcamp.enums.Species;
import org.bootcamp.enums.SystemType;
import org.bootcamp.interfaces.Attack;
import org.bootcamp.interfaces.Transform;
import org.bootcamp.items.Item;

public class SailorGuardian extends Character implements Attack, Transform {
    private String sailorName;
    private String planet;
    private SystemType systemType;
    private boolean isAuthentic;
    private boolean isPrincess;
    private Item attackItem;
    private Item transformationItem;

    //CONSTRUCTOR
    public SailorGuardian(
            String name,
            int age,
            Gender gender,
            Species species,
            String sailorName,
            String planet,
            SystemType systemType,
            boolean isAuthentic,
            boolean isPrincess,
            Item attackItem,
            Item transformationItem) {
        super(name, age, gender, species);
        this.sailorName = sailorName;
        this.planet = planet;
        this.systemType = systemType;
        this.isAuthentic = isAuthentic;
        this.isPrincess = isPrincess;
        this.attackItem = attackItem;
        this.transformationItem = transformationItem;
    }

    //GETTERS
    public String getSailorName () {
        return sailorName;
    }

    public String getPlanet () {
        return planet;
    }

    public String getSystemType () {
        return systemType.getDescription();
    }

    public boolean isAuthentic() {
        return isAuthentic;
    }

    public boolean isPrincess() {
        return isPrincess;
    }

    public Item getAttackItem() {
        return attackItem;
    }

    public Item getTransformationItem () {
        return transformationItem;
    }

    //SETTERS

    public void setSailorName(String sailorName) {
        this.sailorName = sailorName;
    }

    public void setPlanet (String planet) {
        this.planet = planet;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }

    public void setAuthentic(boolean authentic) {
        isAuthentic = authentic;
    }

    public void setPrincess(boolean princess) {
        isPrincess = princess;
    }

    public void setAttackItem(Item attackItem) {
        this.attackItem = attackItem;
    }

    public void setTransformationItem(Item transformationItem) {
        this.transformationItem = transformationItem;
    }

    //DISPLAY INFO
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Sailor name: " + sailorName);
        System.out.println("Planet: " + planet);
        System.out.println("System: " + systemType.getDescription());
        System.out.println("Princess: " + (isPrincess ? "Yes" : "No"));
        System.out.println("Sailor type: " + (isAuthentic ? "Sailor Guardian" : "Sailor Animamate"));
    }

    public String getAttackName () {
        return attackItem.getName();
    }

    public void attack() {
        System.out.println(sailorName + " uses " + getAttackName() + " to attack!");
    }

    public String getTransformation () {
        return transformationItem.getName();
    }

    public void transform() {
        System.out.println(getName() + " uses " + getTransformation() + " to transform to " + sailorName + "!");
    }
}
