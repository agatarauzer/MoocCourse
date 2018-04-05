package exercise103_BirdwatchersDatebase;

public class SearchingModul {
    public static boolean searchingBirdName(String nameInBase, String searchedName) {
        return nameInBase.toUpperCase().contains(searchedName.toUpperCase().trim());
    }
}
