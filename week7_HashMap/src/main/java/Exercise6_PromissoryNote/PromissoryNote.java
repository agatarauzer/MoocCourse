package Exercise6_PromissoryNote;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> note;

    public PromissoryNote() {
        note = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        note.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (note.containsKey(whose)) {
            return note.get(whose);
        }
        else {
            return 0;
        }
    }
}
