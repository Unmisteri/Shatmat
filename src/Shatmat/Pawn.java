package Shatmat;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <= 7) {
            if ((color.equals("White") && line == 1 && toLine == line + 2 && toColumn == column) ||
                (color.equals("Black") && line == 6 && toLine == line - 2 && toColumn == column) ||
                (color.equals("White") && toLine == line + 1 && toColumn == column) ||
                (color.equals("Black") && toLine == line - 1 && toColumn == column)) {
                this.check = false;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
