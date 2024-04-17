package org.example.decorator;

public class VanillaDecorator extends CoffeeDecorator{
    public VanillaDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getCoffee().getDescription() + " + Vanilla";
    }

    @Override
    public double getCost() {
        return super.getCoffee().getCost() + 30;
    }

    @Override
    public String toString()
    {
        return this.getDescription() + ": " + this.getCost() + " TL";
    }
}
