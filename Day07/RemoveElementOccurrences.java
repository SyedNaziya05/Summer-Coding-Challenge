package Day07;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class RemoveElementOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 5, 3, 7, 9, 9};
        int elementToRemove = 5;
        List<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            if (num != elementToRemove) {
                resultList.add(num);
            }
        }

        // Convert the result list back to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        System.out.println("Array after removing occurrences of " + elementToRemove + ": " + Arrays.toString(resultArray));
        
    }
}
