package Day02;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
            int num1=10;
            int num2=20;
            int num3=15;
            int largest_number=Math.max(num1, Math.max(num2, num3));
            System.out.println(largest_number + " is the largest number among " + num1 + ", " + num2 + ", and " + num3);
    }
}
