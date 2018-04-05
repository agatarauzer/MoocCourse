package Exercise8_Airport;

import java.util.ArrayList;
import java.util.List;

public class Airplanes {
    private List<Airplane> airplanes;

    public Airplanes() {
        airplanes = new ArrayList<>();
    }

    public void addAirplane(String id, Integer capacity) {
        airplanes.add(new Airplane(id, capacity));
    }

    public void addFlight(String id, String departureAirport, String destinationAirport) {
        boolean isFound = false;
        for (Airplane airplane : airplanes) {
            if (airplane.getPlaneId().equals(id)) {
                airplane.addFlight(departureAirport, destinationAirport);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Airplane was not found! You cannot add flight.");
        }
    }

    public void searchAndPrintPlaneInfo(String id) {
        boolean isFound = false;
        for (Airplane airplane : airplanes) {
            if (airplane.getPlaneId().equals(id)) {
                airplane.printPlaneInfo();
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Airplane was not found!");
        }
    }

    public void printAllPlanes() {
        for (Airplane airplane : airplanes) {
            airplane.printPlaneInfo();
            System.out.println();
        }
    }

    public void printFlights() {
        for (Airplane airplane : airplanes) {
            airplane.printPlaneAndFlights();
            System.out.println();
        }
    }
}
