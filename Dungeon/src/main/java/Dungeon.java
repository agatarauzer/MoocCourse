import java.util.Scanner;

public class Dungeon {
    private Scanner scanner;
    private GameLogic game;

    public Dungeon() {
        scanner = new Scanner(System.in);
    }

    public void play() {
        try {
            printStartingChoices();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Start game again!");
            return;
        }

        printPlayerMoveMenu();
        while (!game.isWon() && !game.isLost()) {
            game.printPawnsPositionNumbers();
            game.printPawnsPositionGraphic();
            chooseMove();
        }
        if(game.isWon()) {
            System.out.println("YOU WON!!!");
        }
        else if(game.isLost()) {
            System.out.println("YOU LOST!!!");
        }
    }

    private void printStartingChoices(){
        System.out.print("Please insert board values (min 2, max 20 for each). \nBoard length: ");
        int length = Integer.parseInt(scanner.nextLine());
        if (length < 2 || length > 20) {
            throw new IllegalArgumentException("Value must be in scope 2-20");
        }
        System.out.print("Board height: ");
        int height = Integer.parseInt(scanner.nextLine());
        if (height < 2 || height > 20) {
            throw new IllegalArgumentException("Value must be in scope 2-20");
        }

        game = new GameLogic(length, height);
    }

    private void printPlayerMoveMenu() {
        System.out.println("\nPress: ");
        System.out.println("  'w' to go up, ");
        System.out.println("  's' to go down, ");
        System.out.println("  'a' to go left, ");
        System.out.println("  'd' to go right. \n");
    }

    private void chooseMove() {
        System.out.print("Your turn: ");
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
