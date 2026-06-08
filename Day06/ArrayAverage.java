package Day06;

public class ArrayAverage {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,12};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double average=(double)sum/arr.length;
        System.out.println("The average of the array is: " + average);
    }
}
