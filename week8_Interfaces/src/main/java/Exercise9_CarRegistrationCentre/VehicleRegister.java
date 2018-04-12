package Exercise9_CarRegistrationCentre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        Set<Entry<RegistrationPlate, String>> hashSet = owners.entrySet();
        for (Entry entry: hashSet) {
            System.out.println("Registration plate: " + entry.getKey() + "  Owner: " + entry.getValue());
        }
    }

    public void printOwners() {
        ArrayList<String> tempOwners = new ArrayList<>();

        for (RegistrationPlate key: owners.keySet()) {
            String tempOwnerName = owners.get(key);
            if (!tempOwners.contains(tempOwnerName)) {
                tempOwners.add(tempOwnerName);
            }
        }

        for (String name: tempOwners) {
            System.out.println(name);
        }
    }
}


