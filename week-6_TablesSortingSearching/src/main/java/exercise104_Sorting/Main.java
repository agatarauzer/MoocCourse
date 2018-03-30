package exercise104_Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 3,  7, 9, 1, 2, 4};
        System.out.println( Arrays.toString(values) );
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[0])
                smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfSmallest = index;
        int smallest = array[index];

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }
}
