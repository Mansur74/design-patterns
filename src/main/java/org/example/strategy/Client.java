package org.example.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("5 + 3 = " + context.executeOperation(5,3));

        context = new Context(new OperationSubstract());
        System.out.println("5 - 3 = " + context.executeOperation(5,3));

    }
}
