/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author luzma
 */
public class Piece {

 private final Color color;
  
public enum Color {
    R("Red", "R"),
    B("Black", "B");

  private final String longName;
  private final String shortName;

   Color(String longName, String shortName) {
        this.longName = longName;
        this.shortName = shortName;
        }

   public String display() {
       return longName + " (" + shortName + ")";
   }
 @Override
   public String toString() {
         return shortName;
   }

   public String getLongName() {
         return longName;
  }

   public String getShortName() {
   return shortName;
   }
   }
   public Piece(Color color) {
        this.color = color;
 }
    public Color getColor() {
        return color;
}
@Override
    public String toString() {
         return color.toString();
}
    
}
