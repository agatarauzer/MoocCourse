package exercise101_LibraryInformationSystem;

public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.equals(null) || searched.equals(null)) {
            return false;
        }
        if (word.toUpperCase().contains(searched.toUpperCase().trim())) {
            return true;
        }
        else {
            return false;
        }
    }
}
