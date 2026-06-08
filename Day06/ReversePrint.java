package Day06;

public class ReversePrint {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,12};
        System.out.println("The elements in the array in reverse order are: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
