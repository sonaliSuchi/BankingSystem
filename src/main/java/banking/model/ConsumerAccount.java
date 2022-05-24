package banking.model;

public class ConsumerAccount extends Account{
    public ConsumerAccount(Person person, Long accountNumber, int tpin, double balance) {
        super(person, accountNumber, tpin, balance);
    }
}
