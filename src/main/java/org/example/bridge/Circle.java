package org.example.bridge;

public class Circle implements Shape{
    private DrawAPI drawAPI;
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawAPI = drawAPI;
    }
    @Override
    public void draw() {
        this.drawAPI.drawCircle(this.x, this.y, this.radius);
    }
}
