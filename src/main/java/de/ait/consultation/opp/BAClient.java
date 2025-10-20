package de.ait.consultation.opp;

public class BAClient {

    static Notifier notifier;

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(40);
        System.out.println(bankAccount.getBalance());

        Car car = new Car("Tesla");
        car.move();

        BankAccountNew bankAccount2 = new SavingAccount(1000);
        BankAccountNew bankAccount3 = new CheckingAccount(1000);

        notifier = new SMSNotifier();
        User user = new User("test@gmail.com", "2345678", notifier);
        System.out.println(user.contact());
        user.sendWelcome();
    }
}
