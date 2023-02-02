package Shatmat;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <=7 && toColumn >= 0 && toColumn <= 7){
            if ((toLine == line + 1 && toColumn == column) || (toLine == line - 1 && toColumn == column) ||
                    (toLine == line && toColumn == column + 1) || (toLine == line && toColumn == column - 1) ||
                    (toLine == line + 1 && toColumn == column + 1) || (toLine == line + 1 && toColumn == column - 1) ||
                    (toLine == line - 1 && toColumn == column + 1) || (toLine == line - 1 && toColumn == column - 1)){
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
        return "K";
    }
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (line >= 0 && line <=7 && column >= 0 && column <= 7) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }
}