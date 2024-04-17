package org.example.observer;
import java.util.ArrayList;
import java.util.List;

public class PoliceDepartment implements Observer, Display{ 
    
    private List<String> notifications;
    private String name;

    public PoliceDepartment(Subject subject, String name) {
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
        System.out.printf("PoliceDepartment (%s): %s \n", name, notifications.toString());
    }
    
    
}

