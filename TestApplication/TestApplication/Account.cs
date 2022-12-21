using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestApplication
{
    public class Account
    {
        public int Balance 
        {
            get => balance; 
            set 
            {
                balance = ReturnHighestSafeBalance(balance, value);
            }
        }

        private int balance;

        public int Overdraft;

        private int ReturnHighestSafeBalance(int existingValue, int newValue)
        {
            int safeValue = existingValue;
            if (newValue >= -Overdraft)
            {
                safeValue = newValue;
            }
            else
            {
                safeValue = -Overdraft;
            }

            return safeValue;
        }
    }
}
