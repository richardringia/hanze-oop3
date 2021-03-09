package week3.assignment4;

import java.util.Iterator;
import java.util.ArrayList;

public class MyStack implements Iterable<String> {

    public ArrayList<String> list = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return new StackIterator(this);
    }

    // your code
    public void push(String item) {
        list.add(item);
    }

    public String pop() {
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
