package org.example.observer;
import java.util.ArrayList;
import java.util.List;

public class Centre implements Subject{

    private List<Observer> hospitals;
    private List<Observer> policeDepartments;
    private List<Observer> fireDepartments;

    public Centre() {
        this.hospitals = new ArrayList<>();
        this.policeDepartments = new ArrayList<>();
        this.fireDepartments = new ArrayList<>();
    }

    public void crash(int dead, int injured){
        String msg = "Crash: " + dead + " dead and " + injured + " injured";
        System.out.println("Crash is notified to:");
        notifyHospitals(msg);
        notifyPoliceDepartments(msg);
        System.out.println("");
    }

    public void fire(int dead, int injured){
        String msg = "Fire: " + dead + " dead and " + injured + " injured";
        System.out.println("Fire is notified to:");
        notifyHospitals(msg);
        notifyFireDepartments(msg);
        System.out.println("");
    }

    public void trafficSituation(String intencity) {
        String msg = "Traffic situation: " + intencity;
        System.out.println("Traffic stuation is notified to:");
        notifyPoliceDepartments(msg);
        notifyFireDepartments(msg);
        notifyHospitals(msg);
        System.out.println("");
    }


    @Override
    public void registerObserver(Observer observer) {
        if(observer instanceof Hospital)
            hospitals.add(observer);
        else if(observer instanceof PoliceDepartment)
            policeDepartments.add(observer);
        else if(observer instanceof FireDepartment)
            fireDepartments.add(observer);
            
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer instanceof Hospital)
            hospitals.remove(observer);
        else if(observer instanceof  PoliceDepartment)
            policeDepartments.remove(observer);
        else if(observer instanceof FireDepartment)
            fireDepartments.remove(observer);
    }
    

    public void notifyHospitals(String msg)
    {
        for(Observer hospital : hospitals)
        {
            hospital.update(msg);
        }
    }
    
    public void notifyPoliceDepartments(String msg)
    {
        for(Observer policeDepartment : policeDepartments)
        {
            policeDepartment.update(msg);
        }
    }
    
    public void notifyFireDepartments(String msg)
    {
        for(Observer fireDepartment : fireDepartments)
        {
            fireDepartment.update(msg);
        }
    }
    
    
}
