package Exercise1_Smileys;

public class Smileys {
    public static void main(String[] args) {
        printWithSmileys("\\:D/");
        printWithSmileys("Ala ma kota");
    }

   private static void printWithSmileys(String characterString){
        int length = characterString.length();
        printOnlySmilesLine(length);

        if (checkIfOdd(length)) {
            System.out.println(":) " + characterString + "  :)");
        }
        else {
            System.out.println(":) " + characterString + " :)");
        }
        printOnlySmilesLine(length);
    }

    private static void printOnlySmilesLine(int length) {
        int lengthOfLine;

        if (checkIfOdd(length)) {
            lengthOfLine = length / 2 + 4;
        }
        else {
            lengthOfLine = length / 2 + 3;
        }

        for (int i = 0; i < lengthOfLine; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    private static boolean checkIfOdd(int length) {
        return length % 2 != 0;
    }
}
