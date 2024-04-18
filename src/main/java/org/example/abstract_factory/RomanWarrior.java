package org.example.abstract_factory;

public class RomanWarrior implements Character{
    @Override
    public void attack() {
        System.out.println("Roman Warrior attacking");
    }

    @Override
    public void defence() {
        System.out.println("Roman Warrior defencing");
    }
}
