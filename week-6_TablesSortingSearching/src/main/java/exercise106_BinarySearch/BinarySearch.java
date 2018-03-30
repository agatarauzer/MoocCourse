package exercise106_BinarySearch;

public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int startingIndex = 0;
        int endingIndex = array.length - 1;

        while (startingIndex <= endingIndex) {
            int middleIndex = countMiddleIndex(startingIndex, endingIndex);
            if (searchedValue == array[middleIndex]) {
                return true;
            }
            else if (searchedValue > array[middleIndex]) {
                startingIndex = middleIndex + 1;
            }
            else if (searchedValue < array[middleIndex]) {
                endingIndex = middleIndex - 1;
            }
        }
        return false;
    }

    public static int countMiddleIndex(int startingIndex, int endingIndex){
        return  (endingIndex + startingIndex) / 2;
    }
}
