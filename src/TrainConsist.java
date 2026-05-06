/**
 * Train Consist Management App
 *
 * Version 10.0
 * UC10: Count Total Seats using Stream reduce()
 */

import java.util.ArrayList;
import java.util.List;

// --------------------- BOGIE CLASS ---------------------

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// --------------------- MAIN ---------------------

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display bogies
        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // STREAM + MAP + REDUCE
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // aggregate sum

        // Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}