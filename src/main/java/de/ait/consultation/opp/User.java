package de.ait.consultation.opp;

public class User {
    private String email;
    private String phone;

    private final Notifier notifier;


    public User(String email, String phone, Notifier notifier) {
        this.email = email;
        this.phone = phone;
        this.notifier = notifier;
    }

    public void sendWelcome() {
        notifier.notify(email, phone);
    }

    public String contact() {
        return email != null
                ? email
                : phone;
    }
}
