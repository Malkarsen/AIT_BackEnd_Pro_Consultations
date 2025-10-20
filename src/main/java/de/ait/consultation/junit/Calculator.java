package de.ait.consultation.junit;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public boolean checkPositive(int number) {
        return number > 0;
    }

    public boolean isAdult(int age) {
        return age > 18;
    }
}
