package org.example.abstract_factory;

public class SkandinavWarrior implements Character{
    @Override
    public void attack() {
        System.out.println("Skandinav Warrior attacking");
    }

    @Override
    public void defence() {
        System.out.println("Skandinav Warrior defencing");
    }
}
