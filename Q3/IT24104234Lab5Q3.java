import java.util.Scanner;

public class IT24104234Lab5Q3 {

    // Constants
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the start date (day): ");
        int startDate = input.nextInt();
        System.out.print("Enter the end date (day): ");
        int endDate = input.nextInt();

        //Validate start and end dates
        if (startDate < 1 || endDate < 1 || startDate > 31 || endDate > 31) {
            System.out.println("Error: Start and end dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
        } else {

            //Calculate the number of days reserved
            int numberOfDays = endDate - startDate;

            //Determine the discount rate
            double discountRate = 0; // Default discount is 0
            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discountRate = DISCOUNT_3_TO_4_DAYS; // 10% discount
            } else if (numberOfDays >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS; // 20% discount
            }

            //Calculate total amount, discount, and final amount
            double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
            double discountAmount = totalAmount * discountRate / 100;
            double amountToPay = totalAmount - discountAmount;


            System.out.println("Number of days reserved: " + numberOfDays);
            System.out.printf("Total amount: Rs %.2f%n", totalAmount);
            System.out.printf("Discount: Rs %.2f%n", discountAmount);
            System.out.printf("Amount to pay: Rs %.2f%n", amountToPay);
        }


        input.close();
    }
}
