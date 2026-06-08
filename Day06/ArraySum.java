package Day06;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,12};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of the array is: "+sum);
    }
}
