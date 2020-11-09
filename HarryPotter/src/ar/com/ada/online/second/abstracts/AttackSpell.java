package ar.com.ada.online.second.abstracts;

public class AttackSpell extends Spell {
    protected static String spellItem;

    public AttackSpell() {
    }

    public AttackSpell(Integer requiredMagicPoints, String name) {
        super(requiredMagicPoints, name);
    }

    public static String getSpellItem() {
        return spellItem;
    }

    public static void setSpellItem(String spellItem) {
        AttackSpell.spellItem = spellItem;
    }
}
