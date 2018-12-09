package linkedlists;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;   // by default initialised to 0

    public void addToFront (Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (isEmpty()) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd (Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (isEmpty()) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront () {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);   // since removing from front
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);  // cleans up references (optional)
        return removedNode;
    }

    public EmployeeNode removeFromEnd () {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            if (current.getNext() != null) {
                System.out.print(" <=> ");
            }
            else {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println("null");
    }


}
