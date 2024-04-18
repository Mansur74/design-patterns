package org.example.adapter;

public class Xperia implements Phone{

    @Override
    public void onChargeWithTypeB() {

    }

    @Override
    public void onChargeWithTypeC() {
        System.out.println("Xperia charging with Type-C");
    }
}
