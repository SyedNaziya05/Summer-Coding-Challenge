package Day13;

public class kthLargestElementINAnArray {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] arr, int k) {
        // Sort the array in descending order
        java.util.Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            k--;
            if (k == 0) {
                return arr[i];
            }
        }
        return -1; // k is larger than the array size
    }
}
