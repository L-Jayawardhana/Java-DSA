package DoublyLinkedList;

public class DoublyLinkedList {

    // Node class
    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Insert at end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
        else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Deleted " + value);
    }

    // Print forward
    public void printForward() {
        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print backward
    public void printBackward() {
        Node temp = tail;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
