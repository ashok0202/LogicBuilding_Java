package problems;

import java.util.HashSet;
import java.util.Scanner;

public class commonCharacters {
    
    // Method to find and print common characters between two strings
    public static void commonCharacterInString(String s1, String s2) {
        // Create a HashSet to store unique characters from the first string
        HashSet<Character> hs = new HashSet<>();
        
        // Add all characters from the first string to the HashSet
        for (char ch : s1.toCharArray()) {
            hs.add(ch);
        }
        
        // Iterate through the characters of the second string
        for (char ch : s2.toCharArray()) {
            // Check if the character from the second string is present in the HashSet
            if (hs.contains(ch)) {
                // Remove the character from the HashSet (to avoid duplicate printing)
                hs.remove(ch);
                // Print the common character
                System.out.println(ch + " is repeated ");
            }
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine(); // Read the first string
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine(); // Read the second string

        // Call the method to find common characters between the two strings
        commonCharacterInString(s1, s2);
    }
}
