package pieces;

public class Piece {

    public enum Color {
        WHITE, BLACK, NO_COLOR;
    }

    public enum Type {
        PAWN('p'),
        ROOK('r'),
        KNIGHT('n'),
        BISHOP('b'),
        QUEEN('q'),
        KING('k'),
        NO_PIECE('x');

        private final char representation;

        Type(char representation) {
            this.representation = representation;
        }

        public char getBlackRepresentation() {
            return Character.toUpperCase(this.representation);
        }

        public char getWhiteRepresentation() {
            return this.representation;
        }
    }

    private final Color color;
    private final Type representation;

    public Piece(Color color, Type representation) {
        this.color = color;
        this.representation = representation;
    }

    private static Piece createWhite(Type type) {
        return new Piece(Color.WHITE, type);
    }

    private static Piece createBlack(Type type) {
        return new Piece(Color.BLACK, type);
    }

    public static Piece createWhitePawn() {
        return createWhite(Type.PAWN);
    }

    public static Piece createBlackPawn() {
        return createBlack(Type.PAWN);
    }

    public static Piece createWhiteKnight() {
        return createWhite(Type.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return createBlack(Type.KNIGHT);
    }

    public static Piece createWhiteRook() {
        return createWhite(Type.ROOK);
    }

    public static Piece createBlackRook() {
        return createBlack(Type.ROOK);
    }

    public static Piece createWhiteBishop() {
        return createWhite(Type.BISHOP);
    }

    public static Piece createBlackBishop() {
        return createBlack(Type.BISHOP);
    }

    public static Piece createWhiteQueen() {
        return createWhite(Type.QUEEN);
    }

    public static Piece createBlackQueen() {
        return createBlack(Type.QUEEN);
    }

    public static Piece createWhiteKing() {
        return createWhite(Type.KING);
    }

    public static Piece createBlackKing() {
        return createBlack(Type.KING);
    }

    public static Piece createBlank() {
        return new Piece(Color.NO_COLOR, Type.NO_PIECE);
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return representation;
    }

    public boolean isWhite() {
        return color.equals(Color.WHITE);
    }

    public boolean isBlack() {
        return color.equals(Color.BLACK);
    }

    public boolean isWhitePawn() {
        return isWhite() && representation == Type.PAWN;
    }

    public boolean isBlackPawn() {
        return isBlack() && representation == Type.PAWN;
    }
}
