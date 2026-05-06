/**
 * Train Consist Management App
 *
 * Version 17.0
 * UC17: Sort Bogie Names using Arrays.sort()
 */

import java.util.Arrays;

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // -------- BUILT-IN SORT --------
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}