package banking.model;

import java.util.List;

public class CommercialAccount extends Account{
    private List<Person>  authorizedUser;

    public CommercialAccount(Company company, Long accountNumber, int tpin, double balance) {
        super(company, accountNumber, tpin, balance);
    }
    protected void adAuthorizedUser(Person person)
    {
        this.authorizedUser.add(person);
    }

    protected boolean isAuthorizedUser(Person person)
    {
        Person ps=this.authorizedUser.stream().filter(p->p.getIdNumber()==person.getIdNumber()).findAny().get();
        return null!=ps && 0< ps.getIdNumber();
    }
}
