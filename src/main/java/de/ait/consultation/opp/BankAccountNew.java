package de.ait.consultation.opp;

abstract class BankAccountNew {
    protected double balance;

    public BankAccountNew(double balance) {
        this.balance = balance;
    }

    abstract void updateBalance();
}
