package org.example.observer;

public class Client {

    public static void main(String[] args) {
        Centre highway = new Centre();
        Observer hospital = new Hospital(highway, "Ankara Hospital");
        Observer fireDepartment = new FireDepartment(highway, "Ankara Fire Department");
        Observer policeDepartment = new PoliceDepartment(highway, "Ankara Central Police Department");

        highway.crash(1, 2); //dead, injured
        highway.fire(0, 3);
        highway.trafficSituation("busy");

        highway.removeObserver(hospital);
        highway.removeObserver(policeDepartment);
        highway.removeObserver(fireDepartment);
    }
    
}
