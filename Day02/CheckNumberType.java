package Day02;

import java.util.Scanner;

public class CheckNumberType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n=10;
        if(n>0){
            System.out.println("positive");
        }
        else if(n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
