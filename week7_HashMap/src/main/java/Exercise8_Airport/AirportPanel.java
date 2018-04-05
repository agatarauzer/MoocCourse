package Exercise8_Airport;

import java.util.Scanner;

class AirportPanel {
    private Airplanes airplanes;

    public AirportPanel() {
        airplanes = new Airplanes();
    }

    public void start(Scanner reader) {
        printHeadline();
        printOperations();
        String input = reader.nextLine();

        while (!input.equals("x")) {
            if (input.equals("1")) {
                addAirplane(reader);
            }
            else if (input.equals("2")) {
                addFlight(reader);
            }
            else {
                System.out.println("Wrong operation, try again!");
            }
            printOperations();
            input = reader.nextLine();
        }
    }

    private void printHeadline() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
    }

    private void printOperations() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print(" > ");
    }

    private void addAirplane(Scanner reader) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        Integer capacity = reader.nextInt();
        reader.nextLine();

        airplanes.addAirplane(planeID, capacity);
    }

    private void addFlight(Scanner reader) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureAirport = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationAirport = reader.nextLine();

        airplanes.addFlight(planeID, departureAirport, destinationAirport);
    }

    public Airplanes getAirplanes() {
        return airplanes;
    }
}
