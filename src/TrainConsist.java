/**
 * Train Consist Management App
 *
 * Version 12.0
 * UC12: Safety Compliance Check using Streams
 */

import java.util.ArrayList;
import java.util.List;

// --------------------- GOODS BOGIE CLASS ---------------------

class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

// --------------------- MAIN ---------------------

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));             // valid
        bogies.add(new GoodsBogie("Box", "Grain"));             // valid

        // Uncomment below to test failure case
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));   // invalid

        // Display bogies
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // SAFETY CHECK USING STREAM
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Result
        System.out.println("\nSafety Compliance: " +
                (isSafe ? "SAFE ✅" : "UNSAFE ❌"));
    }
}