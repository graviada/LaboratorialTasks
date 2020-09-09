package ru.chalovai.lab3;

public class Armchair extends Furniture {
    private int wheel;

    public Armchair(String material) {
        this.wheel = 4;
        super.name = "Armchair";
        super.material = material;
    }

    @Override
    public int cost() {
        return 2000;
    }

    @Override
    public boolean IsLeg() {
        return false;
    }

    @Override
    public boolean IsWheel() {
        return true;
    }

    @Override
    public String toString() {
        return name + ", " + "has legs (" + IsLeg() + ") or has wheels (" + IsWheel() + "). " + wheel +
                    " wheels, " + "made from " + material + ", price is " + cost();
    }
}
