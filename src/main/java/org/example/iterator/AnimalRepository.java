package org.example.iterator;

public class AnimalRepository implements Container {
    public String[] animals = {"Dog", "Cat", "Bird"};

    @Override
    public Iterator getIterator() {
        return new AnimalIterator();
    }

    private class AnimalIterator implements Iterator
    {

        int index = 0;
        @Override
        public boolean hasNext() {
            return index < animals.length;
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return animals[index++];
            }
            return null;
        }
    }
}
