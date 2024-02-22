public class ANumberInAnArray {

    public static void main(String[] args) {
        int a[] = {11, 2, 3, 4, 0, 6, 7, 8, 9, 0};
        int number = 5;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (number == a[i]) {
                found = true;
                System.out.println("Number has matched at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array");
        }
    }
}
