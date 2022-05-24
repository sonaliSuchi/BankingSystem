package banking.impl;

import banking.BankInterface;
import banking.model.*;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {

    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
        this.accounts = new LinkedHashMap<>();
    }

    private Account getAccount(Long accountNumber)
    {
        return this.accounts.get(accountNumber);
    }


    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
       Long accountNumber=this.accounts.isEmpty()?1l:this.accounts.size()+1;
       CommercialAccount account=new CommercialAccount(company,accountNumber,pin,startingDeposit);
       this.accounts.put(accountNumber,account);
       return account.getAccountNumber();
    }

    @Override
    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        Long accountNumber=this.accounts.isEmpty()?1l:this.accounts.size()+1;
        ConsumerAccount account=new ConsumerAccount(person,accountNumber,pin,startingDeposit);
        this.accounts.put(accountNumber,account);
        return account.getAccountNumber();
    }


    public boolean authenticateUser(Long accountNumber,int pin) {
        return this.accounts.get(accountNumber).validatePin(pin);
    }


    public double getBalance(Long accountNumber) {
        return this.accounts.get(accountNumber).getBalance();
    }


    public void credit(Long accountNumber, double amount) {
        this.accounts.get(accountNumber).creditAccount(amount);
    }


    public boolean debit(Long accountNumber, double amount) {
        return this.accounts.get(accountNumber).debitAccount(amount);
    }
}
