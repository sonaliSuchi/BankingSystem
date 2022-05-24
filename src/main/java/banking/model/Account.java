package banking.model;

public abstract class Account {
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int tpin;
    private double balance;

    protected Account(AccountHolder accountHolder, Long accountNumber, int tpin, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.tpin = tpin;
        this.balance = balance;
    }

    public AccountHolder getAccountHolder() {
        return this.accountHolder;
    }

    public Long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void creditAccount(double amount)
    {
        this.balance=this.balance+amount;
    }

    public boolean debitAccount(double amount){
        double vBalance=this.balance;
        this.balance=vBalance-amount >= 0?vBalance-amount:this.balance;
        return this.balance!=vBalance;
    }

    public boolean validatePin(int inputPin)
    {
        return this.tpin==inputPin;
    }
}
