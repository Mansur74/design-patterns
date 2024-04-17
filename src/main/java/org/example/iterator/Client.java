package org.example.iterator;

public class Client {
    public static void main(String[] args) {
        AnimalRepository animalRepository = new AnimalRepository();
        for(Iterator iterator = animalRepository.getIterator(); iterator.hasNext();)
        {
            String animal = (String) iterator.next();
            System.out.println("Name: " + animal);
        }
    }
}
