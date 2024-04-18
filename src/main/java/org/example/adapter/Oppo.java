package org.example.adapter;

public class Oppo implements Phone {

    @Override
    public void onChargeWithTypeB() {
        System.out.println("Oppo charging with Type-B");
    }

    @Override
    public void onChargeWithTypeC() {

    }
}
