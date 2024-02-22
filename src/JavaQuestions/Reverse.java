public class Reverse {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        // Reverse the array in-place
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            // Move to the next pair of elements
            start++;
            end--;
        }

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
