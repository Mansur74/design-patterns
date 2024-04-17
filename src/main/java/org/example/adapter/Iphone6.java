package org.example.adapter;

public class Iphone6 implements Iphone{

    @Override
    public void OnCharge(String name) {
        System.out.println(name + " is charging");
    }
    @Override
    public String getName() {
        return "Iphone6";
    }
}
