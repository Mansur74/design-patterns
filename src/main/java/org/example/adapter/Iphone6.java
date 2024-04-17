package org.example.adapter;

public class Iphone6 implements Iphone{
    private int memory;
    public Iphone6(int memory)
    {
        this.memory = memory;
    }

    @Override
    public void onCharge() {
        System.out.printf("Iphone6 (%dMB) is charging", this.memory);
    }

    @Override
    public int getMemory() {
        return this.memory;
    }
}
