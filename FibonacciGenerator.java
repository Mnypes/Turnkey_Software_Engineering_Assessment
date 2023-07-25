import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user and validate it
        int n = getUserInput(scanner);

        // Generate and print the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + n + ":");
        generateFibonacci(n);
    }

    // Function to get the user input and validate it
    private static int getUserInput(Scanner scanner) {
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a positive integer: ");
                n = Integer.parseInt(scanner.nextLine());

                if (n < 1) {
                    throw new IllegalArgumentException();
                }

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a positive integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Input must be a positive integer.");
            }
        }

        return n;
    }

    // Function to generate the Fibonacci sequence up to the given number
    private static void generateFibonacci(int n) {
        int previousNumber = 0;
        int currentNumber = 1;

        System.out.print(previousNumber + " ");

        while (currentNumber <= n) {
            System.out.print(currentNumber + " ");

            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        System.out.println();
    }
}

