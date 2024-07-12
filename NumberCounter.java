import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;

        // Read the first integer
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int num = scanner.nextInt();

        // Continue reading integers until 0 is entered
        while (num != 0) {
            // Count positive and negative numbers
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }

            // Add the number to the total
            total += num;

            // Increment the count
            count++;

            // Read the next integer
            num = scanner.nextInt();
        }

        // Calculate the average
        double average;
        if (count == 0) {
            average = 0;
        } else {
            average = (double) total / count;
        }

        // Display the results
        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        
        scanner.close();
    }
}
