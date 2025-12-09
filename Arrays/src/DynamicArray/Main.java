package DynamicArray;

public class Main {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        da.add(10);
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50); // triggers resize

        System.out.println("Size: " + da.getSize());
        System.out.println("Capacity: " + da.getCapacity());

        da.print();
    }
}
