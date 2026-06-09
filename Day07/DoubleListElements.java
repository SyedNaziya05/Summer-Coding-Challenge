package Day07;

public class DoubleListElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int DoubleArr[]=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            DoubleArr[i]=arr[i]*2;
        }
        for(int i=0; i<DoubleArr.length; i++){
            System.out.print(DoubleArr[i]+" ");
        }
    }
}
