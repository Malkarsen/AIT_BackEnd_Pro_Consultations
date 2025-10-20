package de.ait.consultation.opp;

public class Vehicke {
    protected String model;

    public Vehicke(String model) {
        this.model = model;
    }

    public void move() {
        System.out.println(model + " is moving");
    }
}
