package org.example.bridge;

public class Square implements Shape{
    private DrawAPI drawAPI;
    private int x, y, size;
    public Square(int x, int y, int size, DrawAPI drawAPI)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.drawAPI = drawAPI;
    }
    @Override
    public void draw() {
        this.drawAPI.drawSquare(this.x, this.y, this.size);
    }
}
