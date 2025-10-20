package de.ait.consultation.opp;

public class SMSNotifier implements Notifier {
    @Override
    public void notify(String to, String message) {
        System.out.println("SMS: " + message + ", to: " + to);
    }
}
