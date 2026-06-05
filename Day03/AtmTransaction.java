package Day03;
import java.util.Scanner;
public class AtmTransaction {
    public static void main(String[] args) {
        // Main method implementation
        Scanner sc = new Scanner(System.in);
        int balance = 1000; // Initial balance  
        System.out.println("Enter the amount to withdraw:");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
        // sc.close();
    }
}
