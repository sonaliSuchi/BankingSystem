package banking;

import banking.model.AccountHolder;

public interface AccountInterface {

    public AccountHolder getAccounteHolder();
    public boolean validatePin(int pin);
    public double getBalance();
    public Long getAccountNumber();
    public void creditAccount(double amount);
    public boolean debitAccount(double amount);
}
