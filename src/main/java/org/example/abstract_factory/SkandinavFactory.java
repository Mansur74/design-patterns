package org.example.abstract_factory;

public class SkandinavFactory implements AbstractFactory {
    @Override
    public Character getCharacter(String name) {
        if(name.equalsIgnoreCase("WARRIOR"))
            return new SkandinavWarrior();
        else if(name.equalsIgnoreCase("ARCHER"))
            return new SkandinavArcher();
        return null;
    }
}
