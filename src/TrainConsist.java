/**
 * Train Consist Management App
 *
 * Version 16.0
 * UC16: Sort Passenger Bogies using Bubble Sort
 */

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nBefore Sorting:");
        printArray(capacities);

        // -------- BUBBLE SORT --------
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            // Optimization: track if swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap → already sorted
            if (!swapped) break;
        }

        System.out.println("\nAfter Sorting (Ascending):");
        printArray(capacities);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}