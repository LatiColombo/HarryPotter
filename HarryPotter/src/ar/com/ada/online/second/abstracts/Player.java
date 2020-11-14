package ar.com.ada.online.second.abstracts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private String location;
    private Integer lifeLevel = 100;
    private Integer magicEnergy = 100;
    protected List<Spell> spellList = new ArrayList<Spell>();
    private String actualPlayer;
    private String opponent;

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

    public List<Spell> getSpellList() {
        return spellList;
    }

    public void addSpell(Spell spell) {
        spellList.add(spell);
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", lifeLevel=" + lifeLevel +
                ", magicEnergy=" + magicEnergy +
                ", spellList=" + spellList +
                ", actualPlayer='" + actualPlayer + '\'' +
                ", opponent='" + opponent + '\'' +
                ", keyboard=" + keyboard +
                '}';
    }
}
