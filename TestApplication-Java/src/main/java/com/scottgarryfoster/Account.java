package com.scottgarryfoster;

public class Account
{
    private int Balance;
    private int Overdraft;

    public int GetBalance()
    {
        return 0;
    }

    public void SetBalance(int value)
    {
        Balance = value;
    }

    public int GetOverdraft()
    {
        return Overdraft;
    }

    public void SetOverdraft(int value)
    {
        Overdraft = value;
    }
}
