/**
 * Train Consist Management App
 *
 * Version 20.0
 * UC20: Exception Handling During Search Operations (Fail-Fast)
 */

import java.util.Arrays;

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Case 1: Empty dataset (to test exception)
        String[] bogieIds = {};

        // Case 2: Uncomment to test valid scenario
        // String[] bogieIds = {"BG101", "BG205", "BG309"};

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie Found ✅");
            } else {
                System.out.println("Bogie Not Found ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // -------- SEARCH METHOD WITH VALIDATION --------
    public static boolean searchBogie(String[] arr, String key) {

        // FAIL-FAST CHECK
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train");
        }

        // Optional: sort before binary search
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}