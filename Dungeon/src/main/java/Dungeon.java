import java.util.Scanner;

public class Dungeon {
    private Scanner scanner;
    private GameLogic game;

    private static final String NEW_GAME_INFO = "Start game again!";
    private static final String WIN_INFO = "YOU WON!!!";
    private static final String LOST_INFO = "YOU LOST!!!";
    private static final String INSERT_BOARD_VALUES_INFO = "Please insert board values (min 3, max 20 for each).";
    private static final String BOARD_LENGTH = "Board length: ";
    private static final String BOARD_HEIGHT = "Board height: ";
    private static final String BOARD_VALUES_SCOPE_INFO = "Value must be in scope 3-20";
    private static final String PRESS_TO_MOVE_INFO = "Press: ";
    private static final String MAKE_MOVE_UP = "  'w' to go up, ";
    private static final String MAKE_MOVE_DOWN = "  's' to go down, ";
    private static final String MAKE_MOVE_LEFT = "  'a' to go left, ";
    private static final String MAKE_MOVE_RIGHT = "  'd' to go right.";
    private static final String PLAYER_MOVE_INFO = "Your turn: ";


    public Dungeon() {
        scanner = new Scanner(System.in);
    }

    public void play() {
        try {
            printStartingChoices();
        }
        catch (IllegalArgumentException e) {
            System.out.println(NEW_GAME_INFO);
            return;
        }
        printPlayerMoveMenu();
        while (!game.isWon() && !game.isLost()) {
            game.printPawnsPositionNumbers();
            game.printPawnsPositionGraphic();
            chooseMove();
        }
        if(game.isWon()) {
            System.out.println(WIN_INFO);
        }
        else if(game.isLost()) {
            System.out.println(LOST_INFO);
        }
    }

    private void printStartingChoices(){
        System.out.print(INSERT_BOARD_VALUES_INFO);
        System.out.print("\n" + BOARD_LENGTH);
        int length = Integer.parseInt(scanner.nextLine());
        boolean isIncorrectScope = length < 3 || length > 20;
        if (isIncorrectScope) {
            throw new IllegalArgumentException(BOARD_VALUES_SCOPE_INFO);
        }
        System.out.print(BOARD_HEIGHT);
        int height = Integer.parseInt(scanner.nextLine());
        if (isIncorrectScope) {
            throw new IllegalArgumentException(BOARD_VALUES_SCOPE_INFO);
        }

        game = new GameLogic(length, height);
    }

    private void printPlayerMoveMenu() {
        System.out.println("\n" + PRESS_TO_MOVE_INFO);
        System.out.println(MAKE_MOVE_UP);
        System.out.println(MAKE_MOVE_DOWN);
        System.out.println(MAKE_MOVE_LEFT);
        System.out.println(MAKE_MOVE_RIGHT + "\n");
    }

    private void chooseMove() {
        System.out.print(PLAYER_MOVE_INFO);
        String move = scanner.nextLine().toLowerCase();
        int moveX = 0;
        int moveY = 0;
        for(int i = 0; i < move.length(); i++) {
            char moveSymbol = move.charAt(i);
            if (moveSymbol == 'w') {
                moveX += 0;
                moveY += -1;
            }
            else if (moveSymbol == 's') {
                moveX += 0;
                moveY += 1;
            }
            else if (moveSymbol == 'a') {
                moveX += -1;
                moveY += 0;
            }
            else if (moveSymbol == 'd') {
                moveX += 1;
                moveY += 0;
            }
            else {
                moveX += 0;
                moveY += 0;
            }
        }
        game.makeOneTurn(moveX, moveY);
    }
}
