package collectionsBasics;

import java.util.Iterator;

/**
 * IteratorDemo
 */
// here in this generics class we cannot iterate ove the list by default , hence to have
// the functionality of using enhanced for loop, we need to implement the Iterable int which return iterator 
// for each loop behind the scenes makes use of hasNext and next method of the Iterator,
public class IteratorDemo<T> implements Iterable {
    T[] list;
    int size;

    public IteratorDemo(){
        size = 0;
        list = (T[]) new Object();
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }
    
}

class MyIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


}