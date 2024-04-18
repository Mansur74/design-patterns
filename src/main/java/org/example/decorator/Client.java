package org.example.decorator;

public class Client {
    public static void main(String[] args) {
        ICoffee coffee = new Coffee("Yemen Kahvesi", 100);
        MilkDecorator milkDecorator = new MilkDecorator(coffee);
        VanillaDecorator vanillaDecorator = new VanillaDecorator(coffee);
        System.out.println(milkDecorator);
        System.out.println(vanillaDecorator);
    }
}
