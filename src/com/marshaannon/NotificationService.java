package com.marshaannon;

public class NotificationService implements EmailService {
    public void notify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
