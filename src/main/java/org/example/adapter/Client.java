package org.example.adapter;

public class Client {
    public static void main(String[] args) {
        Iphone iphone = new Iphone6(64);
        Iphone6ToIphone4Adapter adapter = new Iphone6ToIphone4Adapter(iphone);
        adapter.charge();
    }
}
