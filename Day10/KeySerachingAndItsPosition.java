package Day10;

public class KeySerachingAndItsPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;
        int position = searchKey(arr, key);
        
        if (position != -1) {
            System.out.println("Key " + key + " found at position: " + position);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }

    public static int searchKey(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
