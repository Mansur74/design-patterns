package org.example.bridge;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(25, 75, 5, new RedCircle());
        Shape square = new Square(35, 65, 9, new RedSquare());
        circle.draw();
        square.draw();
    }
}
