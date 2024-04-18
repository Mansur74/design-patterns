package org.example.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getMessage());
    }
}
