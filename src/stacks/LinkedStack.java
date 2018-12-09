package stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    /**
     * creating this class ensures behaviour of a stack; filtering out unnecessary operations
     * if built-in LinkedList class was used, unnecessary operations will be available
     * only exposing push, pop, peek operations
      */

    private LinkedList<Employee> stack;

    public LinkedStack () {
        stack = new LinkedList<Employee>();
    }

    public void push (Employee employee) {
        stack.push(employee);
    }

    public Employee pop () {
        return stack.pop();
    }

    public Employee peek () {
        return stack.peek();
    }

    public boolean isEmpty () {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iter = stack.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
