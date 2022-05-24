package banking.model;

public abstract  class AccountHolder {

    private int idNumber;

    public AccountHolder(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
