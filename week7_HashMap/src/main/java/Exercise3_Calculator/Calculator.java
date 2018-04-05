package Exercise3_Calculator;

public class Calculator {
    private Reader reader;
    private static int counter = 0;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                counter++;
            }
            else if (command.equals("difference")) {
                difference();
                counter++;
            }
            else if (command.equals("product")) {
                product();
                counter++;
            }
        }
        statistics();
    }

    private void sum() {
        System.out.print("value 1: ");
        int value1 = reader.readInteger();

        System.out.print("value 2: ");
        int value2 = reader.readInteger();

        System.out.println("sum of the values " + (value1 + value2));
    }

    private void difference() {
        System.out.print("value 1: ");
        int value1 = reader.readInteger();

        System.out.print("value 2: ");
        int value2 = reader.readInteger();

        System.out.println("difference of the values " + (value1 - value2));
    }

    private void product() {
        System.out.print("value 1: ");
        int value1 = reader.readInteger();

        System.out.print("value 2: ");
        int value2 = reader.readInteger();

        System.out.println("product of the values " + (value1 * value2));
    }

    private void statistics() {
        System.out.println("Calculations done: " + counter);
    }
}
