public class GroupItems {
    public static void main(String[] args) {
        // Test arrays
        int[] array1 = {1, 2, 3, 1, 4, 1};
        int[] array2 = {5, 3, 9, 8, 5, 7, 5};
        int[] array3 = {1, 2, 1, 2, 3};
        int[] array4 = {1, 2};

        // Test the retzafimArray function on each array
        System.out.print("Original array1: ");
        printArray(array1);
        retzafimArray(array1);
        System.out.print("Grouped array1: ");
        printArray(array1);

        System.out.print("Original array2: ");
        printArray(array2);
        retzafimArray(array2);
        System.out.print("Grouped array2: ");
        printArray(array2);

        System.out.print("Original array3: ");
        printArray(array3);
        retzafimArray(array3);
        System.out.print("Grouped array3: ");
        printArray(array3);

        System.out.print("Original array4: ");
        printArray(array4);
        retzafimArray(array4);
        System.out.print("Grouped array4: ");
        printArray(array4);
    }

    public static void retzafimArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
