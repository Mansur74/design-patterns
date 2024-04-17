package org.example.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getCoffee().getDescription() + " + Milk";
    }

    @Override
    public double getCost() {
        return super.getCoffee().getCost() + 50;
    }

    @Override
    public String toString()
    {
        return this.getDescription() + ": " + this.getCost() + " TL";
    }
}
