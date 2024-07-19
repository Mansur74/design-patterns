package org.example.mvc;

public class PlantController {
    private Plant model;
    private PlantView view;

    public PlantController(Plant model, PlantView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name)
    {
        this.model.setName(name);
    }

    public void setScientificName(String scientificName)
    {
        this.model.setName(scientificName);
    }

    public void setAge(String age)
    {
        this.model.setName(age);
    }

    public void updateView()
    {
        this.view.printPlantDetails(model.getName(), model.getScientificName(), model.getAge());
    }
}
