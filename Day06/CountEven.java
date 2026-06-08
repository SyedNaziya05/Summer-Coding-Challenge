package Day06;

public class CountEven {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,12};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("The number of even elements in the array is: "+count);
    }
}
