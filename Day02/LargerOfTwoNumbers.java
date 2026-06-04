package Day02;
import java.util.Scanner;
public class LargerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int larger_number=Math.max(num1, num2);
        System.out.println(larger_number + " is larger than " + Math.min(num1, num2));
    }
}
