package SimpleArray;

public class ArrayOperations {

    private int[] array;
    public int n; // keep public for printing

    public ArrayOperations(int length) {
        array = new int[length];
        n = 0;
    }

    public void insert(int element, int position) {
        if (n >= array.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }

        if (position < 0 || position > n) {
            System.out.println("Invalid position.");
            return;
        }

        // shift elements right
        for (int i = n; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;
        n++;
    }

    public void delete(int position) {
        if (position < 0 || position >= n) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = position; i < n - 1; i++) {
            array[i] = array[i + 1];
        }

        n--;
        System.out.println("Deleted successfully.");
    }

    public int search(int value) {
        for (int i = 0; i < n; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public void print() {
        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
