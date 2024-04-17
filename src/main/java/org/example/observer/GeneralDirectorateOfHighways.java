package org.example.observer;
import java.util.ArrayList;
import java.util.List;

public class GeneralDirectorateOfHighways implements Observer, Display{ 
    
    private List<String> notifications;
    
    public GeneralDirectorateOfHighways(Subject subject) {
        this.notifications = new ArrayList<>();
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        notifications.add(msg);
        display();
    }
    
    @Override
    public void display() {
        System.out.printf("GeneralDirectorateOfHighways: %s \n", notifications.toString());
        
    }
    
}