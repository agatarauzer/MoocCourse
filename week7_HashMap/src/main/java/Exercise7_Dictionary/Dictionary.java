package Exercise7_Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<>();
        for (String key: dictionary.keySet()) {
            translations.add(key + " = " + dictionary.get(key));
        }
        return translations;
    }
}
