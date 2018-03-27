public class PlayerBoard extends Board {

    public PlayerBoard(final int lengthOfBoard, final int heightOfBoard) {
        super(lengthOfBoard, heightOfBoard);
        xPosition = 0;
        yPosition = 0;
    }

    public String toString() {
        return "@ " + xPosition + " " + yPosition;
    }

    public void makeMove(int moveX, int moveY) {
        if (isMovePossibleOnBoard(moveX, moveY)) {
            xPosition += moveX;
            yPosition += moveY;
        }
        else
            throw new IllegalArgumentException();
    }

    private boolean isMovePossibleOnBoard(int moveX, int moveY){
        boolean isMoveXPossible = (xPosition + moveX < maxX) && (xPosition + moveX >= 0);
        boolean isMoveYPossible = (yPosition + moveY < maxY) && (yPosition + moveY >= 0);

        return isMoveXPossible && isMoveYPossible;
    }

}
