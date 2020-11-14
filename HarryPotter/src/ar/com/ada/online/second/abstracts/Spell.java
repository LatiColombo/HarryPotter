package ar.com.ada.online.second.abstracts;

public class Spell {
    protected Integer requiredMagicPoints;
    protected Integer attack = 0;
    protected Integer heal = 0;
    protected Integer magicEnergy = 0;
    protected String name;

    public Spell() {
    }

    public Spell(Integer requiredMagicPoints, Integer attack, Integer heal, Integer magicEnergy, String name) {
        this.requiredMagicPoints = requiredMagicPoints;
        this.attack = attack;
        this.heal = heal;
        this.magicEnergy = magicEnergy;
        this.name = name;
    }

    public Integer getRequiredMagicPoints() {
        return requiredMagicPoints;
    }

    public void setRequiredMagicPoints(Integer requiredMagicPoints) {
        this.requiredMagicPoints = requiredMagicPoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
