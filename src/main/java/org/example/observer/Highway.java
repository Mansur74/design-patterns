package org.example.observer;
import java.util.ArrayList;
import java.util.List;

public class Highway implements Subject{

    private List<Observer> hospitals;
    private List<Observer> policeDepartments;
    private Observer gdh;

    public Highway() {
        this.hospitals = new ArrayList<>();
        this.policeDepartments = new ArrayList<>();
    }

    public void crash(int dead, int injured){
        String msg = "Crash: " + dead + " dead and " + injured + " injured";
        System.err.println("Crash is notified to:");
        notifyHospitals(msg);
        notifyPoliceDepartments(msg);
        System.err.println("");
    }

    public void work(String job, int hour) {
        String msg = "Working: " + hour + " hours of " + job;
        System.err.println("Working is notified to:");
        notifyGDH(msg);
        System.err.println("");
    }

    public void trafficSituation(String intencity) {
        String msg = "Traffic situation: " + intencity;
        System.err.println("Traffic stuation is notified to:");
        notifyPoliceDepartments(msg);
        notifyGDH(msg);
        System.err.println("");
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer instanceof Hospital)
            hospitals.add(observer);
        else if(observer instanceof PoliceDepartment)
            policeDepartments.add(observer);
        else if(observer instanceof GeneralDirectorateOfHighways)
            gdh = observer;
            
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer instanceof Hospital)
            hospitals.remove(observer);
        else if(observer instanceof  PoliceDepartment)
            policeDepartments.remove(observer);
        else if(observer instanceof GeneralDirectorateOfHighways)
            gdh = null;
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
    
    public void notifyGDH(String msg)
    {
        if(this.gdh != null)
            this.gdh.update(msg);
    }
    
    
}
