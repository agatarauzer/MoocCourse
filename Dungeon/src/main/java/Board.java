import java.util.Objects;

public abstract class Board {
    protected final int maxX;
    protected final int maxY;
    protected int xPosition;
    protected int yPosition;

    public Board(final int maxX, final int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean equals(Object otherObject){
        if(otherObject == null)
            return false;
        if(this == otherObject)
            return true;
        if(!(otherObject instanceof Board ))
            return false;

        Board other = (Board) otherObject;
        return this.xPosition == other.xPosition && this.yPosition == other.yPosition;
    }

    public int hashCode(){
        return Objects.hash(xPosition, yPosition);
    }

    public boolean isOnPosition(int x, int y) {
        return xPosition == x && yPosition == y;
    }
}
