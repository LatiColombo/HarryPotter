package ar.com.ada.online.second.abstracts;

public class Spell {
    protected static Integer requiredMagicPoints;
    protected static Integer attack = 0;
    protected static Integer heal = 0;
    protected static Integer magicEnergy = 0;
    protected static String name;

    public Spell() {
    }

    public Spell(Integer requiredMagicPoints, String name) {
        this.requiredMagicPoints = requiredMagicPoints;
        this.name = name;
        this.heal = heal;
        this.attack = attack;
        this.magicEnergy = magicEnergy;
    }

    public static Integer getRequiredMagicPoints() {
        return requiredMagicPoints;
    }

    public static void setRequiredMagicPoints(Integer requiredMagicPoints) {
        Spell.requiredMagicPoints = requiredMagicPoints;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Spell.name = name;
    }

    public static Integer getAttack() {
        return attack;
    }

    public static void setAttack(Integer attack) {
        Spell.attack = attack;
    }

    public static Integer getHeal() {
        return heal;
    }

    public static void setHeal(Integer heal) {
        Spell.heal = heal;
    }

    public static Integer getMagicEnergy() {
        return magicEnergy;
    }

    public static void setMagicEnergy(Integer magicEnergy) {
        Spell.magicEnergy = magicEnergy;
    }
}
