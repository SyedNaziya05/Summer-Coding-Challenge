package Day03;
import java.util.Scanner;
public class AdmissionEligibility {
    public static void main(String[] args) {
        // Main method implementation
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        boolean hasSportsQuota=sc.nextBoolean();
        if(marks>=70||hasSportsQuota){
            System.out.println("Eligible for admission");
        }
        else{
            System.out.println("Not eligible for admission");

        }
    }

}
