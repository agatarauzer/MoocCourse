package Exercise8_Airport;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private String planeId;
    private int capacity;
    private List<Flight> flights;

    public Airplane(String planeId, int capacity) {
        this.planeId = planeId;
        this.capacity = capacity;
        flights = new ArrayList<>();
    }

    public void addFlight(String departureAirport, String destinationAirport) {
        flights.add(new Flight(departureAirport, destinationAirport));
    }

    public String getPlaneId() {
        return planeId;
    }
    public List getFlights() {
        return flights;
    }

    public void printPlaneInfo() {
        System.out.print(planeId + " (" + capacity + " ppl) ");
    }

    public void printPlaneAndFlights() {
        for (Flight flight : flights) {
            printPlaneInfo();
            System.out.print(flight);
        }
    }
}
