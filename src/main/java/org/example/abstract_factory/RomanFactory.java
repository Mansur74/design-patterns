package org.example.abstract_factory;

public class RomanFactory implements AbstractFactory{
    @Override
    public Character getCharacter(String name) {
        if(name.equalsIgnoreCase("WARRIOR"))
            return new RomanWarrior();
        else if(name.equalsIgnoreCase("ARCHER"))
            return new RomanArcher();
        return null;
    }
}
