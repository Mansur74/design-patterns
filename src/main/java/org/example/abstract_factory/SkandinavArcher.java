package org.example.abstract_factory;

public class SkandinavArcher implements Character{
    @Override
    public void attack() {
        System.out.println("Skandinav Archer attacking");
    }

    @Override
    public void defence() {
        System.out.println("Skandinav Archer defencing");
    }
}
