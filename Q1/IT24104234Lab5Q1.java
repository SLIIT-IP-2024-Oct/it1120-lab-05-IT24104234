import java.util.Scanner;

public class IT24104234Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int smallest, largest;

        //smallest number
        if (num1 < num2) {
            if (num1 < num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else {
            if (num2 < num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }

        //largest number
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }


        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        input.close();
    }
}
