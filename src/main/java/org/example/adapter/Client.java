package org.example.adapter;

public class Client {
    public static void main(String[] args) {
        Phone oppo = new Oppo();
        ChargeAdapter adapter = new ChargeAdapter(oppo);
        adapter.charge("TYPE-B");

        Phone xpearia = new Xperia();
        adapter = new ChargeAdapter(xpearia);
        adapter.charge("TYPE-C");
    }
}
