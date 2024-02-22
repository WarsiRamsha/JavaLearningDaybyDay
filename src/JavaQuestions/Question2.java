public class Question2 {

    public static void main(String[] args) {
        // Print 5 multiplication table without using multiply operator
        int result = multiply(5, 10);
        System.out.println(result); // Print the result
    }

    private static int multiply(int i, int j) {
        int sum = 0;
        for (int k = 1; k <= j; k++) {
            sum = sum + i;
        }
        return sum;
    }
}
