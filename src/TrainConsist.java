/**
 * Train Consist Management App
 *
 * Version 11.0
 * UC11: Validate Train ID & Cargo Code using Regex
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (you can change these for testing)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // REGEX PATTERNS
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        // Validate
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output results
        System.out.println("\nTrain ID: " + trainId +
                " → " + (isTrainValid ? "VALID" : "INVALID"));

        System.out.println("Cargo Code: " + cargoCode +
                " → " + (isCargoValid ? "VALID" : "INVALID"));
    }
}