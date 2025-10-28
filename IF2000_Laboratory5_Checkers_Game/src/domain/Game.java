/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author luzma
 */
public class Game {
    
public static class ValidationResult {
private final boolean valid;
private final String message;

public ValidationResult(boolean valid, String message) {
    this.valid = valid;
    this.message = message;
    }
 public boolean isValid() { 
     return valid; }
 public String getMessage() { 
     return message; }
    }

 private final Board board;
 private Piece.Color turn; 

 public Game() {
   board = new Board();
   turn = Piece.Color.R; 
   }

 public Board getBoard() {
     return board;
    }

 public Piece.Color getTurn() {
    return turn;
  }

  private void switchTurn() {
    turn = (turn == Piece.Color.R) ? Piece.Color.B : Piece.Color.R;
   }

 public ValidationResult validateMove(int srcR, int srcC, int dstR, int dstC) {
   if (!board.inBounds(srcR, srcC)) return new ValidationResult(false, "Source position is out of bounds.");
   if (!board.inBounds(dstR, dstC)) return new ValidationResult(false, "Destination position is out of bounds.");

    Piece piece = board.get(srcR, srcC);
    if (piece == null) return new ValidationResult(false, "No piece at source position.");

    if (piece.getColor() != turn) {
       return new ValidationResult(false, "It's not your turn. You must move a '" + turn.name() + "' piece.");
     }

     if (!board.isEmpty(dstR, dstC)) {
        return new ValidationResult(false, "Destination square is occupied.");
     }

     int dr = dstR - srcR;
     int dc = dstC - srcC;

    if (Math.abs(dr) != 1 || Math.abs(dc) != 1) {
        return new ValidationResult(false, "Move must be diagonal and only one square.");
     }

    int expectedDr = (turn == Piece.Color.R) ? +1 : -1;
    if (dr != expectedDr) {
     String dir = (expectedDr > 0) ? "down" : "up";
      return new ValidationResult(false, "Pieces '" + turn.name() + "' can only move diagonally " + dir + ".");
   }

    return new ValidationResult(true, "Valid move.");
   }

 public ValidationResult tryMove(int srcR, int srcC, int dstR, int dstC) {
     ValidationResult check = validateMove(srcR, srcC, dstR, dstC);
     if (!check.isValid()) return check;

    boolean moved = board.moveSimple(srcR, srcC, dstR, dstC);
    if (!moved) {
       return new ValidationResult(false, "Failed to move piece (destination may be occupied).");
      }

    switchTurn();
     return new ValidationResult(true, "Move applied successfully.");
  }
    public ValidationResult tryMove1Based(int srcRow, int srcCol, int dstRow, int dstCol) {
        return tryMove(srcRow - 1, srcCol - 1, dstRow - 1, dstCol - 1);
    }
    
}
