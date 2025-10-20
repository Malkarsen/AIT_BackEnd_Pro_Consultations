package de.ait.consultation.opp;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 50;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Invalid amount");
            return;
        }
        balance -= amount;
    }
}
