package Exercise10_NationalService;


public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
