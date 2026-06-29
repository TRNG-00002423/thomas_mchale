package com.rev.execptions;

public class CustomDemo {
    private double balance;

    public CustomDemo (double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -=amount;
        System.out.println("Withdraw successful");
    }
}
