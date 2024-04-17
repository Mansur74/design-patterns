package org.example.factory;

public class Client {
    public static void main(String[] args){
        CharacterFactory characterFactory = new CharacterFactory();
        Character warrior = characterFactory.getCharacter("WARRIOR");
        Character archer = characterFactory.getCharacter("ARCHER");
        warrior.attack();
        archer.attack();
    }
}
