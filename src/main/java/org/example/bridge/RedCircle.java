package org.example.bridge;

import java.util.NoSuchElementException;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("Drawing Red Circle => x: %d, y: %d, radius: %d \n", x, y, radius);
    }

    @Override
    public void drawSquare(int x, int y, int size) {

    }
}
