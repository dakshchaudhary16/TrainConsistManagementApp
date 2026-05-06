/**
 * Train Consist Management App
 *
 * Version 19.0
 * UC19: Binary Search for Bogie ID
 */

import java.util.Arrays;

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        // Search key
        String searchKey = "BG205"; // change to test

        // -------- SORT FIRST (IMPORTANT) --------
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("\nSearching for: " + searchKey);

        boolean found = binarySearch(bogieIds, searchKey);

        // Result
        if (found) {
            System.out.println("Bogie Found ✅");
        } else {
            System.out.println("Bogie Not Found ❌");
        }
    }

    // -------- BINARY SEARCH METHOD --------
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        return false; // not found
    }
}