package org.example.factory;

public class CharacterFactory {
    public Character getCharacter(String name)
    {
        if(name == null)
            return null;
        else if(name.equalsIgnoreCase("WARRIOR"))
            return new Warrior();
        else if(name.equalsIgnoreCase("ARCHER"))
            return new Archer();
        return null;
    }
}
