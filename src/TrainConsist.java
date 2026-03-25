/**
 * Train Consist Management App
 *
 * Version 1.0
 * UC1: Initialize Train and Display Consist Summary
 *
 * This program initializes an empty train consist
 * and displays its initial state.
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsist {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}