package Day05;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int count=0;
    while(N>0){
        N=N/10;
        count++;  
    }
    System.out.println("Number of digits in the given number is: "+count);

    }
}
