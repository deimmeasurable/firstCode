public class Account {
    private String Bank;
    private String customer;
    private AccountType type;

    public Account(String bank, String customer, AccountType type) {
        Bank = bank;
        this.customer = customer;
        this.type = type;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}



