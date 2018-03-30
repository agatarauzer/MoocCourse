package exercise98_ArrayReversingCoping;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        int[] original2 = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original2);

        // print both
        System.out.println("original: " + Arrays.toString(original2));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array){
        int size = array.length;
        int[] copyOfArray = new int[size];

        for (int i = 0; i < size; i++){
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }

    public static int[] reverseCopy(int[] array){
        int size = array.length;
        int[] reverseCopyOfArray = new int[size];

        for (int i = size - 1, j = 0; i >= 0; i--, j++){
            reverseCopyOfArray[j] = array[i];
        }

        return reverseCopyOfArray;
    }
}
