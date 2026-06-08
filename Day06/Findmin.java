package Day06;

public class Findmin {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,12};
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest element in the array is: "+smallest);
    }
    
}
