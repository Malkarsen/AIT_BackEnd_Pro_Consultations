package de.ait.consultation.opp;

public class Car extends Vehicke{
    public Car(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + " drives");
    }
}
