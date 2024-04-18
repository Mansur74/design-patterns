package org.example.mvc;

public class PlantController {
    private Plant model;
    private PlantView view;

    public PlantController(Plant model, PlantView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name)
    {
        this.model.setName(name);
    }

    public void setStudentScientificName(String scientificName)
    {
        this.model.setName(scientificName);
    }

    public void setStudentAge(String age)
    {
        this.model.setName(age);
    }

    public void updateView()
    {
        this.view.printPlantDetails(model.getName(), model.getScientificName(), model.getAge());
    }
}
