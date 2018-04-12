package Exercise9_CarRegistrationCentre;

public class Main {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
        RegistrationPlate reg4 = new RegistrationPlate("D", "B WY-986");

        VehicleRegister vehicles = new VehicleRegister();

        System.out.println(vehicles.add(reg1, "Arturo"));
        System.out.println(vehicles.add(reg2, "Paolo"));
        System.out.println(vehicles.add(reg3, "Damiano"));
        System.out.println(vehicles.add(reg4, "Damiano"));

        vehicles.printRegistrationPlates();
        vehicles.printOwners();
    }
}
