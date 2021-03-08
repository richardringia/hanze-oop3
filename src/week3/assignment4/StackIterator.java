package week3.assignment4;

import java.util.ArrayList;
import java.util.Iterator;

public class StackIterator implements Iterator {

    int index;
    ArrayList<String> list;

    public StackIterator(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < this.list.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return this.list.get(index++);
        }
        return null;
    }
}
