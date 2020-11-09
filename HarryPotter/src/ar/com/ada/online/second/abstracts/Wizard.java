package ar.com.ada.online.second.abstracts;

import java.util.Scanner;

public class Wizard extends Player {
    private Wand wand;

    public Wizard(Wand wand) {
        this.wand = wand;
    }

    public Wizard (){
    }

    public Wizard(String name, String location, Integer lifeLevel, Integer magicEnergy, String spellList, Scanner keyboard, Wand wand) {
        super(name, location, lifeLevel, magicEnergy, spellList, keyboard);
        this.wand = wand;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
