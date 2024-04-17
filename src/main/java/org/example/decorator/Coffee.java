package org.example.decorator;

public class Coffee implements ICoffee{
    private final String description;
    private final double cost;

    public Coffee(String description, double cost)
    {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
