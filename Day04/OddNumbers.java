package Day04;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Odd numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
