/**
 * Train Consist Management App
 *
 * Version 15.0
 * UC15: Safe Cargo Assignment using try-catch-finally
 */

// --------------------- CUSTOM RUNTIME EXCEPTION ---------------------

class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

// --------------------- GOODS BOGIE ---------------------

class GoodsBogie {

    String shape;   // Cylindrical / Rectangular
    String cargo;   // Petroleum / Coal / etc.

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Assign cargo with validation
    public void assignCargo(String cargo) {

        try {
            // Rule: Rectangular cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return shape + " -> " + (cargo != null ? cargo : "No Cargo");
    }
}

// --------------------- MAIN ---------------------

public class TrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE assignment
        b1.assignCargo("Petroleum");

        // UNSAFE assignment
        b2.assignCargo("Petroleum");

        // Continue execution
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}