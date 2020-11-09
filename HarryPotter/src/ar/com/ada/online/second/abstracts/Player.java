package ar.com.ada.online.second.abstracts;

import java.util.Scanner;

public class Player {
    private String name;
    private String location;
    private Integer lifeLevel = 100;
    private Integer magicEnergy = 100;
    private String spellList;
    private String actualPlayer;
    private String oponent;

    Scanner keyboard = new Scanner(System.in);

    public Player() {
    }

    public Player(String name,
                  String location,
                  Integer lifeLevel,
                  Integer magicEnergy,
                  String spellList,
                  Scanner keyboard) {
        this.name = name;
        this.location = location;
        this.lifeLevel = lifeLevel;
        this.magicEnergy = magicEnergy;
        this.spellList = spellList;
        this.keyboard = keyboard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(Integer lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }

    public String getSpellList() {
        return spellList;
    }

    public void setSpellList(String spellList) {
        this.spellList = spellList;
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }


}
