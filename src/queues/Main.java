package queues;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void circularQueue () {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);

//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);

        System.out.println("Original queue");
        queue.printQueue();

//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//
//        System.out.println("After remove:");
//        queue.printQueue();
//
//        queue.add(mikeWilson);
//
//        System.out.println("Peek: " + queue.peek());

    }

    public static void priorQue () {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        int[] arr = { 25, 20, 15, 27, 30, 29, 26, 22, 32, 17 };
//        for (int i=0; i<arr.length; i++) {
//            pq.add(arr[i]);
//        }
//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq);
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        Comparator<Employee> comparator = new EmployeeCompare();
        PriorityQueue<Employee> pq = new PriorityQueue<>(comparator);
        pq.add(janeJones);
        pq.add(johnDoe);
        pq.add(marySmith);
        pq.add(mikeWilson);
        pq.add(billEnd);
        System.out.println(pq);
    }

    public static void main (String[] args) {

//        circularQueue();
        priorQue();

    }

}
