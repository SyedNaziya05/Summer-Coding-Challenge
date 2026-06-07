package Day05;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int reverse=0;
        while(N>0){
            int lastDigit=N%10;
            reverse=reverse*10+lastDigit;
            N=N/10;
        }
        System.out.println("Reverse of the given number is: "+reverse);
    }
}
