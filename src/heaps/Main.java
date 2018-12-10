package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void simpleHeap () {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

//        heap.delete(0);
//
//        System.out.println(heap.peek());

        heap.sort();
        heap.printHeap();
    }

    public static void priorityQueueHeap () {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

//        System.out.println("Peek: " + pq.peek());
//        System.out.println("Removing front: " + pq.remove());
//        System.out.println("Peek after removal: " + pq.peek());
//        System.out.println("Poll: " + pq.poll());
//        System.out.println("Peek after poll: " + pq.peek());
//        System.out.println("Removing 54: " + pq.remove(54));

        System.out.println("Printing object array...");
        Object[] ints = pq.toArray();
        for (Object num : ints) {
            System.out.println(num);
        }

        System.out.println("Peek after removing 54: " + pq.peek());
        pq.add(-1);
        pq.add(1);
        System.out.println("Peek after adding -1 and 1 (respectively): " + pq.peek());
    }

    public static void main (String[] args) {
        simpleHeap();
//        priorityQueueHeap();
    }

}
