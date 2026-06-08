package Day06;
import java.util.Arrays;
public class SquareArray {
    public static void main(String[] args) {
        int arr[]={1,3,6,7};
        int squaredArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            squaredArr[i]=arr[i]*arr[i];
        }
        System.out.println("The square of the elements in the array are: " + Arrays.toString(squaredArr));
    }
}
