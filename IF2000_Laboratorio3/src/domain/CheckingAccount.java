/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author luzma
 */
public class CheckingAccount extends Account {
private double interest;   
    private double gainedInterest;  

    public CheckingAccount(String accountNumber, double balance, Client client, double interest) {
        super(accountNumber, balance, client);
        this.interest = interest;
        this.gainedInterest = 0;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        Bitacora.addEvent("Deposit", this, amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            Bitacora.addEvent("Withdrawal", this, amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public double interestCalculation() {
        gainedInterest = (getBalance() * interest) / 12;
        setBalance(getBalance() + gainedInterest);
        return gainedInterest;
    }

    @Override
    public String toString() {
        return "\nCHECKING ACCOUNT INFORMATION:" +
               "\n--------------------------------" +
               "\nAccount Number: " + getAccountNumber() +
               "\nBalance: " + String.format("%.2f", getBalance() - gainedInterest) +   
               "\nInterest: " + (interest * 100) + "%" +
               "\nGained Interest: " + String.format("%.2f", gainedInterest) +
               "\nBalance After Interest: " + String.format("%.2f", getBalance()) +    
               "\nAccount Owner:\n " + getClient().toString() +
               "\n";
    }

    public double getInterestRate() { return interest; }
    public double getGainedInterest() { return gainedInterest; }
}
    

