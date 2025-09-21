package basicPrograms;

public class FibonacciSeries {
    public static void main(String args[]) {
        fibseries();
    }

    public static void fibseries() {
        int num = 7; // Number of terms in the series
        int firstNumber = 0;
        int secondNumber = 1;

        // Print the first two numbers of the Fibonacci series
        System.out.print(firstNumber + " " + secondNumber);

        // Loop to calculate the rest of the Fibonacci series
        for (int i = 3; i <= num; i++) { // Start from 3 since first two are already printed
            int fib = firstNumber + secondNumber;
            System.out.print(" " + fib);
            firstNumber = secondNumber;
            secondNumber = fib;
        }
    }
}
