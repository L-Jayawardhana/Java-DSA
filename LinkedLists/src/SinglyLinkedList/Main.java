package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Linked List: ");
        list.print();

        list.delete(20);
        System.out.print("After deletion: ");
        list.print();

        int searchValue = 30;
        if (list.search(searchValue)) {
            System.out.println(searchValue + " found in list");
        } else {
            System.out.println(searchValue + " not found in list");
        }
    }
}
