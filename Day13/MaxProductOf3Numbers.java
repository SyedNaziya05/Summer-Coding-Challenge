package Day13;

public class MaxProductOf3Numbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("The maximum product of three elements in the array is: " + maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        // Sort the array
        java.util.Arrays.sort(arr);

        int n = arr.length;
        // The maximum product can be either:
        // 1. Product of three largest numbers
        // 2. Product of two smallest (most negative) and the largest number
        int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int product2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(product1, product2);
    }
}
