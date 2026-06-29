package com.rev.execptions;

public class InsufficientFundsException extends Exception
{
    private double shortFall;

    public InsufficientFundsException(double shortFall)
    {
        super("Withdrawal Failed!");
        this.shortFall = shortFall;
    }

    public double getShortFall()
    {
        return shortFall;
    }
}
