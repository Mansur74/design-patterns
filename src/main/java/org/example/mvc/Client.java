package org.example.mvc;
public class Client {
    public static void main(String[] args){
        Plant plant = new Plant("Clove", "Rose Centifolia", 1);
        PlantView plantView = new PlantView();
        PlantController plantController = new PlantController(plant, plantView);
        plantController.updateView();

        System.out.println();

        plantController.setStudentName("Rose");
        plantController.updateView();

    }
}
