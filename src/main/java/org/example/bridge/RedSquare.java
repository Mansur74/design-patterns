package org.example.bridge;

import java.util.NoSuchElementException;

public class RedSquare implements DrawAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {

    }

    @Override
    public void drawSquare(int x, int y, int size) {
        System.out.printf("Drawing Red Square => x: %d, y: %d, size: %d \n", x, y, size);
    }
}
