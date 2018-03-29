import java.util.Random;

public class VampireBoard extends Board {
    private Random random;

    public VampireBoard(final int length, final int height){
        super(length, height);
        random = new Random();
        xPosition = random.nextInt(maxX);
        yPosition = random.nextInt(maxY);
    }

    public String toString(){
        return "v " + xPosition + " " + yPosition;
    }
}
