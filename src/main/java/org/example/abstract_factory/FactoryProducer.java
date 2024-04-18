package org.example.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String name)
    {
        if(name.equalsIgnoreCase("SKANDINAV"))
            return new SkandinavFactory();
        else if(name.equalsIgnoreCase("ROMAN"))
            return new RomanFactory();
        return null;
    }
}
