/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author oliva
 */
public abstract class Account {
    
    //Atributes
    private String accountNumber;
    private double balance;
    private Person client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

                
    
    
    public abstract void deposit();
    public abstract void withdraw();
    public abstract void interestCalculation();
    
     @Override
    public String toString() {
        String result = "\nBANK ACCOUNT INFORMATION: "
                + "\n--------------------------------"
                + "\n Account Number = " + this.getAccountNumber()
                + "\n Balance = " + this.getBalance()
                + "\n Cliente = " + this.getClient().toString();
        
        
        return result;
    }//endToString
    

}//endClass
    

     