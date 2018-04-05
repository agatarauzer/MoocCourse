package Exercise8_Airport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        FlightService myPanel = new FlightService();
        myPanel.start(reader);
    }
}
