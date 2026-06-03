package Task1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int marks4=sc.nextInt();
        int marks5=sc.nextInt();
        int max_marks=500;
        int total_marks=marks1+marks2+marks3+marks4+marks5;
        int percentage=((total_marks)*100)/max_marks;
        System.out.println("percentage of the student is: "+percentage);
        System.out.println("total marks obtained by the student is: "+total_marks);
    
    }
}
