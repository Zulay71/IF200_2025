/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_laboratorio3;

import domain.Bitacora;
import domain.CheckingAccount;
import domain.Client;
import domain.SavingAccount;
import domain.SinpeMobile;

/**
 *
 * @author luzma
 */
public class IF2000_Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Client client1 = new Client("Edgardo", "Corrales", "1-2323-4545", "45456789" , 18, "Cartago");
  
 Client client2 = new Client("Karla", "Lopez", "1-1132-0986", "88860445", 30, "Guapiles"); 
 
SavingAccount account1 = new SavingAccount("2025-09-04", 12, 5.0f, "1000567801", 25000, client1);

CheckingAccount account2 = new CheckingAccount("2000567802", 15000, client2, 0.02);
 
    //Simulation of deposit of 3000colones in the account
    account1.deposit(3000);
    Bitacora.addEvent("Deposit", account1, 3000);

    account1.withdraw(16000);
    Bitacora.addEvent("Withdraw", account1, 16000);

   // SINPE Mobile transfer
        SinpeMobile.transfer(account1, account2, 5000);

  // Apply interests before showing accounts
        account1.interestCalculation();
        account2.interestCalculation();

        // Show accounts
        System.out.println(account1);
        System.out.println(account2);

        // Show transaction log
       System.out.println("\n---- BITÁCORA ----");
       Bitacora.showLog();
    
     
    }   
} 
