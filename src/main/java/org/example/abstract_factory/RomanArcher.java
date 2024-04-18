package org.example.abstract_factory;

public class RomanArcher implements Character{
    @Override
    public void attack() {
        System.out.println("Roman Archer attacking");
    }

    @Override
    public void defence() {
        System.out.println("Roman Archer defencing");
    }
}
