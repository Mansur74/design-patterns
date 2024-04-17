package org.example.adapter;

public class Iphone6ToIphone4Adapter implements Iphone4Charger {
    Iphone iphone;

    public Iphone6ToIphone4Adapter(Iphone iphone)
    {
        this.iphone = iphone;
    }
    @Override
    public void charge() {
        this.iphone.onCharge();
    }
}
