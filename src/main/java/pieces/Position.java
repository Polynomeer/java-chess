package pieces;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(String position) {
        this.x = position.charAt(0) - 'a' + 1;
        this.y = Character.getNumericValue(position.charAt(1));
    }

    public Position(int xPos, int yPos) {
        this.x = xPos + 1;
        this.y = yPos + 1;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public int getXPos() {
        return x - 1;
    }

    public int getYPos() {
        return y - 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Position)) return false;
        Position position = (Position) obj;
        return getX() == position.getX() && getY() == position.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "Position [" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}