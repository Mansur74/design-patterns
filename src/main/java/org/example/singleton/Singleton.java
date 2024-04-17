package org.example.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public String getMessage()
    {
        return "Hello, I am a singleton class";
    }
}
