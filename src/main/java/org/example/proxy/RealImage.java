package org.example.proxy;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName)
    {
        this.fileName = fileName;
        this.loadFile();
    }
    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }

    public void loadFile()
    {
        System.out.println("Loading " + this.fileName);
    }
}
