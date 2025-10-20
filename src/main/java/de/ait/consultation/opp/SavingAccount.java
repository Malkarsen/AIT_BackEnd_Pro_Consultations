package de.ait.consultation.opp;

public class SavingAccount extends BankAccountNew {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    void updateBalance() {
        balance = balance + balance * 0.1;
        System.out.println("SavingAccount balance is " + balance);
    }
}
