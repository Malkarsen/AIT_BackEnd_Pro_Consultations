package de.ait.consultation.opp;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String to, String message) {
        System.out.println("Email: " + message + ", to: " + to);
    }
}
