package banking;

public interface TransactionInterface {

    double getBalance();

    void credit(double amount);

    void debit(double amount);
}
