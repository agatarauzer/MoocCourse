import java.util.ArrayList;
import java.util.List;

public class GameLogic {
    private PlayerBoard player;
    private List<VampireBoard> vampires;
    private int numberOfTurns;
    private int numberOfVampires;
    private final int maxX;
    private final int maxY;

    public GameLogic(final int lengthOfBoard, final int heightOfBoard) {
        maxX = lengthOfBoard;
        maxY = heightOfBoard;
        player = new PlayerBoard(lengthOfBoard, heightOfBoard);

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
            if (v.equals(vampire))
                return true;
        }
        return false;
    }

    public void makeOneTurn(int moveX, int moveY) {
        try {
            player.makeMove(moveX, moveY);
        }
        catch (IllegalArgumentException e){
            System.out.println("Player move over the board is not possible! Try again.");
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
                System.out.println("You have killed the vampire!");
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
        System.out.println("\nVampires to kill: " + vampires.size());
        System.out.println("Moves left: " + numberOfTurns);
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
                        System.out.print(" v ");
                        isPositionOccupied = true;
                    }
                }
                if (player.isOnPosition(j, i)) {
                    System.out.print(" @ ");
                    isPositionOccupied = true;
                }
                if (!isPositionOccupied) {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
