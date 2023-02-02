package Shatmat;

public class Horse extends ChessPiece{
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <=7 && toColumn >= 0 && toColumn <= 7){
            if ((toLine == line + 2 && toColumn == column + 1) || (toLine == line + 2 && toColumn == column - 1) ||
                (toLine == line - 2 && toColumn == column - 1) || (toLine == line - 2 && toColumn == column + 1) ||
                (toColumn == column + 2 && toLine == line + 1) || (toColumn == column - 2 && toLine == line + 1) ||
                (toColumn == column + 2 && toLine == line - 1) || (toColumn == column - 2 && toLine == line - 1)){
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
        return "H";
    }
}
