/**
 * Train Consist Management App
 *
 * Version 2.0
 * UC2: Add Passenger Bogies (ArrayList Operations)
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nBogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // FINAL STATE
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}