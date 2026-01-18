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
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes all elements from the list.
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Insert at end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    // Delete by value
    public boolean delete(int value) {
        if (head == null) {
            return false;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            return false;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        // If list becomes empty, keep tail/head consistent
        if (head == null) {
            tail = null;
        }

        size--;
        return true;
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
