public class ArrayOperations {

    // Insert value at a given position
    public static int insert(int[] arr, int n, int pos, int value) {
        if (n >= arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return n;
        }

        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        return n + 1; // new size
    }

    // Delete element from a given position
    public static int delete(int[] arr, int n, int pos) {
        if (pos >= n) {
            System.out.println("Invalid position.");
            return n;
        }

        // Shift elements left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1; // new size
    }

    // Search for a value
    public static int search(int[] arr, int n, int value) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 5;

        // initial array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Initial array:");
        print(arr, n);

        // Insert
        n = insert(arr, n, 2, 99);
        System.out.println("After inserting 99 at position 2:");
        print(arr, n);

        // Delete
        n = delete(arr, n, 3);
        System.out.println("After deleting element at position 3:");
        print(arr, n);

        // Search
        int index = search(arr, n, 40);
        System.out.println("Searching for 40: " + (index != -1 ? "Found at index " + index : "Not found"));
    }

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
