package week3.assignment4;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyStack implements Iterable<String> {

    private ArrayList<String> list = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return new StackIterator(this.list);
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }

    // your code
    public void push(String item) {
        list.add(item);
    }

    public void pop() {
        list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
