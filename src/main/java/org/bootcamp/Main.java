package org.bootcamp;

import org.bootcamp.characters.SailorGuardian;
import org.bootcamp.enums.Gender;
import org.bootcamp.enums.ItemType;
import org.bootcamp.enums.Species;
import org.bootcamp.enums.SystemType;
import org.bootcamp.items.Item;

public class Main {
    public static void main(String[] args) {
        Item moonTiara = new Item(
          "Moon Tiara",
          ItemType.TOOL,
          "Allows to attack enemies using a boomerang effect"
        );
        Item moonBrooch = new Item(
                "Moon brooch",
                ItemType.TOOL,
                "Allows to transform"
        );

        SailorGuardian sailorMoon = new SailorGuardian(
                "Usagi Tsukino",
                14,
                Gender.FEMALE,
                Species.HUMAN,
                "Sailor Moon",
                "Moon",
                SystemType.INNERSOLARSYSTEM,
                true,
                true,
                moonTiara,
                moonBrooch
        );

        sailorMoon.displayInfo();
        sailorMoon.transform();
        sailorMoon.attack();
    }
}