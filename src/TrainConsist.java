/**
 * Train Consist Management App
 *
 * Version 18.0
 * UC18: Linear Search for Bogie ID
 */

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchKey = "BG309"; // change to test

        System.out.println("\nSearching for Bogie ID: " + searchKey);

        boolean found = false;

        // -------- LINEAR SEARCH --------
        for (String id : bogieIds) {

            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie Found ✅");
        } else {
            System.out.println("Bogie Not Found ❌");
        }
    }
}