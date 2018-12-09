package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void scratchLinkedList () {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

//        System.out.println("Is empty before adding nodes: " + list.isEmpty());

        list.addToEnd(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

//        System.out.println("Is empty after adding nodes: " + list.isEmpty());

        System.out.println("Size of linked list: " + list.getSize());

        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);

        System.out.println("Size of linked list: " + list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println("Size of linked list (after removing node): " + list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println("Size of linked list (after removing node): " + list.getSize());
        list.printList();
    }

    public static void jdkLinkedList () {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        // this iteration doesn't really highlight the structure and operations of a linked list
//        for (Employee employee : list) {
//            System.out.println(employee);
//        }

        list.removeLast();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addLast(billEnd);
        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        System.out.println("Contains Mary: " + list.contains(new Employee("Mary", "Smith", 22)));

    }

    public static void main (String[] args) {

//        scratchLinkedList();
        jdkLinkedList();

    }

}
