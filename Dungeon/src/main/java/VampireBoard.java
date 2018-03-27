import java.util.Random;

public class VampireBoard extends Board {
    private Random random;

    public VampireBoard(final int lengthOfBoard, final int heightOfBoard){
        super(lengthOfBoard, heightOfBoard);
        random = new Random();
        xPosition = random.nextInt(maxX);
        yPosition = random.nextInt(maxY);
    }

    public String toString(){
        return "v " + xPosition + " " + yPosition;
    }
}
