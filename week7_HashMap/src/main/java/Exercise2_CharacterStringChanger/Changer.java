package Exercise2_CharacterStringChanger;

import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        for (int i = 0; i < changes.size(); i++) {
            characterString = changes.get(i).change(characterString);
        }
        return characterString;
    }
}
