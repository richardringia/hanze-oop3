package week3.assignment4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("kwik");
        stack.push("kwek");
        stack.push("kwak");

        // your code
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println(item);
        }


        stack.push("kwik2");
        stack.push("kwek2");
        stack.push("kwak2");

        for (String item: stack) {
            System.out.println(item);
        }
    }
}
