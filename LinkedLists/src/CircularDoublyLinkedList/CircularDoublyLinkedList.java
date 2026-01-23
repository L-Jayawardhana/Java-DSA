package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // Insert at end
    public void insert(int value) {
        Node newNode = new Node(value);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        // Link new node
        newNode.prev = tail;
        newNode.next = head;

        tail.next = newNode;
        head.prev = newNode;

        tail = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do {
            if (current.data == value) {

                // Case 1: only one node
                if (current == head && current == tail) {
                    head = tail = null;
                    System.out.println("Deleted " + value);
                    return;
                }

                // Case 2: deleting head
                if (current == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    System.out.println("Deleted " + value);
                    return;
                }

                // Case 3: deleting tail
                if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    System.out.println("Deleted " + value);
                    return;
                }

                // Case 4: deleting middle node
                current.prev.next = current.next;
                current.next.prev = current.prev;

                System.out.println("Deleted " + value);
                return;
            }

            current = current.next;

        } while (current != head);

        System.out.println("Value not found");
    }

    // Search
    public boolean search(int value) {
        if (head == null) return false;

        Node temp = head;

        do {
            if (temp.data == value) return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }

    // Print forward
    public void printForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Forward: ");

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Print backward
    public void printBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;
        System.out.print("Backward: ");

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println("(back to tail)");
    }
}
