package org.bootcamp.characters;

import org.bootcamp.enums.Gender;
import org.bootcamp.enums.Species;

abstract class Character {
    private String name;
    private int age;
    private Gender gender;
    private Species species;

    //CONSTRUCTOR
    public Character(String name, int age, Gender gender, Species species) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.species = species;
    }

    //GETTERS
    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String getGender () {
        return gender.getDescription();
    }

    public String getSpecies () {
        return species.getDescription();
    }

    //SETTERS
    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setGender (Gender gender) {
        this.gender = gender;
    }

    public void setSpecies (Species species) {
        this.species = species;
    }


    //DISPLAY INFO
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender.getDescription());
        System.out.println("Specie: " + species.getDescription());
    }
}
