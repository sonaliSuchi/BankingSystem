package banking;

import banking.model.Company;
import banking.model.Person;

public interface BankInterface {

    public Long openCommercialAccount(Company company,int pin,double startingDeposit);

    public Long openConsumerAccount(Person person,int pin,double startingDeposit);

    boolean authenticateUser(Long accountNumber,int pin);

    double getBalance(Long accountNumber);

    void credit(Long accountNumber ,double amount);

    boolean debit(Long AccountNumber,double amount);
}
