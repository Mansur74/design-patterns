package org.example.decorator;

public abstract class CoffeeDecorator implements ICoffee {
    private ICoffee coffee;
    public CoffeeDecorator(ICoffee coffee)
    {
        this.coffee = coffee;
    }

    public ICoffee getCoffee() {
        return this.coffee;
    }
}
