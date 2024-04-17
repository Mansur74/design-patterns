package org.example.strategy;

public class Context {
    Strategy strategy;
    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeOperation(int x, int y)
    {
        return this.strategy.doOperation(x, y);
    }
}
