import java.util.ArrayList;
import java.util.List;

public class GameLogic {
    private PlayerBoard player;
    private List<VampireBoard> vampires;
    private int numberOfTurns;
    private int numberOfVampires;
    private final int maxX;
    private final int maxY;

    private static final String KILL_VAMPIRE_INFO = "You have killed the vampire!";
    private static final String OVER_BOARD_INFO = "Player move over the board is not possible! Try again.";
    private static final String VAMPIRES_LEFT_INFO = "Vampires to kill: ";
    private static final String MOVES_LEFT_INFO = "Moves left: ";
    private static final String VAMPIRE_SYMBOL = " v ";
    private static final String PLAYER_SYMBOL = " @ ";
    private static final String POSITION_SYMBOL = " . ";

    public GameLogic(final int length, final int height) {
        maxX = length;
        maxY = height;
        player = new PlayerBoard(length, height);

        numberOfVampires = maxX * maxY / 8;
        numberOfTurns = numberOfVampires + 2;

        vampires = new ArrayList<>();
        vampires = addVampiresOnNotOccupiedPositions();
    }

    private List<VampireBoard> addVampiresOnNotOccupiedPositions() {
        while (vampires.size() < numberOfVampires) {
            VampireBoard vampire = new VampireBoard(maxX, maxY);
            if (!isTheSame(vampire) && !player.equals(vampire)) {
                vampires.add(vampire);
            }
        }
        return vampires;
    }

    private boolean isTheSame(VampireBoard vampire) {
        for(VampireBoard v : vampires){
            if (v.equals(vampire)) {
                return true;
            }
        }
        return false;
    }

    public void makeOneTurn(int moveX, int moveY) {
        try {
            player.makeMove(moveX, moveY);
        }
        catch (IllegalArgumentException e){
            System.out.println(OVER_BOARD_INFO);
        }
        killVampire();
        vampires.clear();
        vampires = addVampiresOnNotOccupiedPositions();
        numberOfTurns--;
    }

    private void killVampire() {
        for(VampireBoard v : vampires) {
            if (player.equals(v)) {
                vampires.remove(v);
                numberOfVampires--;
                System.out.println(KILL_VAMPIRE_INFO);
                break;
            }
        }
    }

    public boolean isWon() {
        return vampires.size() == 0;
    }

    public boolean isLost() {
        return numberOfTurns == 0;
    }

    public void printPawnsPositionNumbers() {
        System.out.println("\n" + VAMPIRES_LEFT_INFO + vampires.size());
        System.out.println(MOVES_LEFT_INFO + numberOfTurns);
        System.out.println(player);
        for(VampireBoard v : vampires)
            System.out.println(v);
    }

    public void printPawnsPositionGraphic() {
        for (int i = 0; i < maxY; i++) {
            for (int j = 0; j < maxX; j++) {
                boolean isPositionOccupied = false;
                for (VampireBoard v : vampires) {
                    if (v.isOnPosition(j, i)) {
                        System.out.print(VAMPIRE_SYMBOL);
                        isPositionOccupied = true;
                    }
                }
                if (player.isOnPosition(j, i)) {
                    System.out.print(PLAYER_SYMBOL);
                    isPositionOccupied = true;
                }
                if (!isPositionOccupied) {
                    System.out.print(POSITION_SYMBOL);
                }
            }
            System.out.println();
        }
    }
}
