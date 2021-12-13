package bankApp;

public class Account {
    private String name;
    private String pin;
    private int balance;

    public Account(String accountName, String accountPin) {
        name = accountName;
        pin = accountPin;
        balance = 50_000;

    }

    public String getaccountName() {
        return name;
    }

    public int getbalance(String accountPin) {
        return balance;
    }

    public int deposit(int amount) {

        if (amount > 0) {
            balance = balance + amount;

        }
        return balance;
    }


    public void withdrawal(int amount, String accountPin) {
        if (amount > 0) {
            balance = balance - amount;

        }
    }

    public void withdrawalExtendedLimit(int amount, String accountPin) {
        if(amount<0){
            balance = amount - balance;
        }
    }
}

