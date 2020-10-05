package ru.chalovai.lab3;

public abstract class Furniture {
    protected String name, material;
    public abstract int cost ();
    public abstract boolean IsLeg();
    public abstract boolean IsWheel();
}
