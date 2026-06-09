package Day07;

public class EvenOddSumDifference {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int evenSum=0;
        int oddSum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
            else{
                oddSum+=arr[i];
            }
        }
        int difference = evenSum - oddSum;
        System.out.println("Difference between even and odd sums: " + difference);
    }
}
