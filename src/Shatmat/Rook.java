package Shatmat;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <=7 && toColumn >= 0 && toColumn <= 7){
            if ((toLine == line + 1 && toColumn == column) || (toLine == line && toColumn == column + 1) ||
                    (toLine == line + 2 && toColumn == column) || (toLine == line && toColumn == column + 2) ||
                    (toLine == line + 3 && toColumn == column) || (toLine == line && toColumn == column + 3) ||
                    (toLine == line + 4 && toColumn == column) || (toLine == line && toColumn == column + 4) ||
                    (toLine == line + 5 && toColumn == column) || (toLine == line && toColumn == column + 5) ||
                    (toLine == line + 6 && toColumn == column) || (toLine == line && toColumn == column + 6) ||
                    (toLine == line + 7 && toColumn == column) || (toLine == line && toColumn == column + 7) ||
                    (toLine == line - 1 && toColumn == column) || (toLine == line && toColumn == column - 1) ||
                    (toLine == line - 2 && toColumn == column) || (toLine == line && toColumn == column - 2) ||
                    (toLine == line - 3 && toColumn == column) || (toLine == line && toColumn == column - 3) ||
                    (toLine == line - 4 && toColumn == column) || (toLine == line && toColumn == column - 4) ||
                    (toLine == line - 5 && toColumn == column) || (toLine == line && toColumn == column - 5) ||
                    (toLine == line - 6 && toColumn == column) || (toLine == line && toColumn == column - 6) ||
                    (toLine == line - 7 && toColumn == column) || (toLine == line && toColumn == column - 7)){
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
        return "R";
    }
}
