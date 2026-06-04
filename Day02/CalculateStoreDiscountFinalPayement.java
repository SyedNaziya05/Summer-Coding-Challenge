package Day02;

public class CalculateStoreDiscountFinalPayement {
    public static void main(String[] args) {
        double original_price=6000.0;
        double discount_percentage=20.0;
        double discount_amount=(original_price*discount_percentage)/100;
        double final_payment=original_price-discount_amount;
        System.out.println("Original price: $" + original_price);
        System.out.println("Discount percentage: " + discount_percentage + "%");
        System.out.println("Discount amount: $" + discount_amount);
        System.out.println("Final payment after discount: $" + final_payment);
    }
}
