package CircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.printForward();
        list.printBackward();

        System.out.println("\nInsert 5 at beginning:");
        list.insertAtBeginning(5);
        list.printForward();

        System.out.println("\nDelete 20:");
        list.delete(20);
        list.printForward();

        System.out.println("\nSearch 30:");
        System.out.println(list.search(30) ? "Found" : "Not Found");
    }
}
