package org.example.mvc;

public class Plant {
    private String name;
    private String scientificName;
    private int age;

    public Plant(String name, String scientificName, int age) {
        this.name = name;
        this.scientificName = scientificName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
