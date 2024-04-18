package org.example.abstract_factory;

public class Client {
    public static void main(String[] args)
    {
        AbstractFactory skandinavFactory = FactoryProducer.getFactory("SKANDINAV");
        Character skandinavWarrior = skandinavFactory.getCharacter("WARRIOR");
        Character skandinavArcher = skandinavFactory.getCharacter("ARCHER");

        AbstractFactory romanFactory = FactoryProducer.getFactory("ROMAN");
        Character romanWarrior = romanFactory.getCharacter("WARRIOR");
        Character romanArcher = romanFactory.getCharacter("ARCHER");


        skandinavWarrior.attack();
        skandinavArcher.attack();

        System.out.println();

        romanWarrior.defence();
        romanArcher.defence();

    }
}
