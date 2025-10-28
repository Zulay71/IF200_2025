/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author luzma
 */
public class Board {
    public static final int SIZE = 8;
    private final Piece[][] grid;

    public Board() {
        grid = new Piece[SIZE][SIZE];
        initializePositions();     
 }
    
    private void initializePositions() {
        for (int r = 0; r < 3; r++) {
        for (int c = 0; c < SIZE; c++) {
             if ((r + c) % 2 == 1) grid[r][c] = new Piece(Piece.Color.R);           
  }
  }
        for (int r = 5; r < 8; r++) {
        for (int c = 0; c < SIZE; c++) {
             if ((r + c) % 2 == 1) grid[r][c] = new Piece(Piece.Color.B);
             }
   }
   }  
    public boolean inBounds(int r, int c) {
        return r >= 0 && r < SIZE && c >= 0 && c < SIZE;
    }

   public Piece get(int r, int c) {
       if (!inBounds(r, c)) return null;
       return grid[r][c];
   }
   public boolean isEmpty(int r, int c) {
      if (!inBounds(r, c)) return false;
      return grid[r][c] == null;
   }
    
   public boolean moveSimple(int srcR, int srcC, int dstR, int dstC) {
       if (!inBounds(srcR, srcC) || !inBounds(dstR, dstC)) return false;
       Piece p = grid[srcR][srcC];
       if (p == null) return false;
       if (grid[dstR][dstC] != null) return false;
       grid[dstR][dstC] = p;
       grid[srcR][srcC] = null;
       return true;
   }

   public String render() {
      StringBuilder sb = new StringBuilder();
      sb.append("    ");
      for (int c = 1; c <= SIZE; c++) sb.append(c).append(" ");
           sb.append(System.lineSeparator());
           sb.append("   +").append("--".repeat(SIZE)).append("+").append(System.lineSeparator());
      for (int r = 0; r < SIZE; r++) {
           sb.append(String.format("%2d | ", r + 1));
       for (int c = 0; c < SIZE; c++) {
            Piece p = grid[r][c];
            sb.append((p == null ? "." : p.toString())).append(" ");
    }
          sb.append("|").append(System.lineSeparator());
    }
        sb.append("   +").append("--".repeat(SIZE)).append("+").append(System.lineSeparator());
        return sb.toString();
}
    
}
