package org.example.observer;
import java.util.ArrayList;
import java.util.List;

public class Hospital implements Observer, Display{ 
    
    private List<String> notifications;
    private String name;
    
    public Hospital(Subject subject, String name) {
        this.notifications = new ArrayList<>();
        this.name = name;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        notifications.add(msg);
        display();
    }
    
    @Override
    public void display() {
        System.out.printf("Hospital (%s): %s \n", name, notifications.toString());
        
    }
    
}
