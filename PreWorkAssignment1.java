import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select an operation:");
            System.out.println("1. Check for palindrome number");
            System.out.println("2. Print star pattern");
            System.out.println("3. Check for prime number");
            System.out.println("4. Print Fibonacci series");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check for palindrome number
                    System.out.print("Enter a number to check for palindrome: ");
                    int num = scanner.nextInt();
                    if (checkPalindrome(num)) {
                        System.out.println(num + " is a palindrome number.");
                    } else {
                        System.out.println(num + " is not a palindrome number.");
                    }
                    break;

                case 2:
                    // Print star pattern
                    System.out.print("Enter the size for star pattern: ");
                    int size = scanner.nextInt();
                    printPattern(size);
                    break;

                case 3:
                    // Check for prime number
                    System.out.print("Enter a number to check for primality: ");
                    int numPrime = scanner.nextInt();
                    if (checkPrimeNumber(numPrime)) {
                        System.out.println(numPrime + " is a prime number.");
                    } else {
                        System.out.println(numPrime + " is not a prime number.");
                    }
                    break;

                case 4:
                    // Print Fibonacci series
                    System.out.print("Enter the size of the Fibonacci series: ");
                    int n = scanner.nextInt();
                    printFibonacciSeries(n);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }

    // Methods for the operations
    public static boolean checkPalindrome(int num) {
        String original = Integer.toString(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void printPattern(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean checkPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series of size " + n + ": " + first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}
