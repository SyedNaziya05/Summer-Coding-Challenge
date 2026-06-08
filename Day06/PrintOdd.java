package Day06;

public class PrintOdd {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,12};
        System.out.println("The odd elements in the array are: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
