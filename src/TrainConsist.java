/**
 * Train Consist Management App
 *
 * Version 5.0
 * UC5: Preserve Insertion Order using LinkedHashSet
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);
    }
}