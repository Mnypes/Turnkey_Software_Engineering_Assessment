public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        double total = 0; // change data type to double
        for (int num : numbers) {
            total += num;
        }
        double average = total / numbers.length;
        return average;
    }
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
