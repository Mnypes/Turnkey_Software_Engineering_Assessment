import java.util.List;

public class LargestDifference {

    /**
     * Returns the largest difference between any two numbers in the input list of integers.
     * If the list has less than two elements, returns 0.
     *
     * @param numbers the input list of integers
     * @return the largest difference between any two numbers in the input list
     */
    public static int calculateLargestDifference(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return 0; // Return 0 if the list has less than two elements
        }

        int minNumber = numbers.get(0);
        int maxDifference = 0;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            // Update the minimum number found so far
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            } else {
                // Calculate the difference between the current number and the minimum number
                int difference = currentNumber - minNumber;

                // Update the maximum difference found so far
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        // Test cases
        List<Integer> numbers1 = List.of(1, 9, 3, 7);
        List<Integer> numbers2 = List.of(5, 2, 10, 1, 8);

        // Calculate and display the largest difference for each test case
        int difference1 = calculateLargestDifference(numbers1);
        System.out.println("Largest difference in numbers1: " + difference1);

        int difference2 = calculateLargestDifference(numbers2);
        System.out.println("Largest difference in numbers2: " + difference2);
    }
}

