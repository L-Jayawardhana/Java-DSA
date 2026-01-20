package CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Circular Linked List:");
        list.print();

        System.out.println("\nInsert 5 at beginning:");
        list.insertAtBeginning(5);
        list.print();

        System.out.println("\nSearch 20:");
        System.out.println(list.search(20) ? "Found" : "Not Found");

        System.out.println("\nDelete 30:");
        list.delete(30);
        list.print();

        System.out.println("\nDelete 5:");
        list.delete(5);
        list.print();
    }
}
