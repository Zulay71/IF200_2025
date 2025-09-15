/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author luzma
 */
public class SavingAccount extends Account  {
  //Atributes
    private String initialDate;
    private int months;
    private float interest;

     //Constructor

    public SavingAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String initialDate, int months, float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    @Override
    public void deposit(double amount) { 
       super.setBalance(this.getBalance()+amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=this.getBalance())
            super.setBalance(this.getBalance()-amount);
        else
            System.out.println("You dont have enough money");
    }

    @Override
    public double interestCalculation() {
      
     double gainedInterest = this.getBalance() * this.getInterest() * this.getMonths();
     return this.getBalance() + gainedInterest;
    
    }//endInterestCalculation

    @Override
    public String toString() {
       
    double gainedInterest = this.getBalance() * (this.getInterest() / 100) * (this.getMonths() / 12.0);
    double balanceAfterInterest = this.getBalance() + gainedInterest;

    String result = "\nAccount Type: SAVING ACCOUNT"
            + "\n--------------------------------"
            + "\nInitial date of account: " + this.getInitialDate()
            + "\nMonths of saving: " + this.getMonths()
            + "\nInterest: " + this.getInterest() + "%"
            + "\nGained Interest: " + String.format("%.2f", gainedInterest)
            + "\nBalance after interest: " + String.format("%.2f", balanceAfterInterest);

    return super.toString() + result;
    
}//endOfToString()
      
}//endClass   

