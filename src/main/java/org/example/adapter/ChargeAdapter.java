package org.example.adapter;

public class ChargeAdapter implements Charger {
    Phone iphone;

    public ChargeAdapter(Phone iphone)
    {
        this.iphone = iphone;
    }
    @Override
    public void charge(String type) {
        if(type.equalsIgnoreCase("TYPE-B"))
            this.iphone.onChargeWithTypeB();

        else if(type.equalsIgnoreCase("TYPE-C"))
            this.iphone.onChargeWithTypeC();
    }
}
