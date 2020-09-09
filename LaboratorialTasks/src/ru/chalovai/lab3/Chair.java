package ru.chalovai.lab3;

public class Chair extends Furniture {
    private int leg;

    public Chair(String material) {
        this.leg = 4;
        super.name = "Chair";
        this.material = material;
    }

    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public boolean IsLeg() {
        return true;
    }

    @Override
    public boolean IsWheel() {
        return false;
    }

    @Override
    public String toString() {
        return name + ", " + "has legs (" + IsLeg() + ") or has wheels (" + IsWheel() + "). " + leg +
                " legs, " + "made from " + material + ", price is " + cost();
    }
}
