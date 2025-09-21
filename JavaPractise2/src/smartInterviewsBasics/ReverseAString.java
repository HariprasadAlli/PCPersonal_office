package smartInterviewsBasics;

public class ReverseAString {
    public static void main(String[] args) {
        String Reverse = "ABCDEF"; // Original string
        String ReverseString = ""; // To store the reversed string

        for (int i = Reverse.length() - 1; i >= 0; i--) { // Loop from last character to first
            ReverseString += Reverse.charAt(i); // Append each character in reverse order
        }

        System.out.println("Reversed String: " + ReverseString); // Output the reversed string
    }
}
