package Day07;

public class CountLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 5, 3, 7, 9, 9};
        int largest = Integer.MIN_VALUE;
        int count = 0;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                count = 1; // Reset count for new largest
            } else if (arr[i] == largest) {
                count++; // Increment count for the same largest
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Count of largest element: " + count);
    }
}
