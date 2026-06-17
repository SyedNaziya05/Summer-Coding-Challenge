package Day13;

public class MaxProductOf2ElementsInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        System.out.println("The maximum product of two elements in the array is: " + maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }
}
