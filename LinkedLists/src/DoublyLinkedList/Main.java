package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.printForward();
        list.printBackward();

        list.delete(20);
        list.printForward();

        list.delete(40);
        list.printBackward();
    }
}
