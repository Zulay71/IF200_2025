/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author luzma
 */
public class SinpeMobile {
    /**
     * Simulate a SINPE Móvil transfer from one account to another
     * @param fromAccount source account
     * @param toAccount destination account
     * @param amount amount to transfer
     */
    public static void transfer(Account fromAccount, Account toAccount, double amount) {

        if (fromAccount.getBalance() < amount) {
            System.out.println("Insufficient funds in source account for transfer.");
            return;
        }

        if (fromAccount == null || toAccount == null) {
            System.out.println("One of the accounts is invalid.");
            return;
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        
        Bitacora.addEvent("SINPE Transfer", fromAccount, -amount); 
        Bitacora.addEvent("SINPE Transfer", toAccount, amount);     

        System.out.println("Transfer successful: " + amount + " transferred from " 
                           + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber());
    }
}

