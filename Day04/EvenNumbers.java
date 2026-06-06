package Day04;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter n");
        int N = sc.nextInt();
        // System.out.println("Even numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
