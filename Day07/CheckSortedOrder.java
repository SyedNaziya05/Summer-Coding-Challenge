// package Day07;

// public class CheckSortedOrder {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         boolean isSorted = checkSorted(arr);
//         System.out.println("Is the array sorted? " + isSorted);
//     }

//     public static boolean checkSorted(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 return false; // Not sorted
//             }
//         }
//         return true; // Sorted
//     }
// }
package Day07;
public class CheckSortedOrder{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i+1]){
                System.out.println("The array is sorted in ascending order.");
                return;
            }
        }
        System.out.println("The array is not sorted in ascending order.");
    }
}
