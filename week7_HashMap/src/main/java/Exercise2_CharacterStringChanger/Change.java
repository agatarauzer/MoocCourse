package Exercise2_CharacterStringChanger;

public class Change {
    private char oldCharacter;
    private char newCharacter;

    public Change(char fromCharacter, char toCharacter) {
        oldCharacter = fromCharacter;
        newCharacter = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(oldCharacter, newCharacter);
    }
}
