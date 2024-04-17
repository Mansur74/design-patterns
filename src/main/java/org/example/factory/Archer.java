package org.example.factory;

public class Archer implements Character{
    @Override
    public void attack() {
        System.out.println("Archer is attacking with bow");
    }
}
