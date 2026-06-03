package Task1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swapped numbers are: " + a + " " + b);
    }
    
}
