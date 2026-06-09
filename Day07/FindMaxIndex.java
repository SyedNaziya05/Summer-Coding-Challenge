package Day07;
public class FindMaxIndex {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        int max=arr[0];
        int maxIndex=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
                maxIndex = i;
            }
            
        }
       
        System.out.println("The index of the maximum element is: " + maxIndex);
    }
}
