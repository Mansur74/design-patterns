package org.example.iterator;

public class Client {
    public static void main(String[] args) {
        AnimalRepository animalRepository = new AnimalRepository();
        Iterator iterator = animalRepository.getIterator();
        while(iterator.hasNext())
        {
            String animal = (String) iterator.next();
            System.out.println("Name: " + animal);
        }
    }
}
