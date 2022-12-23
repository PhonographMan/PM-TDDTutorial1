package com.scottgarryfoster;

public class Account
{
    private int balance;
    private int overdraft;

    public int GetBalance()
    {
        return this.balance;
    }

    public void SetBalance(int value)
    {
        if(value >= -overdraft)
        {
            this.balance = value;
        }
    }

    public int GetOverdraft()
    {
        return this.overdraft;
    }

    public void SetOverdraft(int value)
    {
        this.overdraft = value;
    }
}
