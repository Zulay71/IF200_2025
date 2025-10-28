/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_laboratory5_checkers_game;
import domain.Game;
import java.util.Scanner;
/**
 *
 * @author luzma
 */
public class IF2000_Laboratory5_Checkers_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Game();
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Welcome to the Checkers Game!");
        System.out.println("Player R moves down, Player B moves up.");
        System.out.println("Enter rows and columns as numbers from 1 to 8.");
        System.out.println("Enter -1 at any time to exit the game.\n");
       
        while (true) {
            System.out.println(game.getBoard().render());
            System.out.println("Turn: " + game.getTurn().display());
            
            System.out.print("Enter source row (1-8, or -1 to exit): ");
            int sr = sc.nextInt();
            if (sr == -1) break;
            
            System.out.print("Enter source column (1-8): ");
            int scCol = sc.nextInt();

            System.out.print("Enter destination row (1-8): ");
            int dr = sc.nextInt();

            System.out.print("Enter destination column (1-8): ");
            int dc = sc.nextInt();
            
            Game.ValidationResult result = game.tryMove1Based(sr, scCol, dr, dc);
            System.out.println(result.getMessage());
        }
        System.out.println("Game exited. Thank you for playing!");
    }
    }
    

