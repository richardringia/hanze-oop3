package week3.assignment4;

import java.util.Iterator;

public class StackIterator implements Iterator<String> {

    MyStack myStack;

    public StackIterator(MyStack myStack) {
        this.myStack = myStack;
    }

    @Override
    public boolean hasNext() {
        return !myStack.isEmpty();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return this.myStack.pop();
        }
        return null;
    }
}
