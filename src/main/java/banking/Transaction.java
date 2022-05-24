package banking;

import banking.impl.Bank;

public class Transaction {

    private Long accountNumber;
    private Bank bank;

    public Transaction(Bank bank,Long accountNumber,int attemptedPin) throws Exception
    {
        this.accountNumber=accountNumber;
        this.bank=bank;
        if(!bank.authenticateUser(accountNumber,attemptedPin))
            throw  new Exception("Not Authenticated");
    }

    public double getBalance()
    {
        return this.bank.getBalance(accountNumber);
    }

    public void credit(double amount)
    {
        this.bank.credit(accountNumber,amount);
    }

    public boolean debit(double amount)
    {
        return this.bank.debit(accountNumber,amount);
    }
}
