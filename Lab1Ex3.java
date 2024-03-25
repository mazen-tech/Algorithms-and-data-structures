import java.util.Arrays;
import java.util.Scanner;


class TemperatureTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] temperatures = new int[5]; // Initial array size
        int count = 0; // Number of readings
        double sum = 0.0; // Sum of all readings

        System.out.println("Enter temperature readings (Enter a non-integer to finish):");

        while (scanner.hasNextInt()) {
            // Expand the array if it's full
            if (count >= temperatures.length) {
                temperatures = Arrays.copyOf(temperatures, temperatures.length * 2);
            }

            int temperature = scanner.nextInt();
            temperatures[count] = temperature;
            sum += temperature;
            count++;

            // Display all saved readings
            System.out.print("Readings: ");
            for (int i = 0; i < count; i++) {
                System.out.print(temperatures[i] + " ");
            }
            System.out.println();

            // Calculate and display average
            double average = sum / count;
            System.out.println("Average: " + average);
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}