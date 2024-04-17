package org.example.observer;

public class TrafficManagementSystem {

    public static void main(String[] args) {
        Highway highway = new Highway();
        Observer hospital = new Hospital(highway, "Life Health Center");
        Observer policeDep = new PoliceDepartment(highway, "Central Department");
        Observer gdh = new GeneralDirectorateOfHighways(highway);

        highway.crash(1, 2); //dead, injured
        highway.work("road work", 18); //job, hour
        highway.trafficSituation("busy");

        highway.removeObserver(hospital);
        highway.removeObserver(policeDep);
        highway.removeObserver(gdh);
    }
    
}
