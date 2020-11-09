package ar.com.ada.online.second.abstracts;

public class Wand {
    protected String wandName;
    protected Integer damagePointsAdded;

    public Wand() {
    }

    public Wand(String wandName, Integer damagePointsAdded) {
        this.wandName = wandName;
        this.damagePointsAdded = damagePointsAdded;
    }

    public String getWandName() {
        return wandName;
    }

    public void setWandName(String wandName) {
        this.wandName = wandName;
    }

    public Integer getDamagePointsAdded() {
        return damagePointsAdded;
    }

    public void setDamagePointsAdded(Integer damagePointsAdded) {
        this.damagePointsAdded = damagePointsAdded;
    }
}
