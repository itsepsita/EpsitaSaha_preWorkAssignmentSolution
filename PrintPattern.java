public class PrintPattern {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        
        int input = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the printStarPattern method with the input integer
        printStarPattern(input);
    }

    // Method to print the star pattern based on the input integer
    public static void printStarPattern(int input) {
        // Iterate through each level
        for (int i = 1; i <= input; i++) {
            // Print stars for each level
            for (int j = 1; j <= input - i + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after each level
            System.out.println();
        }
    }
}
