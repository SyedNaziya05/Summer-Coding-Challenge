package Day13;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println("The majority element is: " + findMajorityElement(arr));
    }

    public static int findMajorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a candidate for majority element
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify if the candidate is actually the majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1; // No majority element found
    }
}
