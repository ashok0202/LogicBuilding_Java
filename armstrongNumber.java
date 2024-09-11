package problems;

import java.util.Scanner;

public class armstrongNumber {

    // Method to count the number of digits in a given number
    public static int countElements(int num) {
        int n = 0; // Initialize count to 0
        while (num != 0) {
            num /= 10; // Remove the last digit
            n++; // Increment the count
        }
        return n; // Return the number of digits
    }

    // Method to check if a given number is an Armstrong number
    public static boolean isArmstrong(int num, int cnt) {
        int original = num; // Store the original number
        int sum = 0; // Initialize sum of powers to 0
        
        // Calculate the sum of each digit raised to the power of the number of digits
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, cnt); // Add the digit raised to the power of cnt
            num /= 10; // Remove the last digit
        }

        // Return true if the original number is equal to the sum, otherwise false
        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt(); // Read the number from the user

        int cntValue = countElements(n); // Count the number of digits
        // Check if the number is an Armstrong number
        if (isArmstrong(n, cntValue)) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is not an Armstrong Number.");
        }
        sc.close(); // Close the scanner
    }
}
