package Exercise8_Airport;

public class Flight {
    private String departureAirport;
    private String destinationAirport;

    public Flight(String departureAirport, String destinationAirport) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String toString() {
        return "(" + departureAirport + "-" + destinationAirport + ")";
    }
}
