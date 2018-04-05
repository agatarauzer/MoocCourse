package Exercise8_Airport;

import java.util.Scanner;

public class FlightService {
    private AirportPanel panel;

    public FlightService() {
        panel = new AirportPanel();
    }

    public void start(Scanner reader) {
        panel.start(reader);
        printHeadline();
        printOperations();
        String input = reader.nextLine();

        while (!input.equals("x")) {
            if (input.equals("1")){
                panel.getAirplanes().printAllPlanes();
            }
            else if(input.equals("2")){
                panel.getAirplanes().printFlights();
            }
            else if (input.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                panel.getAirplanes().searchAndPrintPlaneInfo(planeID);
            }
            else {
                System.out.println("Wrong operation, try again!");
            }
            printOperations();
            input = reader.nextLine();
        }
    }

    private void printHeadline() {
        System.out.println("Flight service");
        System.out.println("--------------------");
    }

    private void printOperations(){
        System.out.println("Choose operation:");
        System.out.println("[1] Print airplanes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Exit");
        System.out.print(" > ");
    }
}
