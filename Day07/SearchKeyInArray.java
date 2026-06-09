package Day07;

public class SearchKeyInArray {
    public static void main(String[] args) {
        int [] arr = {3, 5, 2, 9, 1};
        int key = 8;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key found ");
                return;
            }
        }
        System.out.println("Key not found in the array.");
    }
}
