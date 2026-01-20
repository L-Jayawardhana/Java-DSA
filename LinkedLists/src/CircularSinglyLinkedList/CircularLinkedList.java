package CircularSinglyLinkedList;

public class CircularLinkedList {

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node tail; // tail is enough for circular list

    // Insert at end
    public void insert(int value) {
        Node newNode = new Node(value);

        // If list is empty
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // points to itself
            return;
        }

        // Insert after tail (end)
        newNode.next = tail.next; // new node points to head
        tail.next = newNode;      // old tail points to new node
        tail = newNode;           // update tail
    }

    // Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }

        newNode.next = tail.next; // new node points to head
        tail.next = newNode;      // tail points to new head
    }

    // Delete by value
    public void delete(int value) {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next; // head
        Node prev = tail;

        do {
            if (current.data == value) {

                // Case 1: only one node
                if (current == tail && current.next == tail) {
                    tail = null;
                    System.out.println("Deleted " + value);
                    return;
                }

                // Case 2: deleting tail
                if (current == tail) {
                    prev.next = current.next;
                    tail = prev;
                    System.out.println("Deleted " + value);
                    return;
                }

                // Case 3: deleting head or middle node
                prev.next = current.next;
                System.out.println("Deleted " + value);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != tail.next);

        System.out.println("Value not found");
    }

    // Search value
    public boolean search(int value) {
        if (tail == null) {
            return false;
        }

        Node temp = tail.next; // head

        do {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        } while (temp != tail.next);

        return false;
    }

    // Print list
    public void print() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next; // head

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(back to head)");
    }
}
