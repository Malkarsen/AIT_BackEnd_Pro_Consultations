package de.ait.consultation.opp;

public class CheckingAccount extends BankAccountNew {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void updateBalance() {
        balance = balance - balance * 0.1;
        System.out.println("CheckingAccount balance is " + balance);
    }
}
