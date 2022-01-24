public class Customer {
    private String name;
    private  Account hisAccount;

    public Customer(String name, Account hisAccount) {
        this.name = name;
        this.hisAccount = hisAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getHisAccount() {
        return hisAccount;
    }

    public void setHisAccount(Account hisAccount) {
        this.hisAccount = hisAccount;
    }
}
