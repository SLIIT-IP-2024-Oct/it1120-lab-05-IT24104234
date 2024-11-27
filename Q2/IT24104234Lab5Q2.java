import java.util.Scanner;

public class IT24104234Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int newMembers = input.nextInt();

        if (newMembers < 0) {
            System.out.println("Invalid input! Number of new members cannot be negative.");
        } else if (newMembers == 0) {
            System.out.println("No Prize");
        } else if (newMembers == 1) {
            System.out.println("Prize: Pen");
        } else if (newMembers == 2) {
            System.out.println("Prize: Umbrella");
        } else if (newMembers == 3) {
            System.out.println("Prize: Bag");
        } else if (newMembers == 4) {
            System.out.println("Prize: Travelling Chair");
        } else {
            System.out.println("Prize: Headphone");
        }

        input.close();
    }
}
