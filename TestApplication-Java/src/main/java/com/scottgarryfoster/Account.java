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
        this.balance = ReturnHighestSafeBalance(this.balance, value);
    }

    public int GetOverdraft()
    {
        return this.overdraft;
    }

    public void SetOverdraft(int value)
    {
        this.overdraft = value;
    }

    private int ReturnHighestSafeBalance(int existingValue, int newValue)
    {
        int safeValue = existingValue;
        if (newValue >= -this.overdraft)
        {
            safeValue = newValue;
        }

        return newValue;
    }
}
