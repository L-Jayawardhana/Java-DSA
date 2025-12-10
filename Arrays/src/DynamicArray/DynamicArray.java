package DynamicArray;

public class DynamicArray {

    private int[] arr;
    private int size;       // number of elements inserted
    private int capacity;   // current array length

    public DynamicArray() {
        capacity = 4;       // starting capacity
        arr = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        arr[size] = value;
        size++;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;

        System.out.println("Array resized to capacity: " + capacity);
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        arr[size] = 0; // Clear the last element

        // Shrink array if size is 1/4 of capacity (to avoid thrashing)
        if (size > 0 && size == capacity / 4) {
            shrink();
        }

        System.out.println("Element deleted successfully.");
    }

    private void shrink() {
        capacity = capacity / 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;

        System.out.println("Array shrunk to capacity: " + capacity);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }

    public void print() {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
